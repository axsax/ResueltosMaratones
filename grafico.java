/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendedora;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author jhon-
 */
public class grafico {

    public static void main(String[] args) {
        logico uno = new logico();
        uno.setLayout(null);
        uno.setTitle("Dia");
        uno.setSize(1250, 600);
        uno.setLocationRelativeTo(null);
        uno.setBackground(Color.BLACK);

        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uno.setVisible(true);
    }
}
