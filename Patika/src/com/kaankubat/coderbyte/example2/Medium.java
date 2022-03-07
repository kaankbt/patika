package com.kaankubat.coderbyte.example2;

import java.util.*;
import java.io.*;
import java.lang.*;

class Function {
    int NumberAddition(String str) {
        String numeros = "";
        boolean apareceuNumero = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                numeros += str.charAt(i);
                apareceuNumero = true;
            }
            else if (!Character.isDigit(str.charAt(i)) && apareceuNumero == true) {
                numeros += " ";
                apareceuNumero = false;
            }
        }

        if (numeros.length() > 0) {
            String[] numerosSeparados = numeros.split(" ");

            int soma = 0;
            for (int i = 0; i < numerosSeparados.length; i++) {
                soma += Integer.parseInt(numerosSeparados[i]);
            }

            return soma;
        }
        else {
            return 0;
        }
    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.NumberAddition(s.nextLine()));
    }

}