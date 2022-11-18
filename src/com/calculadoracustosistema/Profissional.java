package com.calculadoracustosistema;

public final class Profissional {
    private static final int DIAS_UTEIS = 20;
    private static final double FHD = 7;
    private static final double HORAS_UTEIS_MES = DIAS_UTEIS * FHD;
    private String firstName;
    private double salarioMensal;

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return firstName;
    }

    double getSalarioMensal() {
        return salarioMensal;
    }

    void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    double getHorasUteis() {
        return HORAS_UTEIS_MES;
    }

    double calculaValorHora() {
        return ((salarioMensal * 2) / HORAS_UTEIS_MES);
    }
}
