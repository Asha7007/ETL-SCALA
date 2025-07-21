package loaders
import org.apache.spark.sql.{Dataset,Row,SparkSession}
import org.apache.spark.sql.functions.lit

object ForbesLoader
{
  val FORBES_LABEL: String = "forbes"
}
class ForbesLoader {
  def loadforbes(): Dataset[Row]  = SparkSession.read
    .option("header",true)
    .csv("Datasource/forbes_2022_billionaires.cs

}
