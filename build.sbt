name := "spark_samples"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "1.6.2" % "provided",
  "org.apache.spark" % "spark-sql_2.10" % "1.6.2" % "provided"
)
    