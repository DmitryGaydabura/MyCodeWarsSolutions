package com.example.codewars.java.trafficLightsOneCar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String road = "C..R.....G....R";
        String[] answer = trafficLights(road, 40);

        for (String s : answer) {
            System.out.println(s);
        }


    }

    public static String[] trafficLights(String road, int n) {
        ArrayList<String> an = new ArrayList<>();
        ArrayList<Integer> iORL = new ArrayList<>();

        for (int i = 0; i < road.length(); i++)
            if (road.charAt(i) == 'R') iORL.add(i);

        ArrayList<Integer> iOGL = new ArrayList<>();
        for (int i = 0; i < road.length(); i++)
            if (road.charAt(i) == 'G') iOGL.add(i);

        ArrayList<Integer> iOOL = new ArrayList<>();
        for (int i = 0; i < road.length(); i++)
            if (road.charAt(i) == 'O') iOOL.add(i);

        char[] R = {'R', 'R', 'R', 'R', 'G', 'G', 'G', 'G', 'G', 'O', 'R'};
        char[] O = {'R', 'R', 'R', 'R', 'R', 'G', 'G', 'G', 'G', 'G', 'O'};
        char[] G = {'G', 'G', 'G', 'G', 'O', 'R', 'R', 'R', 'R', 'R', 'G'};

        int ai = 0;
        int c = 0;
        an.add(road);
        boolean en = false;

        for (int i = 0; i < n; i++) {
            if (i % 11 == 0 && i != 0) ai -= 11;
            for (Integer integer : iOGL) {
                String first = road.substring(0, integer);
                String second = road.substring(integer + 1);
                road = first + G[ai] + second;
            }
            for (Integer integer : iORL) {
                String first = road.substring(0, integer);
                String second = road.substring(integer + 1);
                road = first + R[ai] + second;
            }
            for (Integer integer : iOOL) {
                String first = road.substring(0, integer);
                String second = road.substring(integer + 1);
                road = first + O[ai] + second;
            }
            if (!en) {
                if ((c + 1 < road.length() && road.charAt(c + 1) == '.') || (c + 1 < road.length() && road.charAt(c + 1) == 'G')) {
                    String b;

                    if (i > 2 && an.get(i - 2).charAt(c + 1) == 'R' && road.charAt(c + 1) == '.') {
                        b = "G";
                    } else {
                        b = ".";
                    }
                    String v;
                    v = "C";

                    int dot = c + 1;
                    String first = road.substring(0, dot - 1);
                    String second = road.substring(dot + 1);
                    road = first + b + v + second;


                    c++;

                }
            }


            for (Integer integer : iOGL) {
                if (integer != c) {
                    String first = road.substring(0, integer);
                    String second = road.substring(integer + 1);
                    road = first + G[ai] + second;
                }
            }

            for (Integer integer : iORL) {
                if (integer != c) {
                    String first = road.substring(0, integer);
                    String second = road.substring(integer + 1);
                    road = first + R[ai] + second;
                }
            }

            for (Integer integer : iOOL) {
                if (integer != c) {
                    String first = road.substring(0, integer);
                    String second = road.substring(integer + 1);
                    road = first + O[ai] + second;
                }
            }
            if (en) {
                String base = road.substring(0, road.length() - 1);
                road = base + ".";

            }
            for (Integer integer : iOGL) {
                if ((integer != c) || en && c >= road.length()) {
                    String first = road.substring(0, integer);
                    String second = road.substring(integer + 1);
                    road = first + G[ai] + second;
                }
            }
            for (Integer integer : iORL) {
                if (integer != c) {
                    String first = road.substring(0, integer);
                    String second = road.substring(integer + 1);
                    road = first + R[ai] + second;
                }
            }
            for (Integer integer : iOOL) {
                if ((((integer != c) && (!en)) || (en && c >= road.length()))) {
                    String first = road.substring(0, integer);
                    String second = road.substring(integer + 1);
                    road = first + O[ai] + second;
                }
            }
            if (road.endsWith("C")) {
                en = true;
                c++;
            }
            ai++;
            an.add(road);
        }
        return an.toArray(new String[0]);
    }
}
