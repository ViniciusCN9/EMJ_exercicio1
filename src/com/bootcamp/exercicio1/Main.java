package com.bootcamp.exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 1 para Calculadora \nDigite 2 para Mensagem \nDigite 3 para Empréstimo");
        short escolha = input.nextShort();

        switch (escolha) {
            case 1 -> Calculadora.executaPrimeiroExercicio();
            case 2 -> Mensagem.executaSegundoExercicio();
            case 3 -> Emprestimo.executaTerceiroExercicio();
            default -> System.out.println("Dígito inválido");
        }

    }


}
