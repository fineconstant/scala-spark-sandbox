package com.fineconstant.spark
package infrastructure

import infrastructure.io.{Csv, Json, Parquet, Text}

import org.apache.spark.sql.SparkSession

trait SparkApplication extends App with Csv with Json with Parquet with Text {
  lazy val sparkSession: SparkSession = {
    val session = SparkSession
      .builder()
      .appName("spark-sandbox")
      .master("local[4]")
      .getOrCreate()

    session.sparkContext.setLogLevel("warn")

    session
  }

}
