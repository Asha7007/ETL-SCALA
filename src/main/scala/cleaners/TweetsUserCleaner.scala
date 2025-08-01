package cleaners

import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types.DataTypes
import org.apache.spark.sql.{SparkSession,Dataset,Row}

class TweetsUserCleaner(SparkSession: SparkSession) {

  def CleanTweetsUser(df: Dataset[Row]): Dataset[Row] = {
      df.withColumn("Tweet_ID", col("Tweet_ID").cast(DataTypes.IntegerType))
        .withColumn("Retweets", col("Retweets").cast(DataTypes.IntegerType))
        .withColumn("Likes", col("Likes").cast(DataTypes.IntegerType))
        .withColumn("Date", col("Timestamp").cast(DataTypes.DateType))
  }

}
