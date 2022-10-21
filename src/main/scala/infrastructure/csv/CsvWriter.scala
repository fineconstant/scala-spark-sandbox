package com.fineconstant.spark
package infrastructure.csv

import org.apache.spark.sql.{Dataset, SaveMode}

private[infrastructure] trait CsvWriter {
  implicit class CsvDataFrame[T](xs: Dataset[T]) {
    def csvWrite(file: Symbol): Unit = csvWrite(Csv.localCsvFile(file))

    def csvWrite(path: String): Unit = xs.repartition(1).write.mode(SaveMode.Overwrite).options(Csv.DefaultOptions).csv(path)
  }
}
