package com.calculadoracustosistema;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraCustoSistema {
    private static final Logger LOGGER = Logger.getLogger(CalculadoraCustoSistema.class.getSimpleName());

    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setNome();
        desenvolvedor.setSalarioMensalPretendido();
        desenvolvedor.setHorasDiariasDisponiveis();

        LOGGER.log(Level.INFO,"Nome: {}", desenvolvedor.getNome());
        LOGGER.log(Level.INFO,"Salário Mensal Pretendido: {}", desenvolvedor.getSalarioMensalPretendido());
        LOGGER.log(Level.INFO,"Horas Mês: {}", desenvolvedor.getHorasDiarias());
        LOGGER.log(Level.INFO,"Valor/Hora: {}", desenvolvedor.calculaValorHora());

        ItemSistema itemSistema = new ItemSistema();
        itemSistema.setQuantidade();
        HashMap<Object, Object> quantidadeItemSistema = itemSistema.getQuantidade();

        Orcamento orcamento = new Orcamento();

        for (Object ItemSistema : quantidadeItemSistema.keySet()) {

        }
    }
}
