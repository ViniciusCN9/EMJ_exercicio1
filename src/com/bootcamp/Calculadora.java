package com.bootcamp;

import java.util.Scanner;

public class Calculadora {

    public static void executaPrimeiroExercicio() {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double primeiroValor = input.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double segundoValor = input.nextDouble();

        exibeOperacoes(primeiroValor, segundoValor);
    }

    public static void exibeOperacoes(double valorA, double valorB) {
        System.out.println("Soma: " + (valorA + valorB) + "\n" + "Subtração: " + (valorA - valorB) + "\n" + "Multiplicação: " + (valorA * valorB) + "\n" + "Divisão: " + (valorA / valorB));
    }
}
