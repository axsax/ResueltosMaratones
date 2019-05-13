/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author axsax
 */
public class arbol_Binario_Busqueda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario arbolito = new ArbolBinario();
        int numeroNodo;
        String nombre;
        numeroNodo = sc.nextInt();
        nombre = sc.next();
        while (true) {
            arbolito.agregarNodo(numeroNodo, nombre);
            if (!arbolito.estaVacio()) {
                System.out.println(" InOrden =  ");
                arbolito.inOrden(arbolito.raiz);
                System.out.println(" PostOrden =  ");
                arbolito.postOrden(arbolito.raiz);
                System.out.println(" PreOrden =  ");
                arbolito.preOrden(arbolito.raiz);
            } else {
                System.out.println("esta vacio");
            }
            numeroNodo = sc.nextInt();
            nombre = sc.next();
        }

    }

    public static class NodoArbol {

        int dato;
        String nombre;
        NodoArbol hijoIzquierdo, hijoDerecho;

        public NodoArbol(int d, String nom) {
            this.dato = d;
            this.nombre = nom;
            this.hijoDerecho = null;
            this.hijoIzquierdo = null;
        }

        public String toString() {
            return nombre + " su dato es " + dato;
        }
    }

    public static class ArbolBinario {

        NodoArbol raiz;

        public ArbolBinario() {
            raiz = null;
        }

        public void agregarNodo(int d, String nom) {
            NodoArbol nuevo = new NodoArbol(d, nom);
            if (raiz == null) {
                raiz = nuevo;
            } else {
                NodoArbol auxiliar = raiz;
                NodoArbol padre;
                while (true) {
                    padre = auxiliar;
                    if (d < auxiliar.dato) {
                        auxiliar = auxiliar.hijoIzquierdo;
                        if (auxiliar == null) {
                            padre.hijoIzquierdo = nuevo;
                            return;
                        }
                    } else {
                        auxiliar = auxiliar.hijoDerecho;
                        if (auxiliar == null) {
                            padre.hijoDerecho = nuevo;
                            return;
                        }
                    }
                }
            }
        }
        //metodo para saber cuando el arbol esta vacio

        public boolean estaVacio() {
            return raiz == null;
        }

        public void inOrden(NodoArbol r) { //izquierda raiz derecha
            if (r != null) {
                inOrden(r.hijoIzquierdo);
                System.out.println(r.dato+" "+r.nombre);
                inOrden(r.hijoDerecho);
            }
        }
        public  void postOrden(NodoArbol r){ //izquierda derecha raiz
            if (r!=null) {
                postOrden(r.hijoIzquierdo);
                postOrden(r.hijoDerecho);
                System.out.println(r.dato+" "+r.nombre);
            }
        }
        public void preOrden(NodoArbol r){
            if (r!=null) {
                System.out.println(r.dato+" "+r.nombre);
                preOrden(r.hijoIzquierdo);
                preOrden(r.hijoDerecho);
            }
        }
    }

}
