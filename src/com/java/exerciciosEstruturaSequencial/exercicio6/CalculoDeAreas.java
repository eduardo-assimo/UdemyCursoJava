package com.java.exerciciosEstruturaSequencial.exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDeAreas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangulo = (a*c) / 2;
        areaCirculo = 3.14159 * Math.pow(c, 2);
        areaTrapezio = (a+b)*c / 2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;

        System.out.printf("\nárea do TRIANGULO = %.3f%n", areaTriangulo);
        System.out.printf("\nárea do CIRCULO = %.3f%n", areaCirculo);
        System.out.printf("\nárea do TRAPEZIO = %.3f%n", areaTrapezio);
        System.out.printf("\nárea do QUADRADO = %.3f%n", areaQuadrado);
        System.out.printf("\nárea do RETANGULO = %.3f%n", areaRetangulo);

        sc.close();
    }
}