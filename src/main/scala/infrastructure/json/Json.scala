package com.fineconstant.spark
package infrastructure.json

private object Json {
  def localJsonFile(file: Symbol) = s"resources/${file.name}.json"
}
