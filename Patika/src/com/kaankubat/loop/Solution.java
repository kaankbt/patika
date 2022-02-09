package com.kaankubat.loop;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int number,sum=0,count=0,average;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen sayiyi giriniz: ");
        number = input.nextInt();

        for (int i = 1; i<number; i++){
            if (i % 3 == 0 && i%4 ==0){
                sum += i;
                count++;
            }
        }

        //Donguden sonra sayilarin kendi aralarinda toplamini ve kac adet olduklarini biliyoruz ortalama degeri ekrana bastiralim.
        average = sum / count;
        System.out.println("3'e ve 4'e Tam Bolunen Sayilarin Ortalamasi : " +average);
    }
}