import ArtAndDesignCollection.artAndDesignCollection
import BooksCollection.booksCollection
import BusinessCollection.businessCollection
import CultureCollection.cultureCollection
import EnvironmentCollection.environmentCollection
import FilmCollection.filmCollection
import FoodCollection.foodCollection
import FootballCollection.footballCollection
import LifestyleCollection.lifestyleCollection
import MoneyAndFinanceCollection.moneyAndFinanceCollection
import MusicCollection.musicCollection
import NewsCollection.newsCollection
import OpinionCollection.opinionCollection
import ScienceCollection.scienceCollection
import SportsCollection.sportCollection
import TVAndRadioCollection.tvAndRadioCollection
import TechnologyCollection.technologyCollection
import io.circe.{Encoder, Json}
import io.circe.generic.auto._
import io.circe.generic.semiauto.deriveEncoder
import io.circe.syntax._

import java.nio.file.{Files, Paths, StandardOpenOption}

case class SuggestedTagCollection(
    fileName: String,
    tagCollections: Seq[TagCategory]
)
case class TagCategory(displayTitle: String, tags: Seq[SuggestedTag])

case class SuggestedTag(
    displayName: String,
    id: String,
    `type`: SupportedTagType
)

// need to add more tag types we support here
sealed trait SupportedTagType
case object Topic extends SupportedTagType
case object Section extends SupportedTagType
case object Series extends SupportedTagType
case object Contributor extends SupportedTagType

object SupportedTagType {
  implicit val encoder: Encoder[SupportedTagType] =
    Encoder.encodeString.contramap[SupportedTagType](_.toString.toLowerCase)
}

object SuggestedTag {
  implicit val encoder: Encoder[SuggestedTag] =
    deriveEncoder[SuggestedTag].mapJson { json =>
      json.hcursor
        .downField("type")
        .withFocus(
          _.mapObject(
            _.add(
              "type",
              Json.fromString(
                json.hcursor.downField("type").as[String].getOrElse("")
              )
            )
          )
        )
        .top
        .getOrElse(json)
    }
}

object SuggestedTags {

  lazy val allTags: Seq[SuggestedTagCollection] = Seq(tags)

  // we could add more, such as "us" and append to the allTags Seq
  val tags: SuggestedTagCollection = SuggestedTagCollection(
    fileName = "uk",
    tagCollections = Seq(
      newsCollection,
      opinionCollection,
      footballCollection,
      sportCollection,
      businessCollection,
      lifestyleCollection,
      foodCollection,
      environmentCollection,
      cultureCollection,
      filmCollection,
      musicCollection,
      booksCollection,
      tvAndRadioCollection,
      artAndDesignCollection,
      technologyCollection,
      moneyAndFinanceCollection,
      scienceCollection
    )
  )

  def writeTagsToJson(suggestedTagCollection: SuggestedTagCollection): Unit = {
    val json = suggestedTagCollection.tagCollections.asJson
    val outputDir = "dist"
    val filePath = s"$outputDir/${suggestedTagCollection.fileName}.json"

    // Create the output directory if it doesn't exist
    val outputDirPath = Paths.get(outputDir)
    if (!Files.exists(outputDirPath)) {
      Files.createDirectories(outputDirPath)
    }

    // Delete existing file if it exists
    val file = Paths.get(filePath)
    if (Files.exists(file)) {
      Files.delete(file)
    }

    // Write JSON to file
    Files.write(file, json.spaces2.getBytes, StandardOpenOption.CREATE)
    println(s"${suggestedTagCollection.fileName} written successfully")
  }
}
