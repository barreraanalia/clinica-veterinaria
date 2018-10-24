/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
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
              /*  
                
               // Cliente clientes = new Cliente("moreno christian","3584284451","mitre 1224","aishi gimenez",35475534);
               Cliente cliente3 = new Cliente("giuliano escudero","34827482","san martin","timote escudero",472367819);
              Mascota mascota = new Mascota("gatito","siames","negro","macho","garfield",LocalDate.of(2005, 3, 16),0001,cliente3);
             // Mascota mascota= new Mascota("gatito","siames","negro","hembra","garfield",LocalDate.of(2009,3,17),0001,cliente3);
               // Mascota mascota2 = new Mascota("perro","mezcla","marron","macho","winquiy",LocalDate.of(2003, 2, 15),0001,clientes);
               // Mascota mascota3 = new Mascota("perro","mezcla","marron","macho","winc",LocalDate.of(2003, 2, 15),0001,clientes);
              ClienteData clientedata = new ClienteData(conexion);
                 clientedata.guardarCliente(cliente3);
                 
        
            MascotaData mascotadata = new MascotaData (conexion);
            Mascota mascota5 = new Mascota("gato","comun","negro","macho","mancha",LocalDate.of(2003, 2, 15),0001,cliente3);
            Mascota mascota6 = new Mascota("gato","comun","negro","macho","vaca",LocalDate.of(2003, 2, 15),0001,cliente3);
            mascotadata.guardarMascota(mascota);
            // clientes.agregarMascota(mascota);
            // clientes.agregarMascota(mascota2);
            // clientes.agregarMascota(mascota3);
            // mascotadata.guardarMascota(mascota);
            // clientes.clienteMascotas();
            clientedata.borrarCliente(1);
            
            //  System.out.println("el cliente de id 3 es: "+clientedata.buscarCliente(3).getNombreApellido());
            /*
            ArrayList <Cliente> lista ;
            ArrayList <Mascota> lista2 ;
            lista2 =  (ArrayList<Mascota>) mascotadata.obtenerMascota();
            lista = (ArrayList<Cliente>) clientedata.obtenerCliente();
            
            
            // clientedata.obtenerCliente().forEach(cliente -> {
            //     System.out.println("Nombre: " + cliente.getNombreApellido() );
            //  });
            
            
            
            TratamientoData ttdata = new TratamientoData(conexion);
            Tratamiento trata = new Tratamiento(0001, "corte de pelo", "el perro tenia muchas pulgas", 150.75, true,2);
            Tratamiento trata1 = new Tratamiento(0002, "corte de pelo", "no me gustaba su pelaje", 150.75, true);
            //Tratamiento trata3 = new Tratamiento(0002, "corte de pelo", "no me gustaba su pelaje", 190.50, true);
            Tratamiento trata3 = new Tratamiento(21, "castracion", "cualquier cosa", 250.25, true);
            //Tratamiento trata4 = new Tratamiento("corte de pelo", 25, 50.99, true, "el perro tenia muchas pulgas", 2);
            Tratamiento trata4 = new Tratamiento(0003, "colocado de inyeccion", "el perro tenia muchas garrapatas", 110.73, true,2);
            ttdata.guardarTratamiento(trata3);
            ttdata.actualizarTratamiento(trata);
            ttdata.obtenerTratamiento();
            VisitaAtencionData visitadata = new VisitaAtencionData(conexion);
            VisitaAtencion visita = new VisitaAtencion(3, 3, "garrapatas", LocalDate.of(2003, 5, 15), 7.5);
            
            visitadata.guardarVisita(visita);
         */
                 List<Cliente> listaPrueba= new ArrayList<>();
            List<Cliente> resultado= new ArrayList<>();
          ClienteData clientedata = new ClienteData(conexion);  
                
      listaPrueba = clientedata.obtenerCliente();
        
        for(Cliente cliente :listaPrueba){
            if(cliente.getNombreApellido().equals("alguien")){
            resultado.add(cliente);
                    }
        }
     Mascota mascotaprueba = new Mascota (); 
    mascotaprueba.setEspecie("pokemon");
    mascotaprueba.setRaza("electrico");
    mascotaprueba.setColorPelo("rubio");
    mascotaprueba.setSexo("macho");
    mascotaprueba.setAlias("pikachu");
    mascotaprueba.setCodigo(002);
    mascotaprueba.setCliente(resultado.get(0));
    mascotaprueba.setFeNac(LocalDate.of(2005, 3, 16));

       MascotaData mascotadata = new MascotaData(conexion);
       mascotadata.guardarMascota(mascotaprueba);
           
     } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClinicaVeterinaria.class.getName()).log(Level.SEVERE, null, ex);
               
            Logger.getLogger(ClinicaVeterinaria.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  }
}
