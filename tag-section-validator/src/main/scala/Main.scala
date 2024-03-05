import com.gu.contentapi.client.GuardianContentClient

import java.util.concurrent.TimeUnit
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

object Main {
  def main(args: Array[String]): Unit = {

    val apiKey = System.getenv("API_KEY")
    if (apiKey.isEmpty)
      throw new RuntimeException(
        "No API key for the CAPI client found. Check your environment variables."
      )

    val TIMEOUT_DURATION = Duration(60, TimeUnit.SECONDS)

    val client = new GuardianContentClient(apiKey)
    val tagSectionChecker = new TagSectionChecker(client)

    val allErrors = SuggestedTags.allTags.flatMap { tagCollection =>
      val allTagIds = tagCollection.tagCollections
        .flatMap(_.tags.filter(t => t.`type` != Section))
        .map(_.id)

      val allSectionIds = tagCollection.tagCollections
        .flatMap(_.tags.filter(t => t.`type` == Section))
        .map(_.id)

      val tagResults = tagSectionChecker.checkTags(allTagIds)
      val sectionResults = tagSectionChecker.checkSections(allSectionIds)

      val tagErrors = Await
        .result(Future.sequence(tagResults), TIMEOUT_DURATION)
        .collect { case Left(error) => error }

      val sectionErrors = Await
        .result(Future.sequence(sectionResults), TIMEOUT_DURATION)
        .collect { case Left(error) => error }

      tagErrors ++ sectionErrors
    }

    if (allErrors.nonEmpty) {
      val errorMessages = allErrors.map(_.message).mkString(", ")
      throw new Exception(s"Errors encountered: $errorMessages")
    } else {
      SuggestedTags.allTags.foreach { tagCollection =>
        SuggestedTags.writeTagsToJson(tagCollection)
      }
    }
  }
}
