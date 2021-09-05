package com.fineconstant.spark
package infrastructure.io

import infrastructure.SparkApplication
import infrastructure.json.{JsonReader, JsonWriter}

trait Json extends JsonWriter with JsonReader {
  this: SparkApplication =>
}
