/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy_sistemas_operativos;

import java.awt.Color;

import javax.swing.JFrame;

/**
 *
 * @author jhon-
 */
public class inicio {

    public static void main(String[] args) {
        empesamos uno = new empesamos();
        uno.setLayout(null);
        uno.setTitle("Parcial 2");
        uno.setSize(1250, 680);
        
        //uno.setExtendedState(MAXIMIZED_BOTH);
        
        uno.setLocationRelativeTo(null);
        uno.setBackground(Color.BLACK);
        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uno.setVisible(true);
    }
}
