package com.fineconstant.spark
package infrastructure.text

import org.apache.spark.sql.{Dataset, SaveMode}

private[infrastructure] trait TextWriter {
  implicit class TextDataFrame[T](xs: Dataset[T]) {
    def textWrite(file: Symbol): Unit = textWrite(Text.localTextFile(file))

    def textWrite(path: String): Unit = xs.write.mode(SaveMode.Overwrite).text(path)
  }
}
