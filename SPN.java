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
public class SPN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> procesoLlegada = new LinkedList();
        LinkedList<String> comprobacion = new LinkedList();
        LinkedList<String> replicaProcesoLlegada = new LinkedList();
        LinkedList<String> desicion = new LinkedList();
        LinkedList<String> definitiva = new LinkedList();
        int cantidadProcesos;
        System.out.println("Digite la cantidad de Procesos");
        cantidadProcesos = sc.nextInt();
        String pr, ll, t;
        int poscionSuma = 2;
        for (int i = 0; i < cantidadProcesos; i++) {//Inggresa los elementos 
            System.out.println("PROCESO");
            pr = sc.next();
            procesoLlegada.add(pr);
            replicaProcesoLlegada.add(pr);
            comprobacion.add(pr);
            System.out.println("LLegada");
            ll = sc.next();
            procesoLlegada.add(ll);
            replicaProcesoLlegada.add(ll);
            comprobacion.add(ll);
            System.out.println("TIEMPO");
            t = sc.next();
            procesoLlegada.add(t);
            replicaProcesoLlegada.add(t);
            comprobacion.add(t);
        }
        int sum = 0;
        for (int i = 0; i < procesoLlegada.size() / 3; i++) {// sumando el total de tiempo de los procesos que me van a servir en el while para saber donde parar
            sum += Integer.valueOf(procesoLlegada.get(poscionSuma));
            poscionSuma += 3;
        }
        System.out.println("La suma de los procesos es " + sum);
        System.out.println(procesoLlegada.toString());
        definitiva.add(procesoLlegada.get(0));
        definitiva.add(procesoLlegada.get(1));
        definitiva.add(procesoLlegada.get(2));
        replicaProcesoLlegada.remove(0);
        replicaProcesoLlegada.remove(0);
        replicaProcesoLlegada.remove(0);
        comprobacion.remove(0);
        comprobacion.remove(0);
        comprobacion.remove(0);
//        System.out.println("Esta es la definitiva");
//         System.out.println(definitiva.toString());
//        System.out.println("Esta es la Replica Proceso llegada");
//        System.out.println(replicaProcesoLlegada.toString());

        int qwe = 0, pro = 1, contabi = 4, per = 2, cosi = 0, cosi2 = 0, posicionMenor = 0, contIndentificador = 0, posicionRepetido = 0, ti = Integer.valueOf(definitiva.get(2)), menor = 999999999, desicioncont = 2;
        while (ti != sum) {//la primera de tiempo, hasta cuando sume todo

            System.out.println("El tiempo que va es ");
            System.out.println(ti);
            try {
                for (int i = 0; i < replicaProcesoLlegada.size(); i++) {//supuestamnete me esta sacando hasta donde va el tiempo
                    System.out.println("ANTES " + ti + " > " + Integer.valueOf(replicaProcesoLlegada.get(pro)));
                    if (ti >= Integer.valueOf(replicaProcesoLlegada.get(pro))) {
                        System.out.println("DESPUES " + ti + " > " + Integer.valueOf(replicaProcesoLlegada.get(pro)));
                        desicion.add(replicaProcesoLlegada.get(pro - 1));
                        desicion.add(replicaProcesoLlegada.get(pro));
                        desicion.add(replicaProcesoLlegada.get(pro + 1));
                        //  System.out.println("antes"+pro);comparamos la desicion con la replica procesos llegada, si replica proceso llegada tiene elementos de desicion, elimine
                        //ti += Integer.valueOf(tiempo.get(agregar0Tiempo));
                        pro += 3;
                        // System.out.println("antes"+pro);
                    }

                }

            } catch (Exception e) {

            }
            System.out.println(pro);
            pro = 1;

            System.out.println("Esta es la desicion despues de mirar que tiempo va");
            System.out.println(desicion.toString());

            qwe = 0;
            try {//Me esta seleccionando cual es el menor de los procesos
                for (int i = 0; i < desicion.size() / 3; i++) {
                    if (Integer.valueOf(desicion.get(per)) < menor) {
                        menor = Integer.valueOf(desicion.get(per));
                        posicionMenor = per;
                    }
                    per += 3;
                }
            } catch (Exception e) {

            }
            System.out.println("La posicion menor es " + posicionMenor);
            try {
                for (int i = 0; i < replicaProcesoLlegada.size(); i++) {
                    if (replicaProcesoLlegada.get(contIndentificador) == desicion.get(posicionMenor - 1)) {
                        posicionRepetido = contIndentificador;
                    }
                    contIndentificador += 3;
                }
            } catch (Exception e) {

            }
            System.out.println("La definitiva antes de eliminar es");
            System.out.println(definitiva.toString());
            System.out.println("La desicion antes de eliminar es");
            System.out.println(desicion.toString());
            System.out.println("La replicaProcesoLlegada antes de eliminar es");
            System.out.println(replicaProcesoLlegada.toString());
            System.out.println("La posicion menor es " + posicionMenor);
            definitiva.add(desicion.get(posicionMenor - 2));
            definitiva.add(desicion.get(posicionMenor - 1));
            definitiva.add(desicion.get(posicionMenor));
            ti += Integer.valueOf(desicion.get(posicionMenor));
            try {
                for (int j = 0; j < 3; j++) {
                    System.out.println("removiendo desicion "+desicion.remove(posicionMenor - 2));
                    desicion.remove(posicionMenor - 2);
                    System.out.println(j);
                    if (replicaProcesoLlegada.isEmpty()) {
                        System.out.println("esta nulo replicaProcesoLlegada");
                    } else {
                        replicaProcesoLlegada.remove(posicionRepetido);
                    }

                }
            } catch (Exception e) {
            }
            System.out.println("La definitiva despues de eliminar es");
            System.out.println(definitiva.toString());
            System.out.println("La desicion despues de eliminar es");
            System.out.println(desicion.toString());
            System.out.println("La replicaProcesoLlegada despues de eliminar es");
            System.out.println(replicaProcesoLlegada.toString());
            /*
            definitiva.add(desicion.get(posicionMenor - 2));
            definitiva.add(desicion.get(posicionMenor - 1));
            definitiva.add(desicion.get(posicionMenor));
            desicion.remove(posicionMenor - 2);
            desicion.remove(posicionMenor - 1);
            desicion.remove(posicionMenor);
            replicaProcesoLlegada.remove(posicionRepetido - 2);
            replicaProcesoLlegada.remove(posicionRepetido - 1);
            replicaProcesoLlegada.remove(posicionRepetido);
             */

            //comparamos la desicion con la replica procesos llegada, 
            //si replica proceso llegada tiene elementos de desicion, elimine
            try {
                for (int j = 0; j < replicaProcesoLlegada.size(); j++) {
                    for (int i = 0; i < desicion.size(); i++) {
                        if (desicion.get(cosi).equals(replicaProcesoLlegada.get(cosi2))) {
                            for (int k = 0; k < 3; k++) {
                                System.out.println("esta removiendo "+replicaProcesoLlegada.remove(cosi2));
                                replicaProcesoLlegada.remove(cosi2);
                            }
// Jhon ojo mire la replica proceso llegada y con eso tiene que compararlos con la nueva que creo y escoger
                        }
                        cosi += 3;
                    }
                    cosi2 += 3;
                }

            } catch (Exception e) {
            }
            cosi = 0;
            cosi2 = 0;

            per = 2;
            menor = 99999999;
            contIndentificador = 0;
            posicionMenor = 0;
        }
        System.out.println("Esta es la definitiva ");
        System.out.println(definitiva.toString());
        System.out.println("Esta es la desicion");
        System.out.println(desicion.toString());
    }
}
