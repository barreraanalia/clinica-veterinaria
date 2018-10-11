/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;
/**
 *
 * @author erecem
 */
public class ClinicaVeterinaria {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Conexion conexion = null;
     
          
        
            try {
                conexion = new Conexion("jdbc:mysql://localhost/laveterinaria","root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClinicaVeterinaria.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        Cliente clientes = new Cliente("moreno christian","3584284451","mitre 1224","aishi gimenez",35475534);
        Cliente cliente2 = new Cliente("luciano rosa","3585534","caseros 1000","alvaro rosa",35455734);
        Mascota mascota = new Mascota("perro","mezcla","marron","macho","winca",LocalDate.of(2003, 2, 15),0001,clientes);
        
        
        
        ClienteData clientedata = new ClienteData(conexion);
        //clientedata.guardarCliente(clientes);
        MascotaData mascotadata = null;
        try {
            mascotadata = new MascotaData (conexion);
        } catch (SQLException ex) {
            Logger.getLogger(ClinicaVeterinaria.class.getName()).log(Level.SEVERE, null, ex);
        }
        mascotadata.guardarMascota(mascota);
        
        
      
      
      
      /*ClienteData clientedata = new ClienteData(conexion);
      clientedata.obtenerCliente().forEach(clientes -> {
                System.out.println("Nombre: " + cliente.getNombreApellido() );
            });
     */
     } 
     //catch (ClassNotFoundException ex) {
       //  Logger.getLogger(ClinicaVeterinaria.class.getName()).log(Level.SEVERE, null, ex); 
     //catch (ClassNotFoundException ex) {
       //  Logger.getLogger(ClinicaVeterinaria.class.getName()).log(Level.SEVERE, null, ex);
     }
       
         
     
  //  }
  
  
//}
