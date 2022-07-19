package com.example.codewars.java.HumanReadableTime;

public class HumanReadableTime {

    public static void main(String[] args) {

        System.out.println(makeReadable(1500));
    }
    public static String makeReadable(int seconds) {
        // Do something
        String secondString;
        String minuteString;
        String hourString;

        int hours = seconds / 3600;
        if (hours > 9) {
            hourString = ""+ hours;
        } else {
            hourString = "0"+ hours;
        }
        seconds %= 3600;

        int minute = seconds /60;
        if (minute > 9){
            minuteString = ""+ minute;
        }else{
            minuteString = "0"+ minute;
        }
        seconds %= 60;

        int second = seconds;
        if (second > 9){
            secondString = ""+ second;
        }else{
            secondString = "0"+ second;
        }

        return hourString + ":" + minuteString + ":" + secondString;
    }
}
