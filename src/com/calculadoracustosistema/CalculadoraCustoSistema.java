package com.calculadoracustosistema;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraCustoSistema {
    private static final Logger LOGGER = Logger.getLogger(CalculadoraCustoSistema.class.getName());

    public static void main(String[] args) {
        Profissional profissional = new Profissional();
        profissional.setFirstName("Gilberto");
        profissional.setSalarioMensal(1800.00);

        LOGGER.log(Level.INFO,"Nome: {}", profissional.getFirstName());
        LOGGER.log(Level.INFO,"Salário Mensal Pretendido: {}", profissional.getSalarioMensal());
        LOGGER.log(Level.INFO,"Horas Mês: {}", profissional.getHorasUteis());
        LOGGER.log(Level.INFO,"Valor/Hora: {}", profissional.calculaValorHora());

        TelaSistema[] listaTelaSistemas = new TelaSistema[4];

        TelaSistema tela1 = new TelaSistema();
        tela1.setNomeTela("Tela de Login");
        tela1.setComplexidade(3);
        listaTelaSistemas[0] = tela1;

        TelaSistema tela2 = new TelaSistema();
        tela2.setNomeTela("Tela de Cadastro");
        tela2.setComplexidade(3);
        listaTelaSistemas[1] = tela2;

        TelaSistema tela3 = new TelaSistema();
        tela3.setNomeTela("Tela de Pesquisa");
        tela3.setComplexidade(2);
        listaTelaSistemas[2] = tela3;

        TelaSistema tela4 = new TelaSistema();
        tela4.setNomeTela("Saída com Filtro");
        tela4.setComplexidade(1);
        listaTelaSistemas[3] = tela4;

        int totalHorasTelas = 0;
        int numeroTela = 1;

        for (TelaSistema telaSistema : listaTelaSistemas) {
            totalHorasTelas = totalHorasTelas + telaSistema.calcularQtdHoras();

            LOGGER.log(Level.INFO,"Tela " + numeroTela + " do orçamento: " + telaSistema.getNomeTela());
            LOGGER.log(Level.INFO,"Complexidade do Tela: " + telaSistema.getComplexidade());
            LOGGER.log(Level.INFO,"Quantidade de Horas Previstas: " + telaSistema.calcularQtdHoras());

            numeroTela = numeroTela + 1;
        }
        double valorTotalSistema = profissional.calculaValorHora() * totalHorasTelas;

        LOGGER.log(Level.INFO, (String.format("Valor Total do Orçamento: R$%s", String.format("%.00f", valorTotalSistema))));
    }
}
