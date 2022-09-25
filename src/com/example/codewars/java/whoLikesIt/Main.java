package com.example.codewars.java.whoLikesIt;

public class Main {
    public static void main(String[] args) {
        String[] a = {};
        System.out.println(whoLikesIt(a));

    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        String answer = "";
        switch (names.length){
            case 0 -> answer = "no one likes this";
            case 1 -> answer = names[0] + " likes this";
            case 2 -> answer = names[0] +" and "+ names[1] +  " like this";
            case 3 -> answer = names[0] +", "+ names[1] +" and " +names[2] +  " like this";
            default -> answer = names[0] +", "+ names[1] +" and " + (names.length - 2) +  " others like this";

        }
        return answer;
    }
}
