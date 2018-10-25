/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author Carlos
 */
public class VisitaAtencion {
    private Mascota mascota;
    private Tratamiento tratamiento;
    private int idmascota;
    private String detalles;
    private LocalDate fechaVisita;
    //private double pesoPromedio;
    private double peso;    
    private int idtratamiento;
    private int idvisitaatencion=-1;//agregado por mi

    /*public VisitaAtencion(Mascota mascota, LocalDate fechaVisita, double pesoPromedio, Tratamiento tramiento) {
        this.mascota = mascota;
        this.fechaVisita = fechaVisita;
        this.pesoPromedio = pesoPromedio;
        this.tratamiento = tramiento;
    }*/

    public VisitaAtencion(Mascota mascota, Tratamiento tratamiento, String detalles, LocalDate fechaVisita, double peso) {
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.detalles = detalles;
        this.fechaVisita = fechaVisita;
        this.peso = peso;
    }
    
    

    public VisitaAtencion(int idmascota, int idtratamiento, String detalle, LocalDate fechaVisita, double peso) {
        this.idmascota = idmascota;
        this.idtratamiento = idtratamiento;
        this.detalles = detalle;
        this.fechaVisita = fechaVisita;
        this.peso = peso;        
    }
    
    
    VisitaAtencion() {        
    }

    
    
    

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    /*public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }*/

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTramiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    //agregados por mi para probar la tabla
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalle) {
        this.detalles = detalle;
    }

    public int getIdvisitaatencion() {
        return idvisitaatencion;
    }

    public void setIdvisitaatencion(int idvisitaatencion) {
        this.idvisitaatencion = idvisitaatencion;
    }
    
    
    //metodosagregados para probar
    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public int getIdtratamiento() {
        return idtratamiento;
    }

    public void setIdtratamiento(int idtratamiento) {
        this.idtratamiento = idtratamiento;
    }

    
    
    
    
    
    
}
