/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author axsax
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min = 1, descubrir, descubriendo = 0;
        System.out.println("Digite el numero a descubrir, pero shhhh");
        descubrir = sc.nextInt();
        System.out.println("Digite el numero maximo para descubrir");
        max = sc.nextInt();

        while (descubrir != descubriendo) {
            System.out.println("El minimo es " + min + " el maximo " + max);
            System.out.print("Digite el numero ");
            descubriendo = (min+max)/2;
            if (descubriendo%2==1) {
             descubriendo++;   
            }
            System.out.println(descubriendo);        
            
            if (descubriendo < 1 || descubriendo > max) {
                System.out.println("Numeros no validos");
            } else {
                if (descubriendo == descubrir) {
                    System.out.println("GANASTE");
                    break;
                } else if (descubriendo > descubrir) {
                    System.out.println("TE PASASTE,es menos");
                    max = descubriendo;
                } else if (descubriendo < descubrir) {
                    System.out.println("BASTANTE RETRASO,es mayor");
                    min = descubriendo;
                }
            }
        }
    }
}
