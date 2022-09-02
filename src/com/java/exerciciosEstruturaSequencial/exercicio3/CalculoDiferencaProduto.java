package com.java.exerciciosEstruturaSequencial.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDiferencaProduto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, calculo;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        calculo = (a*b - c*d);
        System.out.println();
        System.out.println("A diferença é " + calculo);

        sc.close();
    }
}