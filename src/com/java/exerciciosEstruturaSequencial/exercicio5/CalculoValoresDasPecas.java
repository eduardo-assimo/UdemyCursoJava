package com.java.exerciciosEstruturaSequencial.exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class CalculoValoresDasPecas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int cp1, qp1, cp2, qp2;
        double vp1, vp2, vt;

        cp1 = sc.nextInt();
        qp1 = sc.nextInt();
        vp1 = sc.nextDouble();
        System.out.println();
        cp2 = sc.nextInt();
        qp2 = sc.nextInt();
        vp2 = sc.nextDouble();

        vt = qp1*vp1 + qp2*vp2;

        System.out.printf("\nO valor total a ser pago pela soma das peças é: U$ %.2f%n", vt);

        sc.close();
    }
}
