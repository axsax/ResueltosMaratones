/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 * Solo funciona cuando los numeros estan organziados
 * @author axsax
 */
public class binary_search_2 {

    public static void main(String[] args) {
        int[] es = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int array[] = {-1, 2, 4, -3, 5, 2, -5, 2};
        int k=0;
        Scanner sc=  new Scanner(System.in);
        System.out.println("Numero a encontrar");
        int x= sc.nextInt();
        for (int i = (array.length)/2; i >= 1; i/=2) {
            while (k+i<array.length&&array[k+i]<=x) {                
                k+=i;
            }
        }
        if (array[k]==x) {
            System.out.println(x+"encontro en la posicion "+k);
        }
    }
}
