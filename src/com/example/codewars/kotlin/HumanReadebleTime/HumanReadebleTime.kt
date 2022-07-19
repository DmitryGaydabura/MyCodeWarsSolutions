package com.example.codewars.kotlin.HumanReadebleTime

    fun makeReadable(seconds: Int): String {
        // Do something
        var seconds = seconds
        val secondString: String
        val minuteString: String
        val hourString: String
        val hours = seconds / 3600
        hourString = if (hours > 9) {
            "" + hours
        } else {
            "0$hours"
        }
        seconds %= 3600
        val minute = seconds / 60
        minuteString = if (minute > 9) {
            "" + minute
        } else {
            "0$minute"
        }
        seconds %= 60
        val second = seconds
        secondString = if (second > 9) {
            "" + second
        } else {
            "0$second"
        }
        return "$hourString:$minuteString:$secondString"
    }

    fun main() {
        println(makeReadable(1200))
    }
