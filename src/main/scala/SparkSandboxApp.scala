package com.fineconstant.spark

import infrastructure.SparkApplication

import org.apache.spark.sql.Row
import org.apache.spark.sql.functions._

import scala.language.postfixOps

object SparkSandboxApp extends SparkApplication {
  import sparkSession.implicits._



  sparkSession.stop()
}
