package com.kaankubat.coderbyte.palindromeTwo;

import java.util.*;
import java.io.*;

class Main {

    public static String PalindromeTwo(String str) {
        // code goes here
        String str2 = "";

        str2 = str.replaceAll("[\\W]", "");
        String reverse = new StringBuilder(str2).reverse().toString();
        if (reverse.equalsIgnoreCase(str2)){
            return "true";
        } else {
            return "false";
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeTwo(s.nextLine()));
    }

}