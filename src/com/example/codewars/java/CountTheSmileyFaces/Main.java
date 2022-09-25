package com.example.codewars.java.CountTheSmileyFaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add(":-)");
        System.out.println(countSmileys(a));

    }
    public static int countSmileys(List<String> arr) {
        var c = 0;
        for (String v : arr)
            if (v.length() == 2) {
                var f = false;
                var s = false;
                if (v.startsWith(":") || v.startsWith(";")) f = true;
                if (v.endsWith(")") || v.endsWith("D")) s = true;
                if (f && s) c++;
            } else if (v.length() == 3) {
                boolean f = false;
                var s = false;
                var t = false;
                if (v.startsWith(":") || v.startsWith(";")) f = true;
                if (v.charAt(1) == '-' || v.charAt(1) == '~') s = true;
                if (v.endsWith(")") || v.endsWith("D")) t = true;
                if (f && s && t) c++;
            }
        return c;
    }
}
