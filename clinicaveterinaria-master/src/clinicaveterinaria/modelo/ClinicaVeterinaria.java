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
                    conexion = new Conexion("jdbc:mysql://localhost/clinica_veterinaria","root","");
                
                
               // Cliente clientes = new Cliente("moreno christian","3584284451","mitre 1224","aishi gimenez",35475534);
               Cliente cliente2 = new Cliente("luciano rosa","3585534","caseros 1000","alvaro rosa",35455734);
              Mascota mascota = new Mascota("perrito","mezcla","marron","macho","wincop",LocalDate.of(2003, 2, 15),0001,cliente2);
               // Mascota mascota2 = new Mascota("perro","mezcla","marron","macho","winquiy",LocalDate.of(2003, 2, 15),0001,clientes);
               // Mascota mascota3 = new Mascota("perro","mezcla","marron","macho","winc",LocalDate.of(2003, 2, 15),0001,clientes);
              ClienteData clientedata = new ClienteData(conexion);
                 clientedata.guardarCliente(cliente2);
                 
        
            MascotaData mascotadata = new MascotaData (conexion);
            mascotadata.guardarMascota(mascota);
            // clientes.agregarMascota(mascota);
            // clientes.agregarMascota(mascota2);
            // clientes.agregarMascota(mascota3);
            // mascotadata.guardarMascota(mascota);
            // clientes.clienteMascotas();
            //clientedata.borrarCliente(1);
            
            //  System.out.println("el cliente de id 2 es: "+clientedata.buscarCliente(2).getNombreApellido());
            /*
            ArrayList <Cliente> lista ;
            ArrayList <Mascota> lista2 ;
            lista2 =  (ArrayList<Mascota>) mascotadata.obtenerMascota();
            lista = (ArrayList<Cliente>) clientedata.obtenerCliente();
            
            
            // clientedata.obtenerCliente().forEach(cliente -> {
            //     System.out.println("Nombre: " + cliente.getNombreApellido() );
            //  });
            
            */
      
     } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClinicaVeterinaria.class.getName()).log(Level.SEVERE, null, ex);
               
            Logger.getLogger(ClinicaVeterinaria.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  }
}
