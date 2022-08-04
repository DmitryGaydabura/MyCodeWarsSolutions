package com.example.codewars.java.ArrayDiff;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));

    }

    public static int[] arrayDiff(int[] a, int[] b) {

        ArrayList<Integer> A = new ArrayList<>();
        for (int j : a) A.add(j);
        ArrayList<Integer> B = new ArrayList<>();
        for (int j : b) B.add(j);
        A.removeAll(B);
        int[] c = new int[A.size()];
        for (int i = 0; i < A.size(); i++) c[i] = A.get(i);

        return c;
    }

}
