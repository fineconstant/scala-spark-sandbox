package com.fineconstant.spark
package infrastructure.json

import infrastructure.SparkApplication

import org.apache.spark.sql.DataFrame

private[infrastructure] trait JsonReader {
  this: SparkApplication =>

  def jsonRead(file: Symbol): DataFrame = jsonRead(Json.localJsonFile(file))

  def jsonRead(path: String): DataFrame = sparkSession.read.json(path)
}
