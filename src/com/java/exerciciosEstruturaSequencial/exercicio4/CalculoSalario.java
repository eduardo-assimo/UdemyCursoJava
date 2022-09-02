package com.java.exerciciosEstruturaSequencial.exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int nf, ht;
        double vht, sal;

        nf = sc.nextInt();
        ht = sc.nextInt();
        vht = sc.nextDouble();

        sal = ht *vht;

        System.out.println("\nNúmero do Funcionário: " + nf);
        System.out.printf("Salário do Funcionário Mensal: U$ %.2f%n", sal);

        sc.close();
    }
}