package br.com.conecta;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

// Design Pattern -> Factory
// GoF Pattern (Gang of Four)
// Exemplo: Conexão com Banco
public class ConnectionFactory {

    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
        return new OracleConnection().getConnection();
    }

}
