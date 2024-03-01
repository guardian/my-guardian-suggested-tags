import com.gu.contentapi.client.GuardianContentClient
import com.gu.contentapi.client.model.ItemQuery

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

case class ApiError(message: String) extends Error

// expand this so it can check sections too
class TagSectionChecker(client: GuardianContentClient) {

  val supportedTags = List(
    "type",
    "contributor",
    "tone",
    "keyword",
    "series",
    "tracking",
    "paid-content",
    "campaign"
  ).mkString(",")

  def checkSection(id: String): Future[Either[ApiError, String]] = {
    val capiResponse = client.getResponse(ItemQuery(id))
    capiResponse
      .map(response => Right(response.section.mkString(",")))
      .recover { case e =>
        Left(
          ApiError(message =
            s"Could not find section $id in Content API. ${e.getMessage}"
          )
        )
      }
  }

  def checkSections(
      sections: Seq[String]
  ): Seq[Future[Either[ApiError, String]]] = {
    sections.map(id => checkSection(id))
  }

  def checkTag(id: String): Future[Either[ApiError, String]] = {
    val capiResponse = client.getResponse(ItemQuery(id).showTags(supportedTags))
    capiResponse.map(response => Right(response.tag.mkString(","))).recover {
      case e =>
        Left(
          ApiError(message =
            s"Could not find tag $id in Content API. ${e.getMessage}"
          )
        )
    }
  }

  def checkTags(tags: Seq[String]): Seq[Future[Either[ApiError, String]]] = {
    tags.map(id => checkTag(id))
  }
}
