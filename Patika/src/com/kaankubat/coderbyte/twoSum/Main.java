package com.kaankubat.coderbyte.twoSum;

import java.util.*;
import java.io.*;

class Main {

    public static String TwoSum(int[] arr) {
        // code goes here
        int firstNum = arr[0];

        String result = "";

        for(int i = 1; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum == firstNum) result += arr[i] + "," + arr[j] + " ";
            }
        }

        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        int[] arr = new int[] {100,90,1};
        System.out.print(TwoSum(arr));
    }

}