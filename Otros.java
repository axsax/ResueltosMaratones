/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

import java.util.Scanner;

/**
 *
 * @author axsax
 */
public class Otros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Digite la cantidad de estudiantes");
       arreglo(sc.nextInt());
    }
    static int arreglo(int estudiantes){
        Scanner sc= new Scanner(System.in);
        double suma=0;int mejores=0;
        double listas [][]= new double[estudiantes][3];
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite la "+(j+1)+" nota del estudiante "+(i+1) );
                listas[i][j]=sc.nextDouble();
            }
        }
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < 3; j++) {
                suma=suma+listas[i][j];
            }
            if (suma/3>=3.0) {
                ++mejores;
            }
            System.out.println("El promedio del "+(i+1)+" estudiantes es: "+suma/3);
            suma=0;
            
        }
        System.out.println("Los estudiantes con mayor calificaciones de 3.0 son: "+mejores);
        return 0;
    }
}
