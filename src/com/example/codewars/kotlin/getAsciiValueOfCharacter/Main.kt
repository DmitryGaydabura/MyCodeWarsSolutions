package com.example.codewars.kotlin.getAsciiValueOfCharacter


fun getAscii(c: Char): Int {
    return c.code
}

fun main() {
    println(getAscii('A'))
}

