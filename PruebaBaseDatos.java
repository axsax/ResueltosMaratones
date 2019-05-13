/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabasedatos;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author jhon-
 */
public class PruebaBaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        datos oe = new datos();
       //oe.Mostrar();
       oe.Ingresar();
    }

}
