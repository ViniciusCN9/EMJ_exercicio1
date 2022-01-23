package com.bootcamp.exercicio2;

public class Quadrilatero {

    public static void calculaArea(double base) {
        System.out.println("Área do quadrado: " + (base * base));
    }

    public static void calculaArea(double base1, double base2) {
        System.out.println("Área do retângulo: " + (base1 * base2));
    }

    public static void calculaArea(double baseMenor, double baseMaior, double altura) {
        System.out.println("Área do trapezio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void calculaArea(float diagonalL1, float diagonalL2) {
        System.out.println("Área do losango: " + ((diagonalL1 + diagonalL2) / 2));
    }

}
