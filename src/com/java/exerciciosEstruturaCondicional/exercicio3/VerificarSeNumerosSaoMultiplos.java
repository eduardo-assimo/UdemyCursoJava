package com.java.exerciciosEstruturaCondicional.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class VerificarSeNumerosSaoMultiplos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("\nSao Multiplos");
        }
        else {
            System.out.println("\nNao sao Multiplos");
        }

        sc.close();
    }
}