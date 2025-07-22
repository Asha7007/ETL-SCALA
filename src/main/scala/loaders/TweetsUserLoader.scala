package loaders
import org.apache.spark.sql.{Dataset,SparkSession,Row}
import org.apache.spark.sql.functions.lit

object TweetsUserLoader {
  val TWITTER_LABEL: String = "tweets"
}

class TweetsUserLoader(SparkSession :SparkSession) {
  def loadTwitter() :Dataset[Row] = SparkSession.read
    .option("header","true")
    .csv("Datasource/twitter_dataset.csv")
    .withColumn("category",lit(TweetsUserLoader.TWITTER_LABEL))

}
