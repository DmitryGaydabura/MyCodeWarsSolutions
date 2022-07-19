package com.example.codewars.kotlin.ConvertAStringToANumber

fun stringToNumber(str: String): Int {
    return Integer.parseInt(str)
}

fun main() {
    println( stringToNumber("12"))
}