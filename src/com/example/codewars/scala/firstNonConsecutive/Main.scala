package com.example.codewars.scala

object Main {
  def main(args: Array[String]): Unit = {
    println(firstNonConsecutive(Array(1, 2, 3, 4, 5, 7, 8, 9)))

  }

  def firstNonConsecutive(values: Seq[Int]): Option[Int] = {
    var answer: Option[Int] = None
    for (i: Int <- 1 until values.size) {
      if (values(i) - values(i - 1) != 1) {
        answer = Some(values(i))
      }
      return answer
    }
    answer
  }

}
