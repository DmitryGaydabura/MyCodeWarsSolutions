package com.example.codewars.scala.SumOfNumbers

object Sum {
  def main(args: Array[String]): Unit = {
    println(getSum(5,-1))

  }
  def getSum(a: Int, b: Int): Int = {
    var answer = 0;
    if(a > b){
      for (i <- b to a) {
        answer += i;
      }
      return answer
    }
    for( i <- a to b){
      answer += i;
    }
    answer
  }
}
