/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progresiones_suceciones;

/**
 *
 * @author DELL
 */
public class Progresiones_Suceciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        uno();
        
    }
    public static void uno(){
        int [] vector= new int[10];
        vector[1]=1;
        for (int i = 2; i < vector.length; i++) {
           vector[i]=(int) (vector[i-1]+Math.pow(2, i-1));
        }
        for (int i = 1; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
