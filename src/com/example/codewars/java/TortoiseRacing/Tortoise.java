package com.example.codewars.java.TortoiseRacing;

import java.util.ArrayList;
import java.util.List;

public class Tortoise {
    public static void main(String[] args) {
        race(720,850,70);
    }
    public static int[] race(int v1, int v2, int g) {
        // your code
        if(v2 <= v1){
            return null;
        }
        List<Object> A = new ArrayList();
        A.add("Hello");
        A.add(12);

        double l1 = g;
        double l2 = 0;

        double seconds = 0.00027778;
        double time = seconds;
        int totalSec = 0;

        while(l1 > l2){
            l1 += v1*seconds;
            l2 += v2*seconds;
            time += seconds;
            totalSec ++;
        }
        int hours = totalSec / 3600;
        totalSec -= hours*3600;
        int min = totalSec / 60;
        totalSec -= min * 60;
        int sec = totalSec - 1;
        int[] answer = {hours,min,sec};

        return answer;
    }
}
