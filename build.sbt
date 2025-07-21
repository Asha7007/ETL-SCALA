name := "SparkScalaETL"

version := "0.1"

scalaVersion := "2.12.18"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.4.1",
  "org.apache.spark" %% "spark-sql" % "3.4.1",
  "org.postgresql" % "postgresql" % "42.7.0", // Optional if using PostgreSQL
  "org.scalatest" %% "scalatest" % "3.2.18" % Test // For testing support
)
