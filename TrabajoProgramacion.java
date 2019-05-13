/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author jhon-
 */
public class TrabajoProgramacion  {

    /**
     * @param args the command line arguments
     */   Persona uno =new Persona();
                  Empleado uno1=new Empleado();
           
         
    public static void main(String[] args) {
               TrabajoProgramacion uno= new TrabajoProgramacion();
          
    }
    TrabajoProgramacion(){
        uno.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre"));
        int edad;
        edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad"));
        uno.setEdad(edad);
        double sueldo;
        sueldo=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el sueldo"));
        uno1.setSueldo(sueldo);
        JOptionPane.showMessageDialog(null,"La persona con nombre " + uno.getNombre()+" tiene "+uno.getEdad()+" años y su sueldo es de "+uno1.getSueldo());
}
}
