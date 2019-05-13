/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabasedatos;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author jhon-
 */
public class datos {

    static ResultSet res;
    Vector v = new Vector();
    String nombre, apellido, id, curso;
    int edad;
    public static Connection conexion = null;

    public static Connection getConnection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite usuario");
        String usuario, contrasenia;
        usuario = sc.next();
        System.out.println("Digite la contraseña");
        contrasenia = sc.next();

        String url = "jdbc:sqlserver://LAPTOP-UBG380K9:1433;databaseName=prueba1";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Conecto al driver");
        } catch (ClassNotFoundException ae) {
            System.out.println("paila mano por el driver");
        }

        try {

            conexion = DriverManager.getConnection(url, usuario, contrasenia);
            System.out.println("Conecto al url");
        } catch (SQLException ae) {
            System.out.println("Paila con el url");
        }
        return conexion;
    }

    public static ResultSet consulta(String consulta) {
        Connection con = getConnection(); //Connection es la clase importada
        try {
            Statement declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException ae) {
            System.out.println("Paila, no se pudo establcer conecxion, error en el metodo de consulta");
        }
        return null;
    }

    public void Mostrar() {// como no se crea un objeto entonces toca dejarlo static para poder acceder al metodo
        res = consulta("select * from tablita");
        System.out.println("intentando");
        try {
            while (res.next()) {
                System.out.println("1");
                System.out.println(res.getString(1));
                System.out.println(res.getString(2));
                System.out.println(res.getString(3));
                System.out.println(res.getString(4));
                System.out.println(res.getInt(5));
            }

            System.out.println("2");

        } catch (SQLException ae) {
            System.out.println("Paila impresion");
            System.out.println(ae);
        }
    }
    PreparedStatement ps;
     
    Connection cin= getConnection();

    //nombre, apellido, id, curso 
    public void Ingresar() throws SQLException {
        Scanner sc = new Scanner(System.in);
        CallableStatement entrada = datos.getConnection().prepareCall("{call Ingresar (?,?,?,?,?)}");
        String insertar = "insert into tablita values (?,?,?,?,?)";
        System.out.println("entro ingresar 1");
        try {
            
            ps = cin.prepareCall(insertar);
            System.out.println("Digite la id");
            ps.setString(1, sc.next());
            System.out.println("Digite el nombre");
            ps.setString(2, sc.next());
            System.out.println("Digite el apelldio");
            ps.setString(3, sc.next());
            System.out.println("Digite el grupo");
            ps.setString(4, sc.next());
            System.out.println("Digite la edad");
            ps.setInt(5, sc.nextInt());
            System.out.println("1");
            int registro=ps.executeUpdate();
            System.out.println("2");
            if (registro>0) {
                System.out.println("Bien");
            }else{
                System.out.println("paila manito");
            }
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("exepcion"+e);
        }

    }
}
