package com.java.exerciciosEstruturaCondicional.exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class VerificarNumeroParOuImpar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("\nPAR");
        }
        else {
            System.out.println("\nIMPAR");
        }

        sc.close();
    }
}