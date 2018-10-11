/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

import java.util.ArrayList;

/**
 *
 * @author erecem
 */
public class Cliente {
 private String nombreApellido,telefono,direccion,personAlternativa;
 private long documento;
 private ArrayList <Mascota> mascota = new ArrayList<>();
 
 private int id=-1;
 

    public Cliente(int id, String nombreApellido, String telefono, String direccion, String personAlternativa, long documento, Mascota mascota) {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.personAlternativa = personAlternativa;
        this.documento = documento;
        
    }

    public Cliente(String nombreApellido, String telefono, String direccion, String personAlternativa, long documento) {
        this.nombreApellido = nombreApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.personAlternativa = personAlternativa;
        this.documento = documento;
    }

    
    Cliente() {
        this.id = id;
    }

    

  


    
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPersonAlternativa() {
        return personAlternativa;
    }

    public void setPersonAlternativa(String personAlternativa) {
        this.personAlternativa = personAlternativa;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 public void agregarMascota (Mascota mascotas){
     
     mascota.add(mascotas);
     
 }
 
 
 
}
