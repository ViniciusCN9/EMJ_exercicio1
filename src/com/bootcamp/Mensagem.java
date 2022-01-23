package com.bootcamp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {

    public static void executaSegundoExercicio() {

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String horarioAtual = (formatoHora.format(LocalDateTime.now()));
        String textoHora = horarioAtual.substring(0, 2);
        int valorHora = Integer.parseInt(textoHora);

        if (valorHora > 0 && valorHora < 12) {
            System.out.println("Bom dia! \nsão " + horarioAtual);
        } else if (valorHora >= 12 && valorHora < 18) {
            System.out.println("Boa tarde! \nsão " + horarioAtual);
        } else {
            System.out.println("Boa noite! \nsão " + horarioAtual);
        }
    }
}
