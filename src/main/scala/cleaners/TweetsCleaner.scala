package cleaners
import org.apache.spark.sql.{Dataset, Row, SparkSession, functions}
import org.apache.spark.sql.functions.{col, regexp_replace}
import org.apache.spark.sql.types.DataTypes

class TweetsCleaner(SparkSession: SparkSession) {
  def cleanAllTweets(df: Dataset[Row]): Dataset[Row] ={
    df.withColumn("hashtags", regexp_replace(col("hashtags"),"[']",""))
    df.withColumn("hashtags", regexp_replace(col("hashtags"),"\\[",""))
    df.withColumn("hashtags", regexp_replace(col("hashtags"),"\\]",""))
    df.withColumn("hashtags", functions.split(col("hashtags"),","))
    df.withColumn("date", col("date").cast(DataTypes.DateType))
    df.withColumn("user_created", col("user_created").cast(DataTypes.LongType))
    df.withColumn("user_favourites", col("user_favourites").cast(DataTypes.LongType))
    df.withColumn("user_friends", col("user_friends").cast(DataTypes.LongType))
    df.withColumn("user_followers", col("user_followers").cast(DataTypes.LongType))
  }

}
