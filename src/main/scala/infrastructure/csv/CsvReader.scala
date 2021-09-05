package com.fineconstant.spark
package infrastructure.csv

import infrastructure.SparkApplication

import org.apache.spark.sql.DataFrame

private[infrastructure] trait CsvReader {
  this: SparkApplication =>

  def csvRead(path: String): DataFrame = csvRead(path, Csv.DefaultOptions)

  def csvRead(file: Symbol): DataFrame = csvRead(file, Csv.DefaultOptions)

  def csvRead(file: Symbol, options: Map[String, String]): DataFrame = csvRead(Csv.localCsvFile(file), options)

  def csvRead(path: String, options: Map[String, String]): DataFrame = sparkSession.read.options(options).csv(path)
}
