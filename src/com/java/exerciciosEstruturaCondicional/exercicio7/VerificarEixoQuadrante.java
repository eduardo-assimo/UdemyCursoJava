package com.java.exerciciosEstruturaCondicional.exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class VerificarEixoQuadrante {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("\nORIGEM");
        }
        else if (x == 0.0) {
            System.out.println("\nEIXO Y");
        } else if (y == 0.0) {
            System.out.println("\nEIXO Y");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("\nQ1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("\nQ2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("\nQ3");
        }
        else {
            System.out.println("\nQ4");
        }

        sc.close();
    }
}