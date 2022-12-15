package com.calculadoracustosistema;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conn {
    private static final Logger LOGGER = Logger.getLogger(Conn.class.getSimpleName());

    protected Connection conn() {
        Connection conn = null;

        try {
            String url = "jdbc:postgresql://localhost/";
            String user = "postgres";
            String password = "123";

            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE,"Erro ao conectar ao banco de dados!\n" + ex);
        }
        return conn;
    }

    protected void create(Connection conn) {
        String query = """
                       CREATE TABLE db.orcamento
                       "(tipoItemSistema INT,
                       "dificuldadeItemSistema INT,
                       "horaTotalSistema INT,
                       "custoTotalSistema INT);""";

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE,"Erro ao criar tabela no banco de dados!\n" + ex);
        }
    }

    protected void insert(Connection conn) {
        String query = "INSERT INTO db.orcamento VALUES (tipoItemSistema , dificuldadeItemSistema,horaTotalSistema,custoTotalSistema);";

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE,"Erro ao inserir dados no banco de dados!\n" + ex);
        }
    }
}