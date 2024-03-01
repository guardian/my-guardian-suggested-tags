sealed trait TagData

object NewsCollection extends TagData {

  val newsTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("US news", "us-news", Section),
    SuggestedTag("UK news", "uk/uk", Topic),
    SuggestedTag("Australia news", "australia-news", Section),
    SuggestedTag("US politics", "us-news/us-politics", Topic),
    SuggestedTag("UK politics", "politics", Topic),
    SuggestedTag(
      "Australia politics",
      "australia-news/australian-politics",
      Topic
    ),
    SuggestedTag("Conservatives", "politics/conservatives", Topic),
    SuggestedTag("Labour", "politics/labour", Topic),
    SuggestedTag("Rishi Sunak", "politics/rishi-sunak", Topic),
    SuggestedTag("Donald Trump", "us-news/donaldtrump", Topic),
    SuggestedTag("Joe Biden", "us-news/joebiden", Topic),
    SuggestedTag("Foreign policy", "politics/foreignpolicy", Topic),
    SuggestedTag("Trade unions", "politics/tradeunions", Topic),
    SuggestedTag("Education", "education", Topic),
    SuggestedTag("Society", "society", Topic),
    SuggestedTag("Global development", "global-development", Topic),
    SuggestedTag("Human rights", "law/human-rights", Topic),
    SuggestedTag("Law", "law", Topic),
    SuggestedTag("Ukraine", "world/ukraine", Topic)
  )

  val newsCollection: TagCategory =
    TagCategory(displayTitle = "News", tags = newsTags)

}

object OpinionCollection extends TagData {
  val opinionTags: Seq[SuggestedTag] = Seq(
    SuggestedTag(
      "The heat or eat diaries",
      "commentisfree/series/the-heat-or-eat-diaries",
      Series
    ),
    SuggestedTag("Why I quit", "commentisfree/series/why-i-quit", Series),
    SuggestedTag("The Guardian view", "profile/editorial", Series),
    SuggestedTag(
      "Living with AI",
      "commentisfree/series/living-with-ai",
      Series
    ),
    SuggestedTag(
      "First Dog on the Moon",
      "commentisfree/series/first-dog-on-the-moon",
      Series
    ),
    SuggestedTag("George Monbiot", "profile/georgemonbiot", Contributor),
    SuggestedTag(
      "Aditya Chakrabortty",
      "profile/adityachakrabortty",
      Contributor
    ),
    SuggestedTag("Marina Hyde", "profile/marinahyde", Contributor),
    SuggestedTag("Zoe Williams", "profile/zoewilliams", Contributor),
    SuggestedTag("Polly Toynbee", "profile/pollytoynbee", Contributor),
    SuggestedTag("Frances Ryan", "profile/frances-ryan", Contributor),
    SuggestedTag("Owen Jones", "profile/owen-jones", Contributor),
    SuggestedTag(
      "Jonathan Freedland",
      "profile/jonathanfreedland",
      Contributor
    ),
    SuggestedTag("Simon Jenkins", "profile/simonjenkins", Contributor),
    SuggestedTag("Martin Kettle", "profile/martinkettle", Contributor),
    SuggestedTag("Afua Hirsch", "profile/afuahirsch", Contributor),
    SuggestedTag("Timothy Garton Ash", "profile/timothygartonash", Contributor),
    SuggestedTag("Gaby Hinsliff", "profile/gabyhinsliff", Contributor),
    SuggestedTag("John Harris", "profile/johnharris", Contributor),
    SuggestedTag("Charlotte Higgins", "profile/charlottehiggins", Contributor),
    SuggestedTag("Rafael Behr", "profile/rafaelbehr", Contributor),
    SuggestedTag("Nesrine Malik", "profile/nesrinemalik", Contributor)
  )

  val opinionCollection: TagCategory =
    TagCategory(displayTitle = "Opinion", tags = opinionTags)
}

object FootballCollection extends TagData {
  val footballTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Football", "football", Section),
    SuggestedTag("Premier League", "football/premierleague", Topic),
    SuggestedTag("Champions League", "football/championsleague", Topic),
    SuggestedTag("Serie A", "football/serieafootball", Topic),
    SuggestedTag("Bundesliga", "football/bundesligafootball", Topic),
    SuggestedTag("WSL", "football/womens-super-league", Topic),
    SuggestedTag("Women's football", "football/womensfootball", Topic),
    SuggestedTag("World cup", "football/world-cup-football", Topic),
    SuggestedTag("Manchester United", "football/manchester-united", Topic),
    SuggestedTag("Manchester City", "football/manchestercity", Topic),
    SuggestedTag("Chelsea", "football/chelsea", Topic),
    SuggestedTag("Liverpool", "football/liverpool", Topic),
    SuggestedTag("European football", "football/europeanfootball", Topic),
    SuggestedTag("Tottenham Hotspur", "football/tottenham-hotspur", Topic),
    SuggestedTag("Arsenal", "football/arsenal", Topic),
    SuggestedTag("Newcastle United", "football/newcastleunited", Topic),
    SuggestedTag("England", "football/england", Topic),
    SuggestedTag("Women's world cup", "football/womens-world-cup", Topic),
    SuggestedTag(
      "England women's football team",
      "football/england-womens-football-team",
      Topic
    ),
    SuggestedTag("FA cup", "football/fa-cup", Topic),
    SuggestedTag("Football weekly", "football/series/footballweekly", Series),
    SuggestedTag("Transfer window", "football/transfer-window", Topic)
  )

  val footballCollection: TagCategory =
    TagCategory(displayTitle = "Football", tags = footballTags)
}

