package com.example.codewars.scala.multiplicationTableForNumber

object Main {
  def main(args: Array[String]): Unit = {
    println(multiTable(3))
  }

  def multiTable(n: Int): String = {
    var answer = "1 * " + n + " = " + 1 * n + "\n" +
      "2 * " + n + " = " + 2 * n + "\n" +
      "3 * " + n + " = " + 3 * n + "\n" +
      "4 * " + n + " = " + 4 * n + "\n" +
      "5 * " + n + " = " + 5 * n + "\n" +
      "6 * " + n + " = " + 6 * n + "\n" +
      "7 * " + n + " = " + 7 * n + "\n" +
      "8 * " + n + " = " + 8 * n + "\n" +
      "9 * " + n + " = " + 9 * n + "\n" +
      "10 * " + n + " = " + 10 * n
    answer
  }
}


