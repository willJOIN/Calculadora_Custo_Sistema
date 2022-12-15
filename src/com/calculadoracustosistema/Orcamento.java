package com.calculadoracustosistema;

import java.util.Map;

public class Orcamento {
    int calcularItemSistema(Map.Entry<Object, Object> mapitemSistema) {
        String tipo = (String) mapitemSistema.getKey();
        int dificuldade = (int) mapitemSistema.getValue();
        int horas;

        switch (tipo) {
            case "a" -> {
                switch (dificuldade) {
                    case 1 -> horas = 8;
                    case 2 -> horas = 12;
                    case 3 -> horas = 16;
                    default -> throw new IllegalStateException("Valor inesperado: " + dificuldade);
                }
            }
            case "b" -> {
                switch (dificuldade) {
                    case 1 -> horas = 4;
                    case 2 -> horas = 6;
                    case 3 -> horas = 8;
                    default -> throw new IllegalStateException("Valor inesperado: " + dificuldade);
                }
            }
            case "c" -> {
                switch (dificuldade) {
                    case 1 -> horas = 16;
                    case 2 -> horas = 24;
                    case 3 -> horas = 36;
                    default -> throw new IllegalStateException("Valor inesperado: " + dificuldade);
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + dificuldade);
        }
        return horas;
    }

    int calcularTotalSistema(int valorHora, int horasTotais) {
        int valorTotal = (valorHora * horasTotais);

        int porcentagem = (int) (valorTotal * (30.0f / 100.0f));

        return valorTotal + porcentagem;
    }
}
