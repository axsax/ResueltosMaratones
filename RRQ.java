/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy_sistemas_operativos;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jhon-
 */
public class RRQ {

    public static void main(String[] args) {
        LinkedList<String> cola = new LinkedList();
        int cantidadProcesos, queek, pos = 2;
        Scanner sc = new Scanner(System.in);
        cantidadProcesos = sc.nextInt();
        queek = sc.nextInt();

        for (int i = 0; i < cantidadProcesos; i++) {
            cola.add(sc.next());
        }
        for (int i = 0; i < cantidadProcesos; i++) {

            while (Integer.parseInt(cola.get(pos)) != 0) {
                cola.set(pos, Integer.toString(Integer.parseInt(cola.get(pos))-queek));
                for (int j = 0; j < cantidadProcesos ; j++) {
                    
                }
            }
            if (cola.get(pos) == "0") {
                pos += 3;
            }
        }

    }
}
