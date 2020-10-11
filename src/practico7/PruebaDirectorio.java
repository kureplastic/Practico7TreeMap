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
public class PruebaDirectorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Cliente Franco = new Cliente("Franco", "Gonzalez", "La Punta", "Lic6");
        long tel = 15017100;
        Cliente Emanuel = new Cliente("Ema", "Gonzalez", "La Punta", "Lic 6 Mza 18 Casa 17");
        long tele = 154030211;
        Cliente Valentina = new Cliente("Vale", "Gonzalez", "San Luis", "Colon 555");
        long telf = 154482840;
        
        Directorio telefonosFamiliares = new Directorio();
        
        telefonosFamiliares.agregarCliente(tele, Emanuel);
        telefonosFamiliares.agregarCliente(tel, Franco);
        telefonosFamiliares.agregarCliente(telf, Valentina);
        
        //Prueba de  buscarcliente
        //System.out.println("El cliente asociado es :" + telefonosFamiliares.buscarCliente(15017100));
        
        //Prueba de  buscartelefono
        //telefonosFamiliares.buscarTelefono("gonzalez");
        
        
        //Prueba de buscarClientes
        //telefonosFamiliares.buscarClientes("LA PUNTA");
        
        //Prueba de borrarCliente
        //telefonosFamiliares.borrarCliente(15017100);
        //telefonosFamiliares.buscarTelefono("gonzalez");
        
        
    }
    
}
