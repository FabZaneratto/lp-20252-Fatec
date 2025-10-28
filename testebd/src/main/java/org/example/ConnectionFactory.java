package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    static String URL = "jdbc:postgresql://localhost:5432/Escola";
    static String USER = "postgres";
    static String PASSWORD = "2705";

    public static Connection getConnection(){
        //tenta Conectar
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e ){
            //Deu erro, não consegui conectar
            throw new RuntimeException("Erro ao conectar " + e.getMessage());
        }
    }
}
