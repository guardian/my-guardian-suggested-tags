import com.gu.contentapi.client.GuardianContentClient

import java.util.concurrent.TimeUnit
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

// works, make it more helpful by telling you what the error is. i.e is it an invalid API key? Cos that's whst was happening before!
object Main {
  def main(args: Array[String]): Unit = {

    val apiKey = System.getenv("API_KEY")
    if (apiKey.isEmpty)
      throw new RuntimeException(
        "No API key for the CAPI client found. Check your environment variables."
      )

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
        .result(
          Future.sequence(tagResults),
          Duration(10, TimeUnit.SECONDS)
        )
        .collect { case Left(error) => error }

      val sectionErrors = Await
        .result(
          Future.sequence(sectionResults),
          Duration(30, TimeUnit.SECONDS)
        )
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
