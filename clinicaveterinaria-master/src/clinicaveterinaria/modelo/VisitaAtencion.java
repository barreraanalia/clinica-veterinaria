/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author erecem
 */
public class VisitaAtencion {
    private Mascota mascota;
    private LocalDate fechaVisita;
    private double pesoPromedio;
    private Tratamiento tratamiento;

    public VisitaAtencion(Mascota mascota, LocalDate fechaVisita, double pesoPromedio, Tratamiento tramiento) {
        this.mascota = mascota;
        this.fechaVisita = fechaVisita;
        this.pesoPromedio = pesoPromedio;
        this.tratamiento = tramiento;
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

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public Tratamiento getTramiento() {
        return tratamiento;
    }

    public void setTramiento(Tratamiento tramiento) {
        this.tratamiento = tramiento;
    }
    
    
    
}
