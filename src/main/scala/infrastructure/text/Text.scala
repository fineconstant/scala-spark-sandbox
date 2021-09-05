package com.fineconstant.spark
package infrastructure.text

private object Text {
  def localTextFile(file: Symbol) = s"resources/${file.name}.txt"
}
