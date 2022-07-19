package com.example.codewars.java.ValidParentheses;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validParentheses("())(()"));
    }

    public static boolean validParentheses(String parens) {
        int total = 0;
        int n = 0;
        for (int i = 0; i < parens.length(); i++) {
            switch (parens.charAt(i)) {
                case '(' -> {
                    n++;
                    total++;
                }
                case ')' -> {
                    n--;
                    total++;
                    if (n < 0 || total == 1) {
                        return false;
                    }
                }
            }
        }
        return n == 0;
    }
}
