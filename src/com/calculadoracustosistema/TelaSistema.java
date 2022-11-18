package com.calculadoracustosistema;

public final class TelaSistema {
    private String nomeTela;
    private int complexidade;

    void setNomeTela(String nomeTela) {
        this.nomeTela = nomeTela;
    }

    String getNomeTela() {
        return nomeTela;
    }

    void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    int getComplexidade() {
        return complexidade;
    }

    int calcularQtdHoras() {
        return switch (complexidade) {
            case 1 -> 24;
            case 2 -> 48;
            case 3 -> 72;
            default -> 96;
        };
    }
}
