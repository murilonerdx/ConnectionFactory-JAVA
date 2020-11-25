package br.com.conecta;

   

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTeste {

    public static void main(String[] args) {
        try {
            Connection conn = ConnectionFactory.getConnection();
            if (conn != null) {
                System.out.println("Conexão realizada com sucesso.");
                conn.close();
            }
        } catch (SQLException | ClassNotFoundException | IOException throwables) {
            throwables.printStackTrace();
        }
    }
}


