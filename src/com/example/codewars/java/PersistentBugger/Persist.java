package com.example.codewars.java.PersistentBugger;

class Persist {
    public static void main(String[] args) {
        System.out.println(persistence(39));
    }

    public static int persistence(long n) {
        // your code
        int t = 0;
        long number = n;
        while (number >= 10) {
            String num = "" + number;
            int[] A = new int[num.length()];
            for (int i = 0; i < A.length; i++) {
                A[i] = Integer.parseInt(Character.toString(num.charAt(i)));
            }
            int r = 1;
            for (int i = 0; i < A.length; i++) {
                r *= A[i];
            }
            number = r;
            t++;
        }
        return t;
    }
}
