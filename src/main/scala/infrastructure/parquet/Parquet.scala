package com.fineconstant.spark
package infrastructure.parquet

private object Parquet {
  def localParquetFile(file: Symbol) = s"resources/${file.name}.parquet"
}
