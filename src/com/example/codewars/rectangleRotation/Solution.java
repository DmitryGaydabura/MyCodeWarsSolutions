package com.example.codewars.rectangleRotation;

public class Solution {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        //Record ~1050 ms for (10000 , 10000)
        System.out.println(rectangleRotation(10000, 10000));
        System.out.println(System.currentTimeMillis() - timeStart);
    }

    static int rectangleRotation(int a, int b) {

        float c = (float) (Math.sqrt(a * a + b * b) / 2);
        float gamma = (float) Math.toDegrees(Math.acos((c * c + c * c - b * b) / (2 * c * c)));
        float alpha = ((90 - gamma) / 2);
        float x = (float) (Math.cos(Math.toRadians(alpha)) * c);
        float y = (float) (Math.sin(Math.toRadians(alpha)) * c);


        //total number of points
        int number = 0;

        // Checking if the point is inside the rectangle.

        for (int i = (int) -x; i < x; i++) {
            for (int j = (int) -x; j < x; j++) {
                // Checking if the point is inside the rectangle.
                boolean c1 = check(x, y, y, x, i, j, 1);
                if (!c1) continue;
                boolean c2 = check(y, x, -x, -y, i, j, 0);
                if (!c2) continue;
                boolean c3 = check(-x, -y, -y, -x, i, j, 1);
                if (!c3) continue;
                boolean c4 = check(-y, -x, x, y, i, j, 0);
                if (!c4) continue;
                number++;

            }
        }
        return number;
    }

    private static boolean check(float x1, float y1, float x2, float y2, int x, int y, int n) {
        return n == 1 ? ((x - x1) / (x2 - x1)) >= ((y - y1) / (y2 - y1)) : ((x - x1) / (x2 - x1)) <= ((y - y1) / (y2 - y1));
    }


}
