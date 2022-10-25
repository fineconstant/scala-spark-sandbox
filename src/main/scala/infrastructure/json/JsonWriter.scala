package com.fineconstant.spark
package infrastructure.json

import org.apache.spark.sql.{Dataset, SaveMode}

private[infrastructure] trait JsonWriter {
  implicit class JsonDataFrame[T](xs: Dataset[T]) {
    def jsonWrite(file: Symbol): Unit = jsonWrite(Json.localJsonFile(file))

    def jsonWrite(path: String): Unit = xs.write.mode(SaveMode.Overwrite).json(path)
  }
}
