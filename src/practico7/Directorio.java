/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico7;

import static java.util.Collections.list;
import java.util.Set;
import java.util.TreeMap;


/**
 *
 * @author Fran Gonzalez
 */
public class Directorio {
    
    
    private  TreeMap<Long,Cliente> directorio;
    
    public Directorio(){
        this.directorio = new TreeMap<>();
    }
    
    
    
    public void agregarCliente(long telefono, Cliente cliente){
        Set<Long> listaTelefonos = directorio.keySet();
        
        if(listaTelefonos.contains(telefono)){
            System.out.println("El telefono ingresado ya se encuentra registrado!.");
        }
        else{
          directorio.put(telefono, cliente);
        }
    }
    
    public Cliente buscarCliente(long telefono){
        Set<Long> listaTelefonos = directorio.keySet();
        
        if(listaTelefonos.contains(telefono)){
            return directorio.get(telefono);
        }
        else {
            System.out.println("Dicho telefono no se encuentra registrado en el directorio");
            return new Cliente("ERRRR", "ERRRR", "ERRRR", "ERRRR");
        }           
    }
    
    public void buscarTelefono(String apellido){
        Set<Long> listaTelefonos = directorio.keySet();
        int coinc = 0;
        
        for(long telefono: listaTelefonos){
            if (directorio.get(telefono).getApellido().compareToIgnoreCase(apellido) == 0){
                coinc++;
                System.out.println(directorio.get(telefono));
            }           
        }
        if(coinc == 0) {System.out.println("No se encontraron registros con dicho apellido");}
    }
    
    
    public void buscarClientes(String ciudad){
        Set<Long> listaTelefonos = directorio.keySet();
        int coinc = 0;
        
        for(long telefono: listaTelefonos){
            if(directorio.get(telefono).getCiudad().equals(ciudad.toUpperCase())){
                coinc++;
                System.out.println(directorio.get(telefono));
            }
            
            
        }
        if(coinc == 0) {System.out.println("No se encontraron registros con dicha Ciudad");}
    }
    
    public void borrarCliente(long telefono){
        Set<Long> listaTelefonos = directorio.keySet();
        
        if(!listaTelefonos.contains(telefono))
            System.out.println("El telefono no se encuentra en el directorio");
        else
            directorio.remove(telefono);
            System.out.println("Se borro el telefono del directorio");
    }
    
    
}
