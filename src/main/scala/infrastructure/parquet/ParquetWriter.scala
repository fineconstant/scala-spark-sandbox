package com.fineconstant.spark
package infrastructure.parquet

import org.apache.spark.sql.{Dataset, SaveMode}

private[infrastructure] trait ParquetWriter {
  implicit class ParquetDataFrame[T](xs: Dataset[T]) {
    def parquetWrite(file: Symbol): Unit = parquetWrite(Parquet.localParquetFile(file))

    def parquetWrite(path: String): Unit = xs.write.mode(SaveMode.Overwrite).parquet(path)
  }
}
