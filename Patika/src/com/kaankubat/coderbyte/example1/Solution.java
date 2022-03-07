package com.kaankubat.coderbyte.example1;

import java.util.*;
import java.io.*;

import java.util.*;
import java.io.*;

class Solution {

    public static String StringChallenge(String str) {
        // code goes here
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for ( int i = 0; i < s.length; i++) {
            s[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1);
            sb.append(s[i].substring(0,1).toUpperCase());
            sb.append(s[i].substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}