/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import static modelo.DbConnection.getConnection;

/**
 *
 * @author jhon-
 */
public class ProcesoInformacionCliente {

    private DbConnection conexion;



    public ProcesoInformacionCliente() throws ClassNotFoundException {
        this.conexion = new DbConnection();
    }

    public void listarCliente() {
        String strConsulta = "select *from cliente";
        int registros = 0;
        System.out.println("intentando");
        try {
            PreparedStatement pstm = conexion.getConnection().prepareStatement(strConsulta);
            ResultSet res = pstm.executeQuery();
            
            String codigo = "";
            String nombre = "";
            String apellido = "";
            String telefono = "";
            String correo = "";
            int i = 0;
            while (res.next()) {

                System.out.println("1");
                codigo = res.getString(1);
                nombre = res.getString(2);
                apellido = res.getString(3);
                telefono = res.getString(4);
                correo = res.getString(5);
                i++;
                System.out.println(codigo + "\t" + nombre + "\t" + apellido + "\t" + telefono + "\t" + correo);
            }
            res.close();

        } catch (SQLException e) {
            System.out.println("Paila impresion");
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void consultarCliente(String codigoCliente) {
        String codigo = codigoCliente;
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String correo = "";
        String consultaSql = "SELECT * FROM cliente WHERE codigocli = ?";
        try {
            PreparedStatement inst
                    = conexion.getConnection().prepareStatement(consultaSql);
            inst.setString(1, codigo);
            ResultSet rs = inst.executeQuery();

            while (rs.next() == true) {
                nombre = rs.getString(2);
                apellido = rs.getString(3);
                telefono = rs.getString(4);
                correo = rs.getString(5);

                System.out.println(codigo + " " + nombre + " " + apellido + " " + telefono + " " + correo);

            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

    public void registrarCliente(Cliente unCliente) {
        String codigo = unCliente.getCodigo();
        String nombre = unCliente.getNombre();
        String apellido = unCliente.getApellido();
        String telefono = unCliente.getTelefono();
        String correo = unCliente.getCorreo();
        String registroCliente = "INSERT INTO "
                + "cliente(codigocli,nombrecli,apellidocli,telefonocli,correocli)VALUES(?,?,?,?,?) ";
        try {
            PreparedStatement inst = DbConnection.getConnection().prepareStatement(registroCliente);
            inst.setString(1, codigo);
            inst.setString(2, nombre);
            inst.setString(3, apellido);
            inst.setString(4, telefono);
            inst.setString(5, correo);
            inst.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void actualizarDatosCliente(String codigo,
            String nombre, String apellido, String telefono,
            String correo) {
        String actualizarSql = "UPDATE cliente SET nombrecli='" + nombre + "',apellidocli='" + apellido + "', telefonocli='" + telefono + "', correocli='" + correo + "'WHERE codigocli='" + codigo + "'";
        try {
            PreparedStatement inst = conexion.getConnection().prepareStatement(actualizarSql);

            inst.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);

        } catch (Exception ex) {
            System.out.println(ex.toString());

        }

    }

    public void borrraDatosCliente(String codigoCliente) {
        String codigo = codigoCliente;
        String borraSql = "DELETE FROM cliente WHERE codigocli = ?";
        try {
            PreparedStatement inst = conexion.getConnection().prepareStatement(borraSql);
            inst.setString(1, codigo);
            inst.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

 
}
