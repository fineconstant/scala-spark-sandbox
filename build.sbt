name := "scala-spark-sandbox"

version := "0.1"

scalaVersion := "2.12.14"

idePackagePrefix := Some("com.fineconstant.spark")

val sparkVersion = "3.1.2"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
