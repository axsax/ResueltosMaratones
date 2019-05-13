/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape_Number;

import java.util.Scanner;

public class MainMetodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String paso = "";
            String cadena = sc.nextLine();
            for (int i = 0; i < cadena.length(); i++) {
                if (i == cadena.length() - 1) {
                    paso = paso + contador(Character.getNumericValue(cadena.charAt(i)), Character.getNumericValue(cadena.charAt(0)));
                } else {
                    paso = paso + contador(Character.getNumericValue(cadena.charAt(i)), Character.getNumericValue(cadena.charAt(i + 1)));
                }
            };
            System.out.println(min(paso + paso, paso.length()));
        }
    }

    static int contador(int inicio, int fin) {
        if (inicio < fin) {
            return fin - inicio;
        } else if (inicio == fin) {
            return 0;
        } else {
            return (7 - inicio) + fin + 1;
        }
    }

    static String min(String pes, int lon) {
        String cadena1 = "", cadena2 = "";
        for (int i = 0; i < lon; i++) {
            if (i == 0) {
                cadena1 = pes.substring(i, lon + i);
            } else {
                cadena2 = pes.substring(i, lon + i);
                if (cadena1.compareTo(cadena2) > 0) {
                    cadena1 = cadena2;
                }
            }
        }
        return cadena1;
    }

}