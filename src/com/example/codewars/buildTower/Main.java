package com.example.codewars.buildTower;

public class Main {
    public static void main(String[] args) {
        towerBuilder(10);
    }
    public static String[] towerBuilder(int nFloors)
    {
        String[] answer = new String[nFloors];
        for (int i = 0, numberOfAsterisks = 1, numberOfSpaces = nFloors - 1; i < nFloors; i++, numberOfAsterisks+=2,numberOfSpaces--) {
            StringBuilder space = new StringBuilder();
            space.append(" ".repeat(Math.max(0, numberOfSpaces)));
            answer[i] =  space + "*".repeat(Math.max(0, numberOfAsterisks)) +space;
            System.out.println(answer[i]);
        }
        return  answer;
    }
}
