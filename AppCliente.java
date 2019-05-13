/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Cliente;
import modelo.ProcesoInformacionCliente;

/**
 *
 * @author jhon-
 */
public class AppCliente extends javax.swing.JFrame implements ActionListener {

    private Scanner input;
    private Cliente cliente;
    private ProcesoInformacionCliente procesoCliente;
    JPanel fondo;
    JLabel titulo, codigo, nombre, apellido, telefono, correoElectronico;
    JComboBox seleccion;

    public AppCliente() throws ClassNotFoundException {
        this.input = new Scanner(System.in);
        this.procesoCliente = new ProcesoInformacionCliente();
        this.cliente = new Cliente();

        fondo = new JPanel();
        fondo.setLayout(null);
        fondo.setBackground(Color.LIGHT_GRAY);
        fondo.setBounds(0, 0, 480, 600);
        add(fondo);

        titulo = new JLabel();
        titulo.setText("QUE DESEA REALIZAR");
        titulo.setBounds(10, 10, 200, 30);
        fondo.add(titulo);

        codigo = new JLabel();
        codigo.setText("Codigo");
        codigo.setBounds(10, 10, 100, 30);
        fondo.add(codigo);

        nombre = new JLabel();
        nombre.setText("Nombre");
        nombre.setBounds(10, 10, 100, 30);
        fondo.add(nombre);

        apellido = new JLabel();
        apellido.setText("Codigo");
        apellido.setBounds(10, 10, 100, 30);
        fondo.add(apellido);
        
        telefono = new JLabel();
        telefono.setText("Codigo");
        telefono.setBounds(10, 10, 100, 30);
        fondo.add(telefono);

    }

    public static void main(String[] args) throws ClassNotFoundException {

        AppCliente app = new AppCliente();
        app app
        .selecionarOpcion(1);
        app.selecionarOpcion(2);
        app.selecionarOpcion(3);
        app.selecionarOpcion(4);
        app.selecionarOpcion(5);

    }

    public void selecionarOpcion(int opc) {
        if (opc == 1) {
            adicinarCliente();
        } else if (opc == 2) {
            listarCliente();
        } else if (opc == 3) {
            consultarCliente();
        } else if (opc == 4) {
            modificarCliente();
        } else if (opc == 5) {
            borrarCliente();
        }
    }

    //actionPerformrd
    public void consultarCliente() {
        System.out.println("\n Consulta por codigo\n");
        System.out.println("Digitar Codigo");
        String codigo = input.next();
        procesoCliente.consultarCliente(codigo);
    }

    public void modificarCliente() {
        System.out.println("\n Actualizar Datos\n");
        System.out.println("Digitar Codigo Nombre Apellido Telefono Correo");
        String codigo = input.nextLine();
        String nombre = input.nextLine();
        String apellidos = input.nextLine();
        String telefono = input.nextLine();
        String correo = input.nextLine();
        procesoCliente.actualizarDatosCliente(codigo, nombre, apellidos, telefono, correo);

    }

    public void listarCliente() {
        procesoCliente.listarCliente();
    }

    public void adicinarCliente() {
        System.out.println("\n Adicionar Datos\n");
        System.out.println("Digitar Codigo Nombre Apellido Telefono Correo");
        this.cliente = new Cliente();
        String codigo = input.nextLine();
        String nombre = input.nextLine();
        String apellidos = input.nextLine();
        String telefono = input.nextLine();
        String correo = input.nextLine();

        cliente.setCodigo(codigo);
        cliente.setNombre(nombre);
        cliente.setApellido(apellidos);
        cliente.setTelefono(telefono);
        cliente.setCorreo(correo);
        procesoCliente.registrarCliente(cliente);

    }

    public void ingresarNuevoCliente(int x) {

    }

    public void borrarCliente() {
        System.out.println("Borrar datos");
        System.out.println("Digitar codigo");
        String codigo = input.nextLine();
        procesoCliente.borrraDatosCliente(codigo);
        System.out.println("Registro borrado");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
