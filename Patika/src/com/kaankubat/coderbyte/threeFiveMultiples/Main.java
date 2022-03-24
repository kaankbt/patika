package com.kaankubat.coderbyte.threeFiveMultiples;

import java.util.*;
import java.io.*;

class Main {

    public static long multiple(long n) {
        long sum = 0;
        for (int i = 3; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(multiple(Long.parseLong(s.nextLine())));
    }

}