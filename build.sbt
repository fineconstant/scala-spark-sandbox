name := "scala-spark-sandbox"

version := "1.0.0-SNAPSHOT"

scalaVersion := "3.2.0"

idePackagePrefix := Some("com.fineconstant.spark")

val sparkVersion = "3.3.0"
libraryDependencies += "org.apache.spark" %% "spark-core"                % sparkVersion cross CrossVersion.for3Use2_13
libraryDependencies += "org.apache.spark" %% "spark-sql"                 % sparkVersion cross CrossVersion.for3Use2_13
