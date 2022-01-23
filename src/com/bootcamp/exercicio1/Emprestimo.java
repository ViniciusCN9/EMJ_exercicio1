package com.bootcamp.exercicio1;

import java.util.Scanner;

public class Emprestimo {

    public static void executaTerceiroExercicio() {
        Scanner input = new Scanner(System.in);

        float JUROS_PRIMEIRA_FAIXA = 0.5F;
        float JUROS_SEGUNDA_FAIXA = 0.2F;
        float JUROS_TERCEIRA_FAIXA = 0.1F;


        System.out.println("Insira a quantia do empréstimo: ");
        double valorSolicitado = input.nextDouble();

        if (valorSolicitado < 10000.00) {
            exibeTotal(JUROS_PRIMEIRA_FAIXA, valorSolicitado);

        } else if (valorSolicitado >= 10000.00 && valorSolicitado < 50000.00) {
            exibeTotal(JUROS_SEGUNDA_FAIXA, valorSolicitado);

        } else {
            exibeTotal(JUROS_TERCEIRA_FAIXA, valorSolicitado);
        }

    }

    public static void exibeTotal(float juros, double valor) {
        System.out.println("O total á pagar é de: R$" + (valor + (valor * juros)));
    }
}
