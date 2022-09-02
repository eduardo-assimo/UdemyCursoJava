package com.java.exerciciosEstruturaCondicional.exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class CalcularTempoDeJogo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int duracao = 0;

        if (a < 0 || a > 23 || b < 0 || b > 23) {
            System.out.println("\nNumero Inválido, digite um número entre 0 e 23.");
        }
        else {
            if (a == b) {
                duracao = 24;
            } else if (a > b) {
                duracao = (24-a) + b;
            } else {
                duracao = b - a;
            }
            System.out.println("\nO jogo durou " + duracao + " hora(s)");
        }

        sc.close();
    }
}