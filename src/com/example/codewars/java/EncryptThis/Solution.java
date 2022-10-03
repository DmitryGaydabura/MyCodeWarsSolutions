package com.example.codewars.java.EncryptThis;

public class Solution {
    public static void main(String[] args) {
        System.out.println(encryptThis("A wise old owl lived in an oak"));

    }

    public static String encryptThis(String text) {
        if (text.equals("")) return "";

        String[] array = text.split(" ");
        String[] answer = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            int number = array[i].charAt(0);
            if (array[i].length() > 2) {
                answer[i] = "" + number + array[i].substring(array[i].length() - 1) + array[i].substring(2, array[i].length() - 1) + array[i].charAt(1);;
            } else if (array[i].length() == 1) answer[i] = "" + number;
            else answer[i] = number + array[i].substring(array[i].length() - 1);
        }

        StringBuilder answerString = new StringBuilder();
        for (int i = 0; i < answer.length; i++)
            if (!(answer.length - i == 1)) answerString.append(answer[i]).append(" ");
            else answerString.append(answer[i]);
        return answerString.toString();
    }
}
