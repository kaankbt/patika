package com.kaankubat.gradeAvarage;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int math, physics, chemical, biology, turkish, music;
        Scanner kb = new Scanner(System.in);

        System.out.print("Your Math score:");
        math = kb.nextInt();

        System.out.print("Your Physics score:");
        physics = kb.nextInt();

        System.out.print("Your Chemical score : ");
        chemical = kb.nextInt();

        System.out.print("Your Biology score : ");
        biology = kb.nextInt();

        System.out.print("Your Turkish score : ");
        turkish = kb.nextInt();

        System.out.print("Your Music score : ");
        music = kb.nextInt();

        int total = math + physics + chemical + biology + turkish + music;
        int result = total / 6;

        while (result >= 60) {
            System.out.println("Passed the class");
            break;
        }
        while (result <= 60) {
            System.out.println("Failed the class");
            break;
        }

    }
}
