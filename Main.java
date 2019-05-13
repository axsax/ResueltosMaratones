/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem355;

import java.util.Scanner;

/**
 *
 * @author jhon-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] cadena = new char[14][25];
        Scanner sc = new Scanner(System.in);
        int con = 0, full = 0, res = 0;

        int primer = sc.nextInt();
        String cada = "";
        char o;
        while (primer != 0) {
            sc.nextLine();

            for (int i = 0; i < primer; i++) {

                cada = sc.nextLine();
                for (int j = 0; j < cada.length(); j++) {

                    cadena[i][j] = cada.charAt(j);

                }

            }

            for (int i = 0; i < primer; i++) {
                for (int j = 0; j < cada.length(); j++) {
                    if (cadena[i][j] == 'X') {
                        con++;
                    }else if(cadena[i][j]==' '){
                        break;
                    }

                }
                if (i == 0) {
                    full=con;
     
                }
           res = res + Math.abs(full - con);
                con=0;
            }

            System.out.println(res);
            res = 0;
            full = 0;
            primer = sc.nextInt();
        }

    }
}
