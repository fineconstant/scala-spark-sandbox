package com.fineconstant.spark
package infrastructure.io

import infrastructure.SparkApplication
import infrastructure.parquet.{ParquetReader, ParquetWriter}

trait Parquet extends ParquetReader with ParquetWriter {
  this: SparkApplication =>
}
