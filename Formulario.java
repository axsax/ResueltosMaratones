/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg2;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author jhon-
 */
public class Formulario extends JFrame implements ItemListener{
    
    private JComboBox combo1;
    public Formulario(){
        setLayout(null);
        combo1=new JComboBox();
        combo1.setBounds(10, 10, 500, 120);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
    }
    
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource()==combo1) {
            String seleccionado=(String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
   
    }
   
    
}
