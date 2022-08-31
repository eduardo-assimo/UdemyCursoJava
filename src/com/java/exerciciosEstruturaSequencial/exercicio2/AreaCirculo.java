package com.java.exerciciosEstruturaSequencial.exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        Double pi, raio, area;
        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);

        System.out.printf("Area do circulo = %.4f%n", area);

        sc.close();
    }
}
