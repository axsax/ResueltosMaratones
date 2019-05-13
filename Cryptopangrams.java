/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlecodejam;

/**
 *
 * @author axsax
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Factorizar {

    public static ArrayList<String> letras = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
    public static ArrayList<Integer> nume = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int casos;
        String linea;

        casos = Integer.parseInt(br.readLine());

        for (int i = 0; i < casos; i++) {
            String primero[];
            br.readLine();
            linea = br.readLine();
            primero = linea.split(" ");
            for (int j = 0; j < primero.length; j++) {
                facto(Long.valueOf(primero[j]));
            }

        }

    }

    public static void facto(long num) {
        int divisor = 2;

        while (num != 1) {
            if (num % divisor == 0) {
               // System.out.print(divisor + " ");
                System.out.print(letras.get(nume.indexOf(divisor)));;
                num = num / divisor;
            } else {
                divisor++;
            }

        }
    }


}
