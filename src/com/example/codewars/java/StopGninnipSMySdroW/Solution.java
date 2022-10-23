package com.example.codewars.java.StopGninnipSMySdroW;

public class Solution {
    public static void main(String[] args) {
        System.out.println(spinWords("abc bcde ABCDEF"));
    }

    public static String spinWords(String sentence) {
        String[] init = sentence.split(" ");
        for (int i = 0; i < init.length; i++) if (init[i].length() >= 5) init[i] = reverse(init[i]);
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < init.length; i++)
            answer.append(i != init.length - 1 ? init[i] + " " : init[i]);
        return answer.toString();
    }

    private static String reverse(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) answer.insert(0, s.charAt(i));
        return answer.toString();
    }
}
