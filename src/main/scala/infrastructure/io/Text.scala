package com.fineconstant.spark
package infrastructure.io

import infrastructure.SparkApplication
import infrastructure.text.{TextReader, TextWriter}

trait Text extends TextReader with TextWriter {
  this: SparkApplication =>
}
