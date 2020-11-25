package br.com.conecta;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnection {

    private Properties props;

    public OracleConnection() throws IOException {
        props = new Properties();

        props.load(new FileInputStream("src\\br\\com\\application.properties"));
    }

    public Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName("oracle.jdbc.driver.OracleConnection");
            return DriverManager.getConnection(props.getProperty("database.url"), props.getProperty("database.user"),
                    props.getProperty("database.password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
    }

    
    
}
