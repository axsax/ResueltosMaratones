/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemaPropuesto;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Logico extends JFrame implements ActionListener {

    JLabel digitarNombre, escogerPais, labelNombre, labelPais, labelImagen, escogerOtros;
    JPanel panelTodo;
    JComboBox paises, otros;
    JButton botonAparecer;
    JTextField nombre;

    public Logico() {
        setLayout(null);

        digitarNombre = new JLabel("Digite su nombre");
        digitarNombre.setBounds(10, 10, 100, 30);
        add(digitarNombre);

        nombre = new JTextField("                 ");
        nombre.setBounds(10, 40, 100, 30);
        add(nombre);

        escogerOtros = new JLabel("Escoja");
        escogerOtros.setBounds(10, 140, 100, 30);
        add(escogerOtros);

        escogerPais = new JLabel("Eliga su pais");
        escogerPais.setBounds(10, 70, 100, 30);
        add(escogerPais);

        paises = new JComboBox();
        otros = new JComboBox();
        paises.setBounds(10, 100, 100, 30);
        otros.setBounds(10, 170, 100, 30);
        add(paises);
        add(otros);
        otros.addItem("Escudo");
        otros.addItem("Bandera");
        otros.addItem("Mapa");
        otros.addActionListener(this);

        paises.addItem("Colombia");
        paises.addItem("Venezuela");
        paises.addItem("Argentina");
        paises.addItem("Panama");
        paises.addItem("Brazil");
        paises.addActionListener(this);

        panelTodo = new JPanel();
        labelNombre = new JLabel();
        labelPais = new JLabel();
        labelImagen = new JLabel();
        panelTodo.setBounds(150, 40, 200, 190);
        panelTodo.setBackground(Color.yellow);
        panelTodo.add(labelNombre);
        panelTodo.add(labelPais);
        panelTodo.add(labelImagen);

        labelNombre.setBounds(10, 10, 100, 30);
        labelPais.setBounds(10, 20, 100, 30);
        labelImagen.setBounds(10, 30, 300, 250);
        this.add(panelTodo);

        botonAparecer = new JButton();

        botonAparecer.setBounds(10, 230, 100, 30);
        botonAparecer.setText("Presione");
        add(botonAparecer);
        botonAparecer.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == this.botonAparecer) {
            labelNombre.setText(nombre.getText());
            String pais1 = (String) paises.getSelectedItem();
            String otros1 = (String) otros.getSelectedItem();
            System.out.println(pais1);
            if ("Colombia".equals(pais1)) {
                if ("Escudo".equals(otros1)) {
//                        
//                        ImageIcon imagen=new ImageIcon("escudoColombia.png");
//                        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(labelImagen.getHeight(),labelImagen.getWidth(),Image.SCALE_DEFAULT));
//                        labelImagen.setIcon(icono);
//                        this.repaint();
//                    
                    labelPais.setText("Colombia");
                    Icon a = new ImageIcon(getClass().getResource("escudoColombia.png"));
                    labelImagen.setIcon(a);
                } else if ("Bandera".equals(otros1)) {
                    labelPais.setText("Colombia");
                    Icon a = new ImageIcon(getClass().getResource("banderaColombia.png"));
                    labelImagen.setIcon(a);
                } else if ("Mapa".equals(otros1)) {
                    labelPais.setText("Colombia");
                    Icon a = new ImageIcon(getClass().getResource("colombia.png"));
                    labelImagen.setIcon(a);
                }

            } else if ("Venezuela".equals(pais1)) {
                if ("Escudo".equals(otros1)) {
                    labelPais.setText("Venezuela");
                    Icon a = new ImageIcon(getClass().getResource("escudoVenezuela.png"));
                    labelImagen.setIcon(a);
                } else if ("Bandera".equals(otros1)) {
                    labelPais.setText("Venezuela");
                    Icon a = new ImageIcon(getClass().getResource("banderaVenezuela.png"));
                    labelImagen.setIcon(a);
                } else if ("Mapa".equals(otros1)) {
                    labelPais.setText("Venezuela");
                    Icon a = new ImageIcon(getClass().getResource("venezuela.png"));
                    labelImagen.setIcon(a);
                }

            } else if ("Argentina".equals(pais1)) {
                if ("Escudo".equals(otros1)) {
                    labelPais.setText("Colombia");
                    labelPais.setText("Argentina");
                    Icon a = new ImageIcon(getClass().getResource("escudoArgentina.png"));
                    labelImagen.setIcon(a);
                } else if ("Bandera".equals(otros1)) {
                    labelPais.setText("Argentina");
                    Icon a = new ImageIcon(getClass().getResource("banderaArgentina.png"));
                    labelImagen.setIcon(a);
                } else if ("Mapa".equals(otros1)) {
                    labelPais.setText("Argentina");
                    Icon a = new ImageIcon(getClass().getResource("argentina.png"));
                    labelImagen.setIcon(a);
                }

            } else if ("Panama".equals(pais1)) {
                if ("Escudo".equals(otros1)) {
                    labelPais.setText("Panama");
                    Icon a = new ImageIcon(getClass().getResource("escudoPanama.png"));
                    labelImagen.setIcon(a);
                } else if ("Bandera".equals(otros1)) {
                    labelPais.setText("Panama");
                    Icon a = new ImageIcon(getClass().getResource("banderaPanama.png"));
                    labelImagen.setIcon(a);
                } else if ("Mapa".equals(otros1)) {
                    labelPais.setText("Panama");
                    Icon a = new ImageIcon(getClass().getResource("panama.png"));
                    labelImagen.setIcon(a);
                }

            } else if ("Brazil".equals(pais1)) {
                if ("Escudo".equals(otros1)) {
                    labelPais.setText("Brazil");
                    Icon a = new ImageIcon(getClass().getResource("escudoBrazil.png"));
                    labelImagen.setIcon(a);
                } else if ("Bandera".equals(otros1)) {
                    labelPais.setText("Brazil");
                    Icon a = new ImageIcon(getClass().getResource("banderaBrazil.png"));
                    labelImagen.setIcon(a);
                } else if ("Mapa".equals(otros1)) {
                    labelPais.setText("Brazil");
                    Icon a = new ImageIcon(getClass().getResource("brazil.png"));
                    labelImagen.setIcon(a);
                }
            }

        }

    }
}
