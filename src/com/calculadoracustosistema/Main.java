package com.calculadoracustosistema;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setNome();
        desenvolvedor.setSalarioMensalPretendido();
        desenvolvedor.setHorasDiariasDisponiveis();

        LOGGER.info("Nome: " + desenvolvedor.getNome() + "\n");
        LOGGER.info("Salário mensal pretendido: " + desenvolvedor.getSalarioMensalPretendido() + "\n");
        LOGGER.info("Horas diárias: " + desenvolvedor.getHorasDiarias() + "\n");

        int valorHora =  desenvolvedor.calculaValorHora();

        LOGGER.info("Valor/Hora: " + valorHora + "\n");

        ItemSistema itemSistema = new ItemSistema();
        itemSistema.setQuantidade();
        HashMap<Object, Object> quantidadeItemSistema = itemSistema.getQuantidade();

        Orcamento orcamento = new Orcamento();
        int horasTotais = 0;

        for (Map.Entry<Object, Object> mapitemSistema : quantidadeItemSistema.entrySet()) {
            horasTotais = horasTotais + orcamento.calcularItemSistema(mapitemSistema);
        }

        LOGGER.info("Valor total do sistema: R$ " + orcamento.calcularTotalSistema(valorHora, horasTotais));
    }
}
