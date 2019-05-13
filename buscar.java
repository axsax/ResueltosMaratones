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
public class buscar {
    public static void main(String[] args) {
        int lista[];
        int cantidad,rep,cont=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite la cantidad de numeros: ");
        lista=new int [sc.nextInt()];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite el numero "+i);
            lista[i]=sc.nextInt();
        }
        System.out.println("Digite cual es el numero que quiere ver cuantas veces se repitio");
        rep= sc.nextInt();
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==rep) {
                System.out.println("el elemento "+ rep+" se encunetra en la posicion "+i+ " del arreglo");
                cont++;
            }
        }
        System.out.println("Las veces que se repite "+rep+" es: "+cont);
    }
}
