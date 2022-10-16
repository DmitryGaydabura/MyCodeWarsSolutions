package com.example.codewars.scala.countingSheep

object Main {
  def main(args: Array[String]): Unit = {
    println(countingSheep(3))
  }
  def countingSheep(num: Int): String = {
    // Add your code here
    var answer = ""
    for (i <- 0 until  num){
      answer += "" + (i + 1) + " sheep..."
    }
    answer
  }
}
