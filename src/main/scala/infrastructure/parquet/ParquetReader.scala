package com.fineconstant.spark
package infrastructure.parquet

import infrastructure.SparkApplication

import org.apache.spark.sql.DataFrame

private[infrastructure] trait ParquetReader {
  this: SparkApplication =>

  def parquetRead(file: Symbol): DataFrame = parquetRead(Parquet.localParquetFile(file))

  def parquetRead(path: String): DataFrame = sparkSession.read.parquet(path)
}
