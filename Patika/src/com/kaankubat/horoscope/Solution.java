package com.kaankubat.horoscope;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Please enter mounth and day you were born: ");
        System.out.println(" Month.Day Example:11.01 or 01.01 or 12.06");
        //input.skip("a");
        double n1 = input.nextDouble();
        System.out.print("Your zodiac sign is: ");
        if (n1>= 12.22 || n1<=01.21) {System.out.println("Capricorn");}
        else if (n1>= 01.22 && n1<=02.19) {System.out.println("Aquarius ");}
        else if (n1 >= 02.20 && n1<=03.20) {System.out.println("Pisces");}
        else if (n1 >= 03.21 && n1<=04.20) {System.out.println("Aries");}
        else if (n1 >= 04.21 && n1<=05.21) {System.out.println("Taurus:");}
        else if (n1 >= 05.22 && n1<=06.22) {System.out.println("Gemini");}
        else if (n1 >= 06.23 && n1<=07.22) {System.out.println("Cancer");}
        else if (n1 >= 07.23 && n1<=08.22) {System.out.println("Leo");}
        else if (n1 >= 08.23 && n1<=09.22) {System.out.println("Virgo");}
        else if (n1 >= 09.23 && n1<=10.22) {System.out.println("Libra");}
        else if (n1 >= 10.23 && n1<=11.21) {System.out.println("Scorpio");}
        else if (n1 >= 11.22 && n1<=12.21) {System.out.println("Sagittarius");}

    }
}
