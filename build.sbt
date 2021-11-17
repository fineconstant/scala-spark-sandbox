name := "scala-spark-sandbox"

version := "0.1"

scalaVersion := "3.1.1-RC1"

idePackagePrefix := Some("com.fineconstant.spark")

val sparkVersion = "3.2.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion cross CrossVersion.for3Use2_13
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion cross CrossVersion.for3Use2_13
