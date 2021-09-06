package com.fineconstant.spark

import infrastructure.SparkApplication

import org.apache.spark.sql.expressions._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.IntegerType

import scala.language.postfixOps

object SparkSandboxApp extends SparkApplication {
  import sparkSession.implicits._

  sparkSession.stop()
}
