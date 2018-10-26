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
    private String detalles;
    private LocalDate fechaVisita;
    private double peso;   
    private int idvisitaatencion;

    public VisitaAtencion(Mascota mascota, Tratamiento tratamiento, String detalles, LocalDate fechaVisita, double peso, int idvisitaatencion) {
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.detalles = detalles;
        this.fechaVisita = fechaVisita;
        this.peso = peso;
        this.idvisitaatencion = idvisitaatencion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdvisitaatencion() {
        return idvisitaatencion;
    }

    public void setIdvisitaatencion(int idvisitaatencion) {
        this.idvisitaatencion = idvisitaatencion;
    }

}
   
    
    
    

   