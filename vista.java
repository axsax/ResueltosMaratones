/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practiaca_CheckBox;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author jhon-
 */
public class vista {

    public static void main(String[] args) {
        logica uno = new logica();
        uno.setLayout(null);
        uno.setTitle("Dia");
        uno.setBounds(50, 50, 480, 400);
        uno.setLocationRelativeTo(null);
        uno.setBackground(Color.yellow);
        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uno.setVisible(true);

    }
}
