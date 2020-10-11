/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico7;

/**
 *
 * @author Fran Gonzalez
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    
    
    public Cliente(){

    }

    public Cliente(String nombre, String apellido, String ciudad, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad.toUpperCase();
        this.direccion = direccion;

    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad.toUpperCase();
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }


    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getCiudad(){
        return ciudad;
    }

    public String getDireccion(){
        return direccion;
    }


    //metods

    @Override
    public String toString() {
        return "        |Nombre: " + nombre + "     |Apellido: " + apellido + "     |Direccion: " + direccion + "       |Ciudad: " + ciudad;
    }

    


}