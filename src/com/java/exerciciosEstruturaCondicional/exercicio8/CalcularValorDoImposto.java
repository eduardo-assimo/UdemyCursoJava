package com.java.exerciciosEstruturaCondicional.exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class CalcularValorDoImposto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        double sal = sc.nextDouble();
        double imp = 0;

        if (sal < 0.0) {
            System.out.println("\nValor Inválido: valor mínimo é de R$ 0.00");
        }
        else if (sal <= 2000.0) {
            System.out.println("\nISENTO");
        }
        else {
            if (sal <= 3000.0) {
                imp = (sal - 2000.0) * 0.08;
            } else if (sal <= 4500.0) {
                imp = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
            }
            else {
                imp = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            }
            System.out.printf("\nIMPOSTO NO VALOR DE R$ %.2f%n", imp);
        }

        sc.close();
    }
}