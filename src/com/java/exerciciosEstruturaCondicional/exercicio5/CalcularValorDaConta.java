package com.java.exerciciosEstruturaCondicional.exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class CalcularValorDaConta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();

        if (cod < 1 || cod > 5) {
            System.out.println("\nCódigo Inválido - Digite um número entre 1 e 5.");
        }
        else {
            int qtd = sc.nextInt();
            double conta = 0.0;
            if (cod == 1) {
                conta = 4.0 * qtd;
            }
            else if (cod == 2) {
                conta = 4.5 * qtd;
            }
            else if (cod == 3) {
                conta = 5.0 * qtd;
            }
            else if (cod == 4) {
                conta = 2.0 * qtd;
            }
            else {
                conta = 1.5 * qtd;
            }
            System.out.printf("\nTOTAL: R$ %.2f%n", conta);
        }
        sc.close();
    }
}