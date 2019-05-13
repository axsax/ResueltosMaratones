/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author jhon-
 */
public class PROYECTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vista uno= new vista();
        uno.setLayout(null);
        uno.setTitle("Proyecto");
        uno.setBounds(50,80,480,400);
        uno.setLocationRelativeTo(null);
        uno.setBackground(Color.red);
        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uno.setVisible(true);
    }
    
}
