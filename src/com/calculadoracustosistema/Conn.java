package com.calculadoracustosistema;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conn {
    private static final Logger LOGGER = Logger.getLogger(Conn.class.getSimpleName());
    private final String url = "jdbc:postgresql://localhost/";
    private final String user = "postgres";
    private final String password = "123";

    protected Connection conn() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE,"Erro ao conectar ao banco de dados!\n" + ex);
        }
        return conn;
    }

    protected void create(Connection conn) {
        String query = """
                CREATE TABLE Orcamento""";

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE,"Erro ao criar tabela no banco de dados!\n" + ex);
        }
    }

    protected void insert(Connection conn) {
        String query = """
                INSERT INTO Orcamento""";

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE,"Erro ao inserir dados no banco de dados!\n" + ex);
        }
    }
}