package com.fineconstant.spark
package infrastructure.csv

private object Csv {
  def localCsvFile(file: Symbol) = s"resources/${file.name}.csv"
  val DefaultOptions =
    Map("header" -> "true", "sep" -> ",", "ignoreLeadingWhiteSpace" -> "true", "ignoreTrailingWhiteSpace" -> "true")
  val ExcelOptions =
    Map("header" -> "true", "sep" -> ";", "ignoreLeadingWhiteSpace" -> "true", "ignoreTrailingWhiteSpace" -> "true")
}
