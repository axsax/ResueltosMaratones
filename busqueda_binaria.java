/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author axsax
 */
public class busqueda_binaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] es = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int min = 0;
        int max = es.length ;
        System.out.println(es.length);
        System.out.println("Digite target");
        int target = sc.nextInt();
        while (max > min) {

            int guess = (min + max) / 2;
            Math.floor(guess);
            System.out.println(guess);
            if (es[guess] == target) {
                System.out.println("Encontrado");
                System.out.println(guess);
                break;
            } else if (es[guess] < target) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        System.out.println("-1");

    }
}
