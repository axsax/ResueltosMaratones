/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author jhon-
 */
public class DbConnection {

    private static String bd = "empresa";
    private static String login = "sa";
    private static String password = "123";
    private static String url = "jdbc:sqlserver://LAPTOP-UBG380K9:1433;databaseName=" + bd;
    static Connection conn = null;

    public DbConnection() throws ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, login, password);
            System.out.println("Conecto al driver");
        } catch (SQLException ae) {
            System.out.println(ae);
        } catch (ClassNotFoundException ae) {
            System.out.println(ae);
        }
    }

    public static Connection getConnection() {
        return conn;
    }
    public void desconectar(){
        conn= null;
    }
}
