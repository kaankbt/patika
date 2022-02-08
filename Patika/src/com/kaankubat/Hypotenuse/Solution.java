package com.kaankubat.Hypotenuse;

import java.util.Scanner;

public class Solution {
        public static void main(String[] args) {

            double edge1, edge2, edge3, u, area;


            Scanner input1 = new Scanner(System.in);
            System.out.print("Please write first edge : ");
            edge1 = input1.nextDouble();

            Scanner input2 = new Scanner(System.in);
            System.out.print("Please write second edge : ");
            edge2 = input2.nextDouble();

            Scanner input3 = new Scanner(System.in);
            System.out.print("Please write third edge : ");
            edge3 = input3.nextDouble();

            u = (edge1 + edge2 + edge3) / 2;
            area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));

            System.out.print("The area is : " + area);

        }
    }