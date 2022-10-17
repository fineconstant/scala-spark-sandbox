name := "scala-spark-sandbox"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.13.10"

idePackagePrefix := Some("com.fineconstant.spark")

val sparkVersion = "3.3.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql"  % sparkVersion
