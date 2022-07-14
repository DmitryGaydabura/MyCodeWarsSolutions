package com.example.codewars.rectangleRotation;


public class Solution {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        //Record ~1100 ms for (10000 , 10000)
        System.out.println(rectangleRotation(10000, 10000));
        System.out.println(System.currentTimeMillis() - timeStart);
    }

    static int rectangleRotation(int a, int b) {

        float c = (float) (Math.sqrt(a * a + b * b) / 2);
        float gamma = (float) Math.toDegrees(Math.acos((c * c + c * c - b * b) / (2 * c * c)));
        float alpha = ((90 - gamma) / 2);
        float x = (float) (Math.cos(Math.toRadians(alpha)) * c);
        float y = (float) (Math.sin(Math.toRadians(alpha)) * c);

        float[] first = {x, y};
        float[] second = {y, x};
        float[] third = {-x, -y};
        float[] fourth = {-y, -x};

        //total number of points
        int number = 0;


        // Checking if the point is inside the rectangle.
        for (int i = (int) -x; i < x; i++) {
            for (int j = (int) -x; j < x; j++) {
                // Creating a new array with the values of i and j.
                float[] dot = {i, j};
                // Checking if the point is inside the rectangle.
                boolean c1 = check(first, second, dot, 1);
                if (!c1) continue;
                boolean c2 = check(second, third, dot, 0);
                if (!c2) continue;
                boolean c3 = check(third, fourth, dot, 1);
                if (!c3) continue;
                boolean c4 = check(fourth, first, dot, 0);
                if (!c4) continue;
                number++;

            }
        }

        return number;
    }

    private static boolean check(float[] first, float[] second, float[] dot, int n) {

        float x = dot[0];
        float y = dot[1];

        float x1 = first[0];
        float y1 = first[1];

        float x2 = second[0];
        float y2 = second[1];

        return n == 1 ? ((x - x1) / (x2 - x1)) >= ((y - y1) / (y2 - y1)) : ((x - x1) / (x2 - x1)) <= ((y - y1) / (y2 - y1));
    }


}
