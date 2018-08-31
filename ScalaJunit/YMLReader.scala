package com.yml.demo

import scala.io.Source

object YMLReader {
  def main(args: Array[String]): Unit = {
    
 
  val bufferedSource = Source.fromFile("C:\\Users\\mine\\Desktop\\examples.txt")
for (line <- bufferedSource.getLines) {
    println(line.toUpperCase)
}
   }
}