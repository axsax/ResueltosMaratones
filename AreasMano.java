/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasmano;

import javax.swing.JFrame;

/**
 *
 * @author jhon-
 */
public class AreasMano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logica ey=new logica();
        
        ey.setVisible(true);
       
        
        ey.setBounds(500, 500, 500, 500); 
        ey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
