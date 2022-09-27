package com.example.codewars.java.FindTheOddInt;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,2,2,2,2,2,2,3,3,3};
        System.out.println(findIt(a));
    }

    public static int findIt(int[] a) {
        HashMap<Integer, Integer> b = new HashMap<>();
        for (int j : a)
            if (b.containsKey(j)) b.put(j, b.get(j) + 1);
            else b.put(j, 1);
        Set<Integer> set = b.keySet();
        Object[] bb = set.toArray();
        for (Object o : bb)
            if (b.get(o) % 2 != 0) return (int) o;
        return 0;
    }
}
