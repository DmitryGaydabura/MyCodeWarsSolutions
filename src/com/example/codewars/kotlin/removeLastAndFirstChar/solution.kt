package com.example.codewars.kotlin.removeLastAndFirstChar

fun removeChar(str: String): String{
    return str.removeRange(0,1).removeRange(str.lastIndex-1,str.lastIndex)
}
fun main() {
    println(removeChar("hello"))
}