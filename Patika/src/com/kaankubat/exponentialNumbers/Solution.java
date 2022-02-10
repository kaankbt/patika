package com.kaankubat.exponentialNumbers;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Taban :");
        int tbn = kb.nextInt();

        System.out.println("Kuvvet :");
        int kvt = kb.nextInt();

        long total = 1;

        for (; kvt != 0; --kvt) {
            total *= tbn;
        }
        System.out.println("Sonuç :" + total);
    }
}
