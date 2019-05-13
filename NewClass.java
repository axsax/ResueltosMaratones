/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10010;

import java.util.Scanner;

/**
 *
 * @author jhon-
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroCasos = 0, n = 0, x, y, cantidadPalabras, l = 0;
        char[][] sopa;
        char[][] palabras;
        char previoSopa, previoPalabras;
        String linea, palabra;
        numeroCasos = sc.nextInt();
        System.out.println("");
        while (numeroCasos != n) {
            x = sc.nextInt();
            y = sc.nextInt();
            sopa = new char[x][y];
            for (int i = 0; i < x; i++) {
                linea = sc.nextLine();
                linea = linea.toLowerCase();
                for (int j = 0; j < y; j++) {
                    previoSopa = linea.charAt(j);
                    sopa[i][j] = previoSopa;

                }
            }
            cantidadPalabras = sc.nextInt();
            while (cantidadPalabras != l) {

                for (int i = 0; i < cantidadPalabras; i++) {
                    palabra = sc.nextLine();
                    palabra = palabra.toLowerCase();
                    palabras = new char[cantidadPalabras][];
                    for (int j = 0; j < palabra.length(); j++) {
                        previoPalabras = palabra.charAt(j);
                        palabras[i][j] = previoPalabras;
                    }
                }
                l++;
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.println(sopa[i][j]);
                }
            }

            n++;
        }

    }

}
