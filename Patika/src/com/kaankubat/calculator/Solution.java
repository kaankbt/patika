package com.kaankubat.calculator;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        double num1, num2;

        Scanner kb = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        num1 = kb.nextDouble();

        System.out.println("İkinci sayıyı giriniz");
        num2 = kb.nextDouble();

        System.out.println("________Menü__________");
        System.out.println("1)Toplama");
        System.out.println("2)Çıkarma");
        System.out.println("3)Çarpma");
        System.out.println("4)Bölme");
        System.out.println("______________________");

        System.out.println("Seçiminiz (0-4) :");
        int choice = kb.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your result : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Your result : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Your result : " + (num1 / num2));
                break;
            case 4:
                System.out.println("Your result : " + (num1 * num2));
                break;

            default:
                System.out.println("Please try again !");
        }

    }
}

