package com.example.codewars.kotlin.simpleMultiplication

fun main() {
    println(simpleMultiplication(1))
}

fun simpleMultiplication(n: Int): Int {
    return if(n % 2 == 0) n*8 else n*9
}