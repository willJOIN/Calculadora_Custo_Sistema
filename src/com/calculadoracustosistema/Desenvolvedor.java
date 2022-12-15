package com.calculadoracustosistema;

import java.util.logging.Logger;
import java.util.Scanner;

public final class Desenvolvedor {
    private static final Logger LOGGER = Logger.getLogger(Desenvolvedor.class.getSimpleName());
    private static final int DIAS_UTEIS = 20;
    private String nome;
    private double salarioMensalPretendido;
    private int horasDiariasDisponiveis;

    void setNome() {
        Scanner leitor = new Scanner(System.in);
        LOGGER.info("Digite o nome do desenvolvedor:\n");
        this.nome = leitor.next();
    }

    String getNome() {
        return nome;
    }

    void setSalarioMensalPretendido() {
        Scanner leitor = new Scanner(System.in);
        LOGGER.info("Digite o salario do desenvolvedor:\n");
        this.salarioMensalPretendido = leitor.nextDouble();
    }

    double getSalarioMensalPretendido() {
        return salarioMensalPretendido;
    }

    void setHorasDiariasDisponiveis() {
        Scanner leitor = new Scanner(System.in);
        LOGGER.info("Digite as horas diarias disponiveis do desenvolvedor:\n");
        this.horasDiariasDisponiveis = leitor.nextInt();
    }

    int getHorasDiarias() {
        return horasDiariasDisponiveis;
    }

    double calculaValorHora() {
        return (salarioMensalPretendido / DIAS_UTEIS * horasDiariasDisponiveis);
    }
}
