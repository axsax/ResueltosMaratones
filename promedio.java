/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author jhon-
 */
public class promedio {
    public static void main(String[] args) {
        int arreglo [];
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite la cantidad");
        int observar=sc.nextInt();
        double promedio=0;
        int mayor=999999999,menor=0;
        
        arreglo= new int [observar];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Digite el: "+i);
            arreglo[i]= sc.nextInt();
            if (arreglo[i]>menor) {
                menor=arreglo[i];
            }if (arreglo[i]<mayor) {
                mayor=arreglo[i];
            }
            promedio+=arreglo[i];
        }
        double pro= (promedio/arreglo.length);
        System.out.printf("%.3f%n",pro);
        System.out.println("El promedio de los "+arreglo.length+" es de: "+(pro)+" El menor es: "+ mayor+  " y el mayor es: "+menor);
    }
}
