package com.kaankubat.even;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num = 0;
        int count = 0;

        do {
            System.out.println("Number :");
            num = kb.nextInt();

            if (num % 4 == 0) {
                count += num;
            }
        } while (num % 2 == 0);
        System.out.println("total :" + count);
    }

}
