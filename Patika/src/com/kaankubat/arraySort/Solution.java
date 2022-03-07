package com.kaankubat.arraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Dizi boyutu: ");

        int[] userArray = new int[kb.nextInt()];

        for (int i = 0; i < userArray.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            userArray[i] = kb.nextInt();
        }
        Arrays.sort(userArray);
        System.out.println(Arrays.toString(userArray));


    }
}
