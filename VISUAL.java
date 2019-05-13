/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_segundo_corte;

import java.awt.Color;
import javax.swing.JFrame;


/**
 *
 * @author jhon-
 */
public class VISUAL {
    public static void main(String[] args) {
        logico uno= new logico();
        uno.setLayout(null);
        uno.setTitle("Parcial 2");
        uno.setBounds(50,80,480,600);
        uno.setLocationRelativeTo(null);
        uno.setBackground(Color.BLACK);
        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uno.setVisible(true);
    }
}
