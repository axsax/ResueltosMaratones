/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jhon-
 */
public class Cliente {

    private String codigo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    public Cliente(String codigo,String nombre,String apellido,String telefono,String correo) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.correo = correo;
        this.nombre= nombre;
        this.telefono= telefono;
    }
    public Cliente(){
        
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
