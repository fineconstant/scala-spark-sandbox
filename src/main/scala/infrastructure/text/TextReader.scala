package com.fineconstant.spark
package infrastructure.text

import infrastructure.SparkApplication

import org.apache.spark.sql.DataFrame

private[infrastructure] trait TextReader {
  this: SparkApplication =>

  def textRead(file: Symbol): DataFrame = textRead(Text.localTextFile(file))

  def textRead(path: String): DataFrame = sparkSession.read.text(path)
}
