/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaDeTexto;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jhon-
 */
public class frmAbrirGuardarTxt extends javax.swing.JFrame implements ActionListener {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    JButton abrir, guardar;
    JTextArea colocar;
    JPanel fondo;
    
    public static void main(String[] args) {
        frmAbrirGuardarTxt baia = new frmAbrirGuardarTxt();
        baia.setLayout(null);
        baia.setBounds(50, 50, 480, 600);
        baia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        baia.setVisible(true);
        baia.setTitle("TEXTO");
        
    }

    public frmAbrirGuardarTxt() {
        fondo = new JPanel();
        fondo.setLayout(null);
        fondo.setBackground(Color.LIGHT_GRAY);
        fondo.setBounds(0, 0, 480, 600);
        add(fondo);

        abrir = new JButton("Abrir Documento");
        abrir.setBounds(10, 10, 180, 30);
        abrir.addActionListener(this);
        abrir.setActionCommand("abrir");
        fondo.add(abrir);

        guardar = new JButton("Guardar Documento");
        guardar.setBounds(270, 10, 180, 30);
        guardar.addActionListener(this);
        guardar.setActionCommand("guardar");
        fondo.add(guardar);

        colocar = new JTextArea();
        colocar.setBounds(10, 50, 440, 500);
        fondo.add(colocar);
        
    }

    public String AbrirArchivo(File archivo) {
        String documento = " ";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception e) {
        }
        return documento;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("abrir")) {
            if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionar.getSelectedFile();
                if (archivo.canRead()) {
                    if (archivo.getName().endsWith("txt")) {
                        String documento = AbrirArchivo(archivo);
                        colocar.setText(documento);
                    } else {
                        JOptionPane.showMessageDialog(null, "Archivo No compatible");
                    }
                }
            }
        }
        if (ae.getActionCommand().equals("guardar")) {
            if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionar.getSelectedFile();
                if (archivo.getName().endsWith("txt")) {
                    String Documento = colocar.getText();
                    String mensaje = GuardarArchivo(archivo, Documento);
                    if (mensaje != null) {
                        JOptionPane.showMessageDialog(null, mensaje);
                    } else {
                        JOptionPane.showMessageDialog(null, "Archivo No compatible");
                    }
                }
            }
        }
    }

    private String GuardarArchivo(File archivo, String Documento) {
        String mensaje = null;
        try {
            FileOutputStream salida = new FileOutputStream(archivo);
            byte[] bytxt = Documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo Guardado";
        } catch (Exception e) {
        }
        return mensaje;
    }

}
