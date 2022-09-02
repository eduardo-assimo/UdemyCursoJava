package com.java.exerciciosEstruturaCondicional.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class VerificarSeNumeroNegativoOuNao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("\nNEGATIVO");
        }
        else {
            System.out.println("\nNÃO NEGATIVO");
        }

        sc.close();
    }
}