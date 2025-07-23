package cleaners
import org.apache.spark.sql.functions.{col,trim}
import org.apache.spark.sql.{SparkSession,Dataset,Row}

class TransactionCleaner {
  def cleanAllTransactions(df: Dataset[Row]): Dataset[Row] =
    {
      df.withColumn("ID", trim(col("ID")))
        .withColumn("first_name", trim(col("first_name")))
        .withColumn("last_name", trim(col("last_name")))
        .withColumn("email", trim(col("email")))
        .withColumn("gender", trim(col("gender")))
        .withColumn("Currency", trim(col("Currency")))
        .withColumn("Product", trim(col("Product")))
        .withColumn("Country", trim(col("Country")))
        .withColumn("Postal_code", trim(col("Postal_code")))
        .withColumn("Street_Address", trim(col("Street_Address")))
    }

}
