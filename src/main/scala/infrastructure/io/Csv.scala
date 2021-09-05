package com.fineconstant.spark
package infrastructure.io

import infrastructure.csv.{CsvReader, CsvWriter}
import infrastructure.SparkApplication

trait Csv extends CsvReader with CsvWriter {
  this: SparkApplication =>
}
