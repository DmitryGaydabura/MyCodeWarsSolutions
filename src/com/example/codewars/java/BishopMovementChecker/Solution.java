//package com.example.codewars.java.BishopMovementChecker;
//
//import java.util.ArrayList;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        bishop("asd", "dasds", 5);
//    }
//
//    public static boolean bishop(String positionStart, String positionEnd, int n) {
//        Map<String, Integer> board = new TreeMap<>();
//        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};
//        boolean mark = false;
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                board.put(letters[i] + "" + (j + 1), mark ? 1 : 0);
//                mark = !mark;
//            }
//            mark = !mark;
//        }
//
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(board.get(letters[j] + (i + 1)));
//
//            }
//            System.out.println();
//        }
//
//        if (n == 0) {
//            return positionStart.equals(positionEnd);
//        }
//        if (n == 1) {
//            String l = positionStart.substring(0, 1);
//            int index = Integer.parseInt(positionStart.substring(1));
//            int lIndex = 0;
//            for (int i = 0; i < 8; i++) {
//                if (letters[i].equals(l)) {
//                    lIndex = i;
//                }
//            }
//
//            ArrayList<String> possible = new ArrayList<>();
//            //positive direction
//            try {
//                for (int i = 0; i < 6; i++) {
//                    possible.add(letters[lIndex + i] + (index + i));
//                }
//            } catch (Exception e) {
//            }
//            try {
//                for (int i = 0; i < 6; i++) {
//                    possible.add(letters[lIndex - i] + (index + i));
//                }catch(Exception e){
//                }
//                try {
//                    for (int i = 0; i < 6; i++) {
//                        possible.add(letters[lIndex + i] + (index - i));
//                    }catch(Exception e){
//                    }
//                    try {
//                        for (int i = 0; i < 6; i++) {
//                            possible.add(letters[lIndex - i] + (index - i));
//                        }
//                    } catch (Exception e) {
//                    }
//
//                    if (!board.get(positionStart).equals(board.get(positionEnd))) {
//                        return false;
//                    }
//                    //put code here
//                    return true;
//                }
//            }
