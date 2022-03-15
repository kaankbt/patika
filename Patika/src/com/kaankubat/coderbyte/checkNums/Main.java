package com.kaankubat.coderbyte.checkNums;

import java.util.Scanner;

class Main {
    public static String CheckNums(int num1, int num2) {
        if (num1 < num2)
            return "true";
        else if (num1 > num2)
            return "false";
        else
            return "-1";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
    }

}