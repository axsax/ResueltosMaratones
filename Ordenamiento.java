/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diego;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author axsax
 */
public class Ordenamiento {

    private String nombre;
    private String apellido;
    private int edad;

    public Ordenamiento(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public int GetEdad(){
        return this.edad;
    }
    public String toString(){
        return "Nombre"+this.getNombre()+" con "+this.getApellido()+" y "+ this.GetEdad()+" de edad"+"\n"; 
    }

    public static void main(String[] args) {
        List<Ordenamiento> ordenamiento= new LinkedList<>();
        ordenamiento.add(new Ordenamiento("Jhon","Plazas",21));
        ordenamiento.add(new Ordenamiento("Diego","Alejandro",20));
        ordenamiento.add(new Ordenamiento("Leidy","Plazas",20));
        ordenamiento.add(new Ordenamiento("Joselito", "Perez", 19));
        
        Collections.sort(ordenamiento, new Comparator<Ordenamiento>(){
            public int compare(Ordenamiento or1,Ordenamiento or2){
                return or2.GetEdad()-or1.GetEdad();
            }
        });
        
        Collections.sort(ordenamiento,new Comparator<Ordenamiento>(){
        public int compare(Ordenamiento or1,Ordenamiento or2){
            return or1.getNombre().compareTo(or2.getNombre());
        }
        });
       /* Collections.sort(ordenamiento);
        System.out.println(ordenamiento);
        for (Ordenamiento ordenamientos:ordenamiento) {
            System.out.println(ordenamiento);
        }*/
        System.out.println(ordenamiento);
    }
}

