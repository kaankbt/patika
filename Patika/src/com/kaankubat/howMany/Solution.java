package com.kaankubat.howMany;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        int[] dizi = {10, 5, 7, 8, 45, 9, 10, 45, 78, 32};

        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i : dizi) {
            if (!counter.containsKey(i)) {
                counter.put(i, 1);
            } else {
                counter.put(i, counter.get(i) + 1);
            }
        }

        for (int i : counter.keySet()) {
            System.out.println(i + " is repeated by " + counter.get(i) + " times.");
        }
    }
}


