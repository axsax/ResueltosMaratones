    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy_sistemas_operativos;

import java.util.Scanner;

/**
 *
 * @author jhon-
 */
public class FCFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int llegada = 0, tiempo = 0, cantidadProcesos, suma = 0, co = 0;
        String tabla[][];
        int t[];
        int e[];
        double p[];
        double resultado;

        System.out.println("Cantidad de procesos");
        cantidadProcesos = sc.nextInt();

        tabla = new String[cantidadProcesos][6];
       
        t = new int[cantidadProcesos];
        e = new int[cantidadProcesos];
        p = new double[cantidadProcesos];
        /*
        tabla[0][0] = "Proceso";
        tabla[0][1] = "Llegada";
        tabla[0][2] = "Tiempo";

        resultados[0][0] = "Proceso";
        resultados[0][1] = "Llegada";
        resultados[0][2] = "Tiempo";
         */
        for (int i = 0; i < cantidadProcesos; i++) {
            for (int j = 0; j < 3; j++) {
                tabla[i][j] = sc.next();
            }
        }
        //  suma=Integer.parseInt(tabla[1][2]);
        for (int j = 0; j < cantidadProcesos; j++) {
            for (int k = 1; k < 3; k++) {
                if (k == 1) {
                    llegada = Integer.parseInt(tabla[j][k]);
                    // System.out.println("llegada " + llegada);

                } else if (k == 2) {
                    tiempo = Integer.parseInt(tabla[j][k]);
                    // System.out.println("tiempo " + tiempo);
                    if (co == 0) {
                        suma = tiempo;
                    }
                    co++;
                }
            }
            if (co == 1) {
                suma = 0;
            }
            suma = suma + tiempo;
            int re = (Math.abs(suma - llegada));
            //  System.out.println("T  " + re);
            t[j] = re;
        }

        for (int i = 0; i < cantidadProcesos; i++) {
            e[i] = t[i] - Integer.parseInt(tabla[i][2]);
            p[i] = t[i] / Double.parseDouble(tabla[i][2]);
        }
        for (int i = 0; i < cantidadProcesos; i++) {
            for (int j = 3; j < 6; j++) {
                if (j == 3) {
                    tabla[i][j] = Integer.toString(t[i]);
                } else if (j == 4) {
                    tabla[i][j] = Integer.toString(e[i]);
                } else if (j == 5) {
                    resultado = p[i] * Math.pow(10, 3);
                    resultado = Math.round(resultado);
                    resultado = resultado / Math.pow(10, 3);
                    tabla[i][j] = Double.toString(resultado);
                }

            }
        }
        //saber tabla
        System.out.println("");
        for (int i = 0; i < cantidadProcesos; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(tabla[i][j] + "     "+"\t");
            }
            System.out.println("");
        }
    }

}
