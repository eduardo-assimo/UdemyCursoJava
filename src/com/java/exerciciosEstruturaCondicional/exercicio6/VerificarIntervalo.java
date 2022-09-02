package com.java.exerciciosEstruturaCondicional.exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class VerificarIntervalo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if (n < 0 || n > 100) {
            System.out.println("\nFora de intervalo.");
        }
        else {
            if (n <= 25) {
                System.out.println("\nIntervalo [0,25]");
            }
            else if (n <= 50) {
                System.out.println("\nIntervalo [25,50]");
            }
            else if (n <= 75) {
                System.out.println("\nIntervalo [50,75]");
            }
            else {
                System.out.println("\nIntervalo [75,100]");
            }
        }

        sc.close();
    }
}