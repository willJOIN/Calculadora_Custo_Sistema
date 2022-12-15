package com.calculadoracustosistema;

import java.util.HashMap;
import java.util.logging.Logger;

public class CalculadoraCustoSistema {
    private static final Logger LOGGER = Logger.getLogger(CalculadoraCustoSistema.class.getSimpleName());

    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setNome();
        desenvolvedor.setSalarioMensalPretendido();
        desenvolvedor.setHorasDiariasDisponiveis();

        LOGGER.info("Nome: " + desenvolvedor.getNome());
        LOGGER.info("Salário mensal pretendido: " + desenvolvedor.getSalarioMensalPretendido());
        LOGGER.info("Horas diárias: " + desenvolvedor.getHorasDiarias());
        LOGGER.info("Valor/Hora: " + desenvolvedor.calculaValorHora());

        ItemSistema itemSistema = new ItemSistema();
        itemSistema.setQuantidade();
        HashMap<Object, Object> quantidadeItemSistema = itemSistema.getQuantidade();

        Orcamento orcamento = new Orcamento();

        for (Object ItemSistema : quantidadeItemSistema.keySet()) {

        }
    }
}
