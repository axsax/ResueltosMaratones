/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optionpanepromedio;

import javax.swing.JOptionPane;

/**
 *
 * @author jhon-
 */
public class logica {
    logica(){
    JOptionPane.showMessageDialog(null, "Digite las 4 notas","PROMEDIO DE ASIGNATURA",JOptionPane.PLAIN_MESSAGE);    
    
    String asignatura=JOptionPane.showInputDialog(null,"Digite la asignatura","Asignatura",JOptionPane.WARNING_MESSAGE);
        if (asignatura.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR");
            System.exit(0);
        }
    String primerNumero=JOptionPane.showInputDialog("Digite la primera nota");
    String segundoNumero=JOptionPane.showInputDialog("Digite la segunda nota");
    String terceroNumero=JOptionPane.showInputDialog("Digite la tercer nota");
    String cuartoNumero=JOptionPane.showInputDialog("Digite la cuarta nota");
    
    double num1=Double.parseDouble(primerNumero);
    double num2=Double.parseDouble(segundoNumero);
    double num3=Double.parseDouble(terceroNumero);
    double num4=Double.parseDouble(cuartoNumero);
    
    double promedio;
    
    promedio=(num1+num2+num3+num4)/4;
    
        if (promedio<=2.9&&promedio>=0) {
            JOptionPane.showMessageDialog(null, "El promedio de la asignatura "+asignatura+" es "+promedio+" su resultado es bajo","PROMEDIO",JOptionPane.PLAIN_MESSAGE);
        }else if (promedio>=3&&promedio<=3.9) {
            JOptionPane.showMessageDialog(null, "El promedio de la asignatura "+asignatura+" es "+promedio+" su resultado es aceptable","PROMEDIO",JOptionPane.PLAIN_MESSAGE);
        }else if(promedio>=4&&promedio<=5){
          JOptionPane.showMessageDialog(null, "El promedio de la asignatura "+asignatura+" es "+promedio+" su resultado es excelente","PROMEDIO",JOptionPane.PLAIN_MESSAGE);  
        }else{

            JOptionPane.showMessageDialog(null, "NO A INGRESADO CORRECTAMENTE LOS DATOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    
            
}
