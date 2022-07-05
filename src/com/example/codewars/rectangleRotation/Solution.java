package com.example.codewars.rectangleRotation;


public class Solution {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        System.out.println(rectangleRotation(6, 4));
        System.out.println(System.currentTimeMillis() - timeStart);
    }

    static int rectangleRotation( int a,  int b) {

        // Calculating the diagonal of the rectangle.
        double c = Math.sqrt(a * a + b * b) / 2;
        // Calculating the angle between the diagonal and the side of the rectangle.
        double gamma = Math.toDegrees(Math.acos((c * c + c * c - b * b) / (2 * c * c)));
        // Calculating the angle between the diagonal and the side of the rectangle.
        double alpha = (90 - gamma) / 2;
        // Calculating the length of the side of the rectangle.
        double x = Math.cos(Math.toRadians(alpha)) * c;
        // Calculating the length of the side of the rectangle.
        double y = Math.sin(Math.toRadians(alpha)) * c;

        //Coordinates of Rectangle points
        double[] first = {x, y};
        double[] second = {y, x};
        double[] third = {-x, -y};
        double[] fourth = {-y, -x};

        //total number of points
        int number = 0;


        // Checking if the point is inside the rectangle.
        for (int i = (int) -x; i < x; i++) {
            for (int j = (int) -x; j < x; j++) {
                // Creating a new array with the values of i and j.
                double[] dot = {i, j};
                // Checking if the point is inside the rectangle.
                if (check(first, second, dot, 1) && check(second, third, dot, 0) && check(third, fourth, dot, 1) && check(fourth, first, dot, 0)) {
                    number++;
                }
            }
        }

        return number;
    }

    private static boolean check(double[] first, double[] second, double[] dot, int n) {

        double x = dot[0];
        double y = dot[1];

        double x1 = first[0];
        double y1 = first[1];

        double x2 = second[0];
        double y2 = second[1];

        return n == 1 ? ((x - x1) / (x2 - x1)) >= ((y - y1) / (y2 - y1)) : ((x - x1) / (x2 - x1)) <= ((y - y1) / (y2 - y1));
    }


}
