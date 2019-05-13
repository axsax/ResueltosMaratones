/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComboBox_y_CheckBox;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author jhon-
 */
public class Visual {
    public static void main(String[] args) {
         Logico uno=new Logico();  
         uno.setLayout(null);
        uno.setTitle("TELEFONIA");
        uno.setSize(Toolkit.getDefaultToolkit().getScreenSize());
       
        // uno.setBounds(50, 50, 480,400 );
        uno.setLocationRelativeTo(null);
        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uno.setVisible(true);
        
    }
}
