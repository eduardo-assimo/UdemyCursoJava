package com.java.exerciciosEstruturaSequencial.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class SomaValores {

    public  static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;

        System.out.println("Soma = " + soma);

        sc.close();
    }
}