object SportsCollection extends TagData {
  val sportTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Australia sport", "sport/australia-sport", Topic),
    SuggestedTag("US sport", "sport/us-sport", Topic),
    SuggestedTag("Cricket", "sport/cricket", Topic),
    SuggestedTag("Rugby union", "sport/rugby-union", Topic),
    SuggestedTag("Tennis", "sport/tennis", Topic),
    SuggestedTag("England cricket team", "sport/england-cricket-team", Topic),
    SuggestedTag(
      "Australia cricket team",
      "sport/australia-cricket-team",
      Topic
    ),
    SuggestedTag("NFL", "sport/nfl", Topic),
    SuggestedTag("Golf", "sport/golf", Topic),
    SuggestedTag("Basketball", "sport/basketball", Topic),
    SuggestedTag("Motor sports", "sport/motorsports", Topic),
    SuggestedTag(
      "England rugby union team",
      "sport/england-rugby-union-team",
      Topic
    ),
    SuggestedTag("Horse racing", "sport/horse-racing", Topic),
    SuggestedTag("Rugby league", "sport/rugbyleague", Topic),
    SuggestedTag("Ashes", "sport/ashes", Topic),
    SuggestedTag("Formula One", "sport/formulaone", Topic),
    SuggestedTag("Cycling", "sport/cycling", Topic),
    SuggestedTag("Olympic Games", "sport/olympic-games", Topic),
    SuggestedTag("NBA", "sport/nba", Topic),
    SuggestedTag("Athletics", "sport/athletics", Topic),
    SuggestedTag("Boxing", "sport/boxing", Topic),
    SuggestedTag("Wimbledon", "sport/wimbledon", Topic),
    SuggestedTag("AFL", "sport/afl", Topic),
    SuggestedTag("Six Nations", "sport/sixnations", Topic),
    SuggestedTag("Australian Open", "sport/australian-open", Topic),
    SuggestedTag("Novak Djokovic", "sport/novak-djokovic", Topic),
    SuggestedTag("Women's cricket", "sport/womenscricket", Topic),
    SuggestedTag("PGA Tour", "sport/pga-tour", Topic),
    SuggestedTag("Horse racing tips", "sport/horse-racing-tips", Topic),
    SuggestedTag("India cricket team", "sport/indiacricketteam", Topic),
    SuggestedTag("Twenty20", "sport/twenty20", Topic),
    SuggestedTag("Winter Olympics", "sport/winter-olympics", Topic),
    SuggestedTag(
      "Australia rugby union team",
      "sport/australia-rugby-union-team",
      Topic
    ),
    SuggestedTag("Baseball", "sport/baseball", Topic),
    SuggestedTag("Over By over reports", "sport/over-by-over-reports", Topic),
    SuggestedTag("NRL", "sport/nrl", Topic),
    SuggestedTag("Lewis Hamilton", "sport/lewis-hamilton", Topic),
    SuggestedTag("Premier League", "football/premierleague", Topic),
    SuggestedTag("US Open Tennis", "sport/usopentennis", Topic),
    SuggestedTag("MLB", "sport/mlb", Topic),
    SuggestedTag("European Tour", "sport/european-tour", Topic),
    SuggestedTag("Yorkshire", "sport/yorkshire", Topic),
    SuggestedTag("T20 World Cup", "sport/worldtwenty20", Topic),
    SuggestedTag("Sport politics", "sport/sport-politics", Topic)
  )

  val sportCollection: TagCategory =
    TagCategory(displayTitle = "Sport", tags = sportTags)
}

object BusinessCollection extends TagData {

  val businessTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Business", "business", Section),
    SuggestedTag("Economics", "business/economics", Topic),
    SuggestedTag(
      "Cost of living crisis",
      "business/cost-of-living-crisis",
      Topic
    ),
    SuggestedTag("Retail", "business/retail", Topic),
    SuggestedTag("Energy industry", "business/energy-industry", Topic),
    SuggestedTag("Inflation", "business/inflation", Topic),
    SuggestedTag("Australia economy", "business/australia-economy", Topic),
    SuggestedTag("Food & drink industry", "business/fooddrinks", Topic),
    SuggestedTag("Banking", "business/banking", Topic),
    SuggestedTag("Stock markets", "business/stock-markets", Topic),
    SuggestedTag("Oil", "business/oil", Topic),
    SuggestedTag("Commodities", "business/commodities", Topic),
    SuggestedTag("Gas", "business/gas", Topic),
    SuggestedTag("Airline industry", "business/theairlineindustry", Topic),
    SuggestedTag("Supermarkets", "business/supermarkets", Topic),
    SuggestedTag("Bank of England", "business/bankofenglandgovernor", Topic),
    SuggestedTag("Oil and gas companies", "business/oilandgascompanies", Topic),
    SuggestedTag("Interest rates", "business/interest-rates", Topic),
    SuggestedTag("Regulators", "business/regulators", Topic)
  )

  val businessCollection: TagCategory =
    TagCategory(displayTitle = "Business", tags = businessTags)

}

object LifestyleCollection extends TagData {
  val lifestyleTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Lifestyle", "lifeandstyle", Section),
    SuggestedTag("Family", "lifeandstyle/family", Topic),
    SuggestedTag(
      "Health and wellbeing",
      "lifeandstyle/health-and-wellbeing",
      Topic
    ),
    SuggestedTag("Women", "lifeandstyle/women", Topic),
    SuggestedTag("Fashion", "fashion/fashion", Topic),
    SuggestedTag("Beauty", "fashion/beauty", Topic),
    SuggestedTag("Men's fashion", "fashion/mens-fashion", Topic),
    SuggestedTag("Relationships", "lifeandstyle/relationships", Topic),
    SuggestedTag("Gardens", "lifeandstyle/gardens", Topic),
    SuggestedTag("Pets", "lifeandstyle/pets", Topic),
    SuggestedTag("Homes", "lifeandstyle/homes", Topic),
    SuggestedTag("Sex", "lifeandstyle/sex", Topic),
    SuggestedTag("Gardening advice", "lifeandstyle/gardens", Topic),
    SuggestedTag("Fitness", "lifeandstyle/fitness", Topic),
    SuggestedTag("Sudoku", "lifeandstyle/series/sudoku", Topic),
    SuggestedTag(
      "Why am I like this",
      "wellness/series/why-am-i-like-this-",
      Topic
    ),
    SuggestedTag(
      "A moment that changed me",
      "lifeandstyle/series/a-moment-that-changed-me",
      Topic
    ),
    SuggestedTag("Pass notes", "news/series/pass-notes", Topic),
    SuggestedTag("How we met", "lifeandstyle/series/how-we-met", Topic),
    SuggestedTag("Ask Phillipa", "lifeandstyle/series/ask-philippa", Topic),
    SuggestedTag("Sexual Healing", "lifeandstyle/series/sexualhealing", Topic),
    SuggestedTag("The experts", "lifeandstyle/series/the-experts", Topic),
    SuggestedTag(
      "Notes and queries",
      "lifeandstyle/series/notes-and-queries",
      Topic
    ),
    SuggestedTag("Walking", "lifeandstyle/walking", Topic),
    SuggestedTag("Dogs", "lifeandstyle/dogs", Topic),
    SuggestedTag("Pregnancy", "lifeandstyle/pregnancy", Topic),
    SuggestedTag("Dating", "lifeandstyle/dating", Topic),
    SuggestedTag("Hobbies", "lifeandstyle/hobbies", Topic),
    SuggestedTag("Interiors", "lifeandstyle/interiors", Topic),
    SuggestedTag("Celebrity", "lifeandstyle/celebrity", Topic),
    SuggestedTag("Marriage", "lifeandstyle/marriage", Topic),
    SuggestedTag("Friendship", "lifeandstyle/friendship", Topic),
    SuggestedTag("Cycling", "lifeandstyle/cycling", Topic),
    SuggestedTag("Sleep", "lifeandstyle/sleep", Topic),
    SuggestedTag("Swimming", "lifeandstyle/swimming", Topic),
    SuggestedTag("Men", "lifeandstyle/men", Topic),
    SuggestedTag("Veganism", "lifeandstyle/veganism", Topic),
    SuggestedTag("Cats", "lifeandstyle/cats", Topic),
    SuggestedTag("Vegetarianism", "lifeandstyle/vegetarianism", Topic),
    SuggestedTag("Toys", "lifeandstyle/toys", Topic),
    SuggestedTag("Sunday with...", "lifeandstyle/sunday-with-", Topic),
    SuggestedTag("Running", "lifeandstyle/running", Topic),
    SuggestedTag("Mindfulness", "lifeandstyle/mindfulness", Topic),
    SuggestedTag("DIY", "lifeandstyle/diy", Topic),
    SuggestedTag(
      "Parents and parenting",
      "lifeandstyle/parents-and-parenting",
      Topic
    )
  )

  val lifestyleCollection: TagCategory =
    TagCategory(displayTitle = "Lifestyle", tags = lifestyleTags)

}

object FoodCollection extends TagData {

  val foodTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Recipes", "tone/recipes", Topic),
    SuggestedTag("Felicity Cloake", "profile/felicity-cloake", Contributor),
    SuggestedTag("Jay Rayner", "profile/jayrayner", Contributor),
    SuggestedTag("Grace Dent", "profile/gracedent", Contributor),
    SuggestedTag("Yottam Ottolenghi", "profile/yotamottolenghi", Contributor),
    SuggestedTag("Nigel Slater", "profile/nigelslater", Contributor),
    SuggestedTag(
      "Felicity Cloake's masterclass",
      "food/series/felicity-cloake-s-masterclass",
      Series
    ),
    SuggestedTag(
      "Nigel Slater's midweek dinner",
      "food/series/nigel-slaters-midweek-dinner",
      Series
    ),
    SuggestedTag(
      "Jay Rayner on restaurants",
      "food/series/jay-rayner-on-restaurants",
      Series
    ),
    SuggestedTag("The new vegan", "food/series/the-new-vegan", Series),
    SuggestedTag("The sweet spot", "food/series/the-sweet-spot", Series),
    SuggestedTag("A kitchen in Rome", "food/series/a-kitchen-in-rome", Series),
    SuggestedTag("Rachel Roddy", "profile/rachel-roddy", Contributor),
    SuggestedTag("Meera Sodha", "profile/meera-sodha", Contributor),
    SuggestedTag("Alice Zavlasky", "profile/alice-zaslavsky", Contributor),
    SuggestedTag("Ravneet Gill", "profile/ravneet-gill", Contributor),
    SuggestedTag("Main Course", "food/main-course", Topic),
    SuggestedTag("Breakfast", "food/breakfast", Topic),
    SuggestedTag("Soup", "food/soup", Topic),
    SuggestedTag("Restaurants", "food/restaurants", Topic),
    SuggestedTag("Baking", "food/baking", Topic),
    SuggestedTag("Dessert", "food/dessert", Topic),
    SuggestedTag("Wine", "food/wine", Topic),
    SuggestedTag("Meat", "food/meat", Topic),
    SuggestedTag("Cheese", "food/cheese", Topic),
    SuggestedTag("Vegetarian", "food/vegetarian", Topic),
    SuggestedTag("Vegan", "food/vegan", Topic),
    SuggestedTag("Fish", "food/fish", Topic),
    SuggestedTag("Side Dishes", "food/side-dishes", Topic),
    SuggestedTag("Snacks", "food/snacks", Topic),
    SuggestedTag("Seafood", "food/seafood", Topic),
    SuggestedTag("Bread", "food/bread", Topic),
    SuggestedTag("Cake", "food/cake", Topic),
    SuggestedTag("Salad", "food/salad", Topic),
    SuggestedTag("Chicken", "food/chicken", Topic),
    SuggestedTag("Spirits", "food/spirits", Topic),
    SuggestedTag("Pasta", "food/pasta", Topic),
    SuggestedTag("Potatoes", "food/potatoes", Topic),
    SuggestedTag("Cocktails", "food/cocktails", Topic),
    SuggestedTag("French", "food/french", Topic),
    SuggestedTag("Pork", "food/pork", Topic),
    SuggestedTag("Rice", "food/rice", Topic),
    SuggestedTag("Spanish", "food/spanish", Topic),
    SuggestedTag(
      "British food and drink",
      "food/british-food-and-drink",
      Topic
    ),
    SuggestedTag(
      "Australian food and drink",
      "food/australian-food-and-drink",
      Topic
    ),
    SuggestedTag(
      "Italian food and drink",
      "food/italian-food-and-drink",
      Topic
    ),
    SuggestedTag("Middle Eastern food and drink", "food/middleeastern", Topic),
    SuggestedTag("Chinese", "food/chinese", Topic),
    SuggestedTag("Mexican", "food/mexican", Topic),
    SuggestedTag("Japanese", "food/japanese", Topic),
    SuggestedTag(
      "American food and drink",
      "food/american-food-and-drink",
      Topic
    ),
    SuggestedTag("Greek food and drink", "food/greek-food-and-drink", Topic),
    SuggestedTag("Indian", "food/indian", Topic),
    SuggestedTag(
      "Christmas food and drink",
      "food/christmas-food-and-drink",
      Topic
    ),
    SuggestedTag("Summer food and drink", "food/summer-food-and-drink", Topic)
  )

  val foodCollection: TagCategory =
    TagCategory(displayTitle = "Food", tags = foodTags)

}

object EnvironmentCollection extends TagData {
  val environmentTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Environment", "environment/environment", Topic),
    SuggestedTag("Climate crisis", "environment/climate-crisis", Topic),
    SuggestedTag("Wildlife", "environment/wildlife", Topic),
    SuggestedTag("Energy", "environment/energy", Topic),
    SuggestedTag("Conservation", "environment/conservation", Topic),
    SuggestedTag("Fossil fuels", "environment/fossil-fuels", Topic),
    SuggestedTag("Carbon emissions", "environment/carbon-emissions", Topic),
    SuggestedTag("Farming", "environment/farming", Topic),
    SuggestedTag("Flooding", "environment/flooding", Topic),
    SuggestedTag("Birds", "environment/birds", Topic),
    SuggestedTag("Cop 29", "environment/cop29", Topic),
    SuggestedTag("Pollution", "environment/pollution", Topic),
    SuggestedTag("Water", "environment/water", Topic),
    SuggestedTag("Marine life", "environment/marine-life", Topic),
    SuggestedTag("Renewable energy", "environment/renewableenergy", Topic),
    SuggestedTag("Forests", "environment/forests", Topic),
    SuggestedTag("Oceans", "environment/oceans", Topic),
    SuggestedTag("Biodiversity", "environment/biodiversity", Topic),
    SuggestedTag("Activism", "environment/activism", Topic),
    SuggestedTag("Gas", "environment/gas", Topic),
    SuggestedTag("Endangered species", "environment/endangeredspecies", Topic),
    SuggestedTag("Coal", "environment/coal", Topic),
    SuggestedTag("Insects", "environment/insects", Topic),
    SuggestedTag("Rivers", "environment/rivers", Topic),
    SuggestedTag(
      "Ethical and green living",
      "environment/ethical-living",
      Topic
    ),
    SuggestedTag("Food", "environment/food", Topic),
    SuggestedTag("Plants", "environment/plants", Topic),
//    SuggestedTag(
//      "Electric cars",
//      "environment/electric-cars+environment",
//      Topic
//    ),
    SuggestedTag("Drought", "environment/drought", Topic),
    SuggestedTag("Air pollution", "environment/air-pollution", Topic),
    SuggestedTag("Oil", "business/oilandgascompanies", Topic),
    SuggestedTag("Waste", "environment/waste", Topic),
    SuggestedTag("Green politics", "environment/green-politics", Topic),
    SuggestedTag("Country diaries", "environment/series/country-diary", Series)
  )

  val environmentCollection: TagCategory =
    TagCategory(displayTitle = "Environment", tags = environmentTags)
}

object CultureCollection extends TagData {
  val cultureTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Television", "culture/television", Topic),
    SuggestedTag("Comedy", "culture/comedy", Topic),
    SuggestedTag("Festivals", "culture/festivals", Topic),
    SuggestedTag("Heritage", "culture/heritage", Topic),
    SuggestedTag("Museums", "culture/museums", Topic),
    SuggestedTag("Stage", "stage/stage", Topic),
    SuggestedTag("Theatre", "stage/theatre", Topic),
    SuggestedTag("Radio", "culture/radio", Topic),
    SuggestedTag("Marvel", "culture/marvel", Topic),
    SuggestedTag("Shakespeare", "culture/shakespeare", Topic),
    SuggestedTag("Arts Funding", "culture/arts-funding", Topic),
    SuggestedTag("Royal Opera House", "culture/royal-opera-house", Topic),
    SuggestedTag("British Museum", "culture/british-museum", Topic),
    SuggestedTag("Drag", "culture/drag", Topic),
    SuggestedTag("Barbican", "culture/barbican", Topic),
    SuggestedTag(
      "Black British culture",
      "culture/black-british-culture",
      Topic
    ),
    SuggestedTag("Anime", "culture/anime", Topic),
    SuggestedTag("Awards and prizes", "culture/awards-and-prizes", Topic),
    SuggestedTag("Media", "media/media", Topic),
    SuggestedTag("Games", "games/games", Topic)
  )

  val cultureCollection: TagCategory =
    TagCategory(displayTitle = "Culture", tags = cultureTags)
}

object FilmCollection extends TagData {
  val filmTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Film", "film", Section),
    SuggestedTag("Drama", "film/drama", Topic),
    SuggestedTag("Documentary", "film/documentary", Topic),
    SuggestedTag("Comedy", "film/comedy", Topic),
    SuggestedTag("Thriller", "film/thriller", Topic),
    SuggestedTag("Horror", "film/horror", Topic),
    SuggestedTag(
      "Science fiction and fantasy",
      "film/sciencefictionandfantasy",
      Topic
    ),
    SuggestedTag("World cinema", "film/world-cinema", Topic),
    SuggestedTag("Film industry", "film/film-industry", Topic),
    SuggestedTag("Oscars", "film/oscars", Topic),
    SuggestedTag("Action and adventure", "film/actionandadventure", Topic),
    SuggestedTag("Romance", "film/romance", Topic),
    SuggestedTag("Animation", "film/animation", Topic),
    SuggestedTag("Crime", "film/crime", Topic),
    SuggestedTag("Australia", "film/australia", Topic),
    SuggestedTag("Period and historical", "film/periodandhistorical", Topic),
    SuggestedTag("Superhero movies", "film/superhero-movies", Topic),
    SuggestedTag("Cannes film festival", "film/cannesfilmfestival", Topic),
    SuggestedTag("Musical", "film/musical", Topic),
    SuggestedTag("Biopics", "film/biopics", Topic),
    SuggestedTag("Family", "film/family", Topic),
    SuggestedTag("Venice film festival", "film/venicefilmfestival", Topic),
    SuggestedTag("War films", "film/war-films", Topic)
  )

  val filmCollection: TagCategory =
    TagCategory(displayTitle = "Film", tags = filmTags)
}

object MusicCollection extends TagData {
  val musicTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Music", "music", Section),
    SuggestedTag("Pop and rock", "music/popandrock", Topic),
    SuggestedTag(
      "Classical music & opera",
      "music/classical-music-and-opera",
      Topic
    ),
    SuggestedTag("Opera", "music/opera", Topic),
    SuggestedTag("Rap", "music/rap", Topic),
    SuggestedTag("Hip Hop", "music/hip-hop", Topic),
    SuggestedTag("Jazz", "music/jazz", Topic),
    SuggestedTag("Indie", "music/indie", Topic),
    SuggestedTag("Electronic music", "music/electronicmusic", Topic),
    SuggestedTag("Australian music", "music/australian-music", Topic),
    SuggestedTag("Dance music", "music/dance-music", Topic),
    SuggestedTag("Folk", "music/folk", Topic),
    SuggestedTag("Music festivals", "music/music-festivals", Topic),
    SuggestedTag("Punk", "music/punk", Topic),
    SuggestedTag("Experimental music", "music/experimental-music", Topic),
    SuggestedTag("R&B", "music/r-and-b", Topic),
    SuggestedTag("Soul", "music/soul", Topic),
    SuggestedTag("Glastonbury", "music/glastonbury", Topic),
    SuggestedTag("Taylor Swift", "music/taylor-swift", Topic),
    SuggestedTag("Country", "music/country", Topic),
    SuggestedTag("Kanye West", "music/kanyewest", Topic),
    SuggestedTag("The Beatles", "music/thebeatles", Topic),
    SuggestedTag("Metal", "music/metal", Topic),
    SuggestedTag("Beyonce", "music/beyonce", Topic),
    SuggestedTag("Clubs", "music/clubs", Topic),
    SuggestedTag("Proms", "music/proms", Topic)
  )

  val musicCollection: TagCategory =
    TagCategory(displayTitle = "Music", tags = musicTags)

}

object BooksCollection extends TagData {
  val booksTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Books", "books", Section),
    SuggestedTag("Fiction", "books/fiction", Topic),
//    SuggestedTag(
//      "Autobiography and memoir",
//      "books/autobiography-and-memoir+biography",
//      Topic
//    ),
    SuggestedTag("Poetry", "books/poetry", Topic),
    SuggestedTag("History", "books/history", Topic),
    SuggestedTag("Politics", "books/politics", Topic),
    SuggestedTag("Biography", "books/biography", Topic),
    SuggestedTag("Publishing", "books/publishing", Topic),
    SuggestedTag("Australian Books", "books/australian-books", Topic),
    SuggestedTag("Science and nature", "books/scienceandnature", Topic),
    SuggestedTag("Society", "books/society", Topic),
    SuggestedTag(
      "Books for children and teenagers",
      "books/booksforchildrenandteenagers",
      Topic
    ),
    SuggestedTag("Comics", "books/comics", Topic),
    SuggestedTag("Art", "books/art", Topic),
    SuggestedTag(
      "Fiction in translation",
      "books/fiction-in-translation",
      Topic
    ),
    SuggestedTag("Short stories", "books/short-stories", Topic),
    SuggestedTag("Crime", "books/crime", Topic),
    SuggestedTag("Libraries", "books/libraries", Topic),
    SuggestedTag("Essays", "books/essays", Topic),
    SuggestedTag("Thrillers", "books/thrillers", Topic),
    SuggestedTag("Music", "books/music", Topic),
    SuggestedTag("Health mind and body", "books/healthmindandbody", Topic),
    SuggestedTag("Science fiction", "books/science-fiction", Topic),
    SuggestedTag("Philosophy", "books/philosophy", Topic),
    SuggestedTag("Journalism", "books/journalism", Topic),
    SuggestedTag("Charles Dickens", "books/charlesdickens", Topic),
    SuggestedTag("Audiobooks", "books/audiobooks", Topic),
    SuggestedTag("Roald Dahl", "books/roalddahl", Topic),
    SuggestedTag("Food", "books/food", Topic),
    SuggestedTag("Fantasy", "books/fantasy", Topic),
    SuggestedTag("Book of the day", "books/series/book-of-the-day", Series),
    SuggestedTag(
      "The books of my life",
      "books/series/the-books-of-my-life",
      Series
    ),
    SuggestedTag("The Big idea", "books/series/big-idea", Series),
    SuggestedTag(
      "Audiobook of the week",
      "books/series/audiobook-of-the-week",
      Series
    ),
    SuggestedTag("Poem of the week", "books/series/poemoftheweek", Series)
  )

  val booksCollection: TagCategory =
    TagCategory(displayTitle = "Books", tags = booksTags)

}

object TVAndRadioCollection extends TagData {
  val tvAndRadioTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("TV and Radio", "tv-and-radio/tv-and-radio", Topic),
    SuggestedTag("Comedy", "tv-and-radio/documentary", Topic),
    SuggestedTag("TV Review", "tv-and-radio/series/tv-review", Series),
    SuggestedTag("Watch This", "culture/series/watchthis", Series),
    SuggestedTag("Drama", "tv-and-radio/drama", Topic),
    SuggestedTag("US television", "tv-and-radio/us-television", Topic),
    SuggestedTag("Documentary", "tv-and-radio/documentary", Topic),
    SuggestedTag("Podcasts", "tv-and-radio/podcasts", Topic),
    SuggestedTag("Reality TV", "tv-and-radio/reality-tv", Topic),
    SuggestedTag("Factual TV", "tv-and-radio/factual-tv", Topic),
    SuggestedTag("Entertainment", "tv-and-radio/entertainment", Topic),
    SuggestedTag("TV Crime drama", "tv-and-radio/crime-drama", Topic),
    SuggestedTag(
      "Strictly Come Dancing",
      "tv-and-radio/strictly-come-dancing",
      Topic
    ),
    SuggestedTag("Eurovision", "tv-and-radio/eurovision", Topic),
    SuggestedTag("Food TV", "tv-and-radio/food-tv", Topic),
    SuggestedTag("Soap opera", "tv-and-radio/soap-opera", Topic),
    SuggestedTag("Doctor Who", "tv-and-radio/doctor-who", Topic),
    SuggestedTag("Fantasy TV", "tv-and-radio/fantasy-tv", Topic),
    SuggestedTag("I'm A Celebrity", "tv-and-radio/i-m-a-celebrity", Topic),
    SuggestedTag("TV News", "tv-and-radio/tv-news", Topic),
    SuggestedTag(
      "The Great British Bake Off",
      "tv-and-radio/the-great-british-bake-off",
      Topic
    ),
    SuggestedTag("Love Island", "tv-and-radio/love-island", Topic),
    SuggestedTag("Sport TV", "tv-and-radio/sport-tv", Topic)
  )

  val tvAndRadioCollection: TagCategory =
    TagCategory(displayTitle = "TV & Radio", tags = tvAndRadioTags)
}

object ArtAndDesignCollection extends TagData {
  val artAndDesignTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Art & Design", "artanddesign", Section),
    SuggestedTag("Photography", "artanddesign/photography", Topic),
    SuggestedTag("Art", "artanddesign/art", Topic),
    SuggestedTag("Architecture", "artanddesign/architecture", Topic),
    SuggestedTag("Painting", "artanddesign/painting", Topic),
    SuggestedTag("Design", "artanddesign/design", Topic),
    SuggestedTag("Sculpture", "artanddesign/sculpture", Topic),
    SuggestedTag("Illustration", "artanddesign/illustration", Topic),
    SuggestedTag("Installation", "artanddesign/installation", Topic),
    SuggestedTag("Ceramics", "artanddesign/ceramics", Topic),
    SuggestedTag("Street art", "artanddesign/streetart", Topic),
    SuggestedTag("Graphic design", "artanddesign/graphic-design", Topic),
    SuggestedTag("Exhibition", "artanddesign/exhibition", Topic)
  )

  val artAndDesignCollection: TagCategory =
    TagCategory(displayTitle = "Art & Design", tags = artAndDesignTags)

}

object TechnologyCollection extends TagData {
  val technologyTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Technology", "technology", Section),
    SuggestedTag("Internet", "technology/internet", Topic),
    SuggestedTag("Twitter", "technology/twitter", Topic),
    SuggestedTag("Techscape", "technology/series/techscape", Series),
    SuggestedTag("Elon Musk", "technology/elon-musk", Topic),
    SuggestedTag(
      "Artificial intelligence (AI)",
      "technology/artificialintelligenceai",
      Topic
    ),
    SuggestedTag("Facebook", "technology/facebook", Topic),
    SuggestedTag("Computing", "technology/computing", Topic),
    SuggestedTag("TikTok", "technology/tiktok", Topic),
    SuggestedTag("Cryptocurrencies", "technology/cryptocurrencies", Topic),
    SuggestedTag("E-commerce", "technology/efinance", Topic),
    SuggestedTag("Meta", "technology/meta", Topic),
    SuggestedTag("Amazon", "technology/amazon", Topic),
    SuggestedTag("Google", "technology/google", Topic),
    SuggestedTag("Instagram", "technology/instagram", Topic),
    SuggestedTag("Mobile phones", "technology/mobilephones", Topic),
    SuggestedTag("Apple", "technology/apple", Topic),
    SuggestedTag("Cybercrime", "technology/cybercrime", Topic),
    SuggestedTag("Motoring", "technology/motoring", Topic),
    SuggestedTag("Smartphones", "technology/smartphones", Topic),
    SuggestedTag("Tesla", "technology/tesla", Topic),
    SuggestedTag("Hacking", "technology/hacking", Topic),
    SuggestedTag("YouTube", "technology/youtube", Topic),
    SuggestedTag("Apps", "technology/apps", Topic)
  )

  val technologyCollection: TagCategory =
    TagCategory(displayTitle = "Technology", tags = technologyTags)
}

object MoneyAndFinanceCollection extends TagData {
  val moneyAndFinanceTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Consumer affairs", "money/consumer-affairs", Topic),
    SuggestedTag("Energy", "money/energy", Topic),
    SuggestedTag("Household bills", "money/household-bills", Topic),
    SuggestedTag(
      "Cost of living crisis",
      "business/cost-of-living-crisis",
      Topic
    ),
    SuggestedTag("Property", "money/property", Topic),
    SuggestedTag("Work and careers", "money/work-and-careers", Topic),
    SuggestedTag("Consumer rights money", "money/consumer-rights-money", Topic),
    SuggestedTag("Mortgages", "money/mortgages", Topic),
    SuggestedTag("Tax", "money/tax", Topic),
    SuggestedTag("Your problems", "money/series/yourproblems", Series),
    SuggestedTag(
      "Consumer champions",
      "money/series/bachelor-and-brignall-consumer-champions",
      Series
    ),
    SuggestedTag("Money hacks", "money/series/money-hacks", Series),
    SuggestedTag("Banks", "money/banks", Topic),
    SuggestedTag("Motoring", "money/motoring", Topic),
    SuggestedTag("Renting", "money/renting", Topic),
    SuggestedTag("Family finances", "money/family-finances", Topic),
    SuggestedTag("Pay", "money/pay", Topic),
    SuggestedTag("House prices", "money/houseprices", Topic),
    SuggestedTag("Petrol prices", "money/petrol-prices", Topic),
    SuggestedTag("Pensions", "money/pensions", Topic),
    SuggestedTag("Childcare", "money/childcare", Topic),
    SuggestedTag("Mortgage rates", "money/mortgage-rates", Topic),
    SuggestedTag("Debt", "money/debt", Topic),
    SuggestedTag("Scams and fraud", "money/scamsandfraud", Topic),
    SuggestedTag("Work life balance", "money/work-life-balance", Topic),
    SuggestedTag("Online shopping", "money/online-shopping", Topic),
    SuggestedTag("Insurance", "money/insurance", Topic),
    SuggestedTag("National insurance", "money/national-insurance", Topic),
    SuggestedTag("Savings", "money/savings", Topic),
    SuggestedTag(
      "Discrimination at work",
      "money/discrimination-at-work",
      Topic
    ),
    SuggestedTag("Work & careers", "money/work-careers-us", Topic),
    SuggestedTag("Mobile phones", "money/mobile-phones", Topic),
    SuggestedTag("Student Finance", "money/student-finance", Topic),
    SuggestedTag("Shopping", "money/shopping", Topic)
  )

  val moneyAndFinanceCollection: TagCategory =
    TagCategory(displayTitle = "Money & Finance", tags = moneyAndFinanceTags)
}

object ScienceCollection extends TagData {
  val scienceTags: Seq[SuggestedTag] = Seq(
    SuggestedTag("Science", "science", Section),
    SuggestedTag("Infectious diseases", "science/infectiousdiseases", Topic),
    SuggestedTag("Medical research", "science/medical-research", Topic),
    SuggestedTag("Space", "science/space", Topic),
    SuggestedTag("Psychology", "science/psychology", Topic),
    SuggestedTag("Biology", "science/biology", Topic),
    SuggestedTag("Science", "science/series/science", Series),
    SuggestedTag(
      "Alex Bello's Monday puzzle",
      "science/series/alex-bellos-monday-puzzle",
      Series
    ),
    SuggestedTag("Star watch", "science/series/starwatch", Series),
    SuggestedTag(
      "Science of climate change",
      "science/scienceofclimatechange",
      Topic
    ),
    SuggestedTag("Archaeology", "science/archaeology", Topic),
//    SuggestedTag("Agriculture", "science/argriculture", Topic),
    SuggestedTag("Astronomy", "science/astronomy", Topic),
    SuggestedTag("Ageing", "science/ageing", Topic),
    SuggestedTag("Microbiology", "science/microbiology", Topic),
    SuggestedTag("Nasa", "science/nasa", Topic),
    SuggestedTag("Drugs", "science/drugs", Topic),
    SuggestedTag("Language", "science/language", Topic),
    SuggestedTag("Neuroscience", "science/neuroscience", Topic),
    SuggestedTag("Genetics", "science/genetics", Topic),
    SuggestedTag("Mathematics", "science/mathematics", Topic),
    SuggestedTag("Zoology", "science/zoology", Topic),
    SuggestedTag("Evolution", "science/evolution", Topic),
    SuggestedTag("Moon", "science/moon", Topic),
    SuggestedTag("Consciousness", "science/consciousness", Topic),
    SuggestedTag("Fossils", "science/fossils", Topic),
    SuggestedTag("Cancer", "science/cancer", Topic),
    SuggestedTag("Physics", "science/physics", Topic),
    SuggestedTag("Weapons technology", "science/weaponstechnology", Topic),
    SuggestedTag("Animal behaviour", "science/animalbehaviour", Topic),
    SuggestedTag("Dinosaurs", "science/dinosaurs", Topic),
    SuggestedTag("Fungi", "science/fungi", Topic),
    SuggestedTag("Anthropology", "science/anthropology", Topic),
    SuggestedTag("Palaeontology", "science/palaeontology", Topic),
    SuggestedTag(
      "International Space Station",
      "science/international-space-station",
      Topic
    ),
    SuggestedTag("Human biology", "science/human-biology", Topic),
    SuggestedTag("Geology", "science/geology", Topic),
    SuggestedTag(
      "European Space Agency",
      "science/european-space-agency",
      Topic
    ),
    SuggestedTag("Meteors", "science/meteors", Topic)
  )

  val scienceCollection: TagCategory =
    TagCategory(displayTitle = "Science", tags = scienceTags)

}
