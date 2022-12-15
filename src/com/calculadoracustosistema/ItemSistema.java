package com.calculadoracustosistema;

import java.util.logging.Logger;
import java.util.Scanner;
import java.util.Objects;
import java.util.HashMap;

public final class ItemSistema {
    private static final Logger LOGGER = Logger.getLogger(ItemSistema.class.getSimpleName());
    private HashMap<Object, Object> quantidade = new HashMap<>();

    void setQuantidade() {
        Scanner leitor = new Scanner(System.in);

        String tipo = "";
        int dificuldade;
        HashMap<Object, Object> quantidadeLoop = new HashMap<>();

        while (!Objects.equals(tipo, "sair")) {
            LOGGER.info("""
                    Digite o tipo de tela você quer no sistema:
                    
                    "a. Tela com entradas e saídas de dados
                    "b. Tela com consultas com informação de dados
                    "c. Tela com gravação de dados
                    
                    Digite "sair" para parar de adicionar telas""");

            tipo = leitor.next();

            if (!Objects.equals(tipo, "sair")) {
                LOGGER.info("""
                    Digite o grau de dificuldade da tela que você quer no sistema:
                    
                    "1. Fácil
                    "2. Médio
                    "3. Difícil
                    
                    Digite "sair" para parar de adicionar telas""");
            } else {
                break;
            }

            dificuldade = leitor.nextInt();

            if (!Objects.equals(tipo, "sair")) {
                quantidadeLoop.put(tipo, dificuldade);
            } else {
                break;
            }
        }
        this.quantidade = quantidadeLoop;
    }

    HashMap<Object, Object> getQuantidade() {
        return quantidade;
    }
}
