package com.fineconstant.spark

import infrastructure.SparkApplication

import org.apache.spark.sql.expressions.*
import org.apache.spark.sql.functions.*
import org.apache.spark.sql.types.{DataTypes, IntegerType}

import java.sql.Timestamp
import java.time.Instant
import scala.collection.mutable
import scala.language.postfixOps

object SparkSandboxApp extends SparkApplication {
  import sparkSession.implicits.*

  val xs = Seq(1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000).toDF("x").repartition(1).cache

  xs.parquetWrite(Symbol("xs_data"))
  parquetRead(Symbol("xs_data")).show()

  sparkSession.stop()
}
