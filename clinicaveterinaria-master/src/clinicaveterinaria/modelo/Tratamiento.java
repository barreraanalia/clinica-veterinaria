/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

/**
 *
 * @author erecem
 */
public class Tratamiento {
    private int codigoTratamiento;
    private String tipo;
    private String descripcion;
    //private float importe;
    private double importe;
    private boolean activo;
    
    private int idtratamiento;//agregado el id tratamiento

    /*public Tratamiento(int codigoTratamiento, String tipo, String descripcion, float importe, boolean activo) {
        this.codigoTratamiento = codigoTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.activo = activo;
    }*/
    public Tratamiento(int codigoTratamiento, String tipo, String descripcion, double importe, boolean activo) {
        this.codigoTratamiento = codigoTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.activo = activo;
    }

    public Tratamiento(int codigoTratamiento, String tipo, String descripcion, double importe, boolean activo, int idtratamiento) {
        this.codigoTratamiento = codigoTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.activo = activo;
        this.idtratamiento = idtratamiento;
    }
    
    
    //constructor para update
    /*public Tratamiento(String tipo, int codigoTratamiento, double importe, boolean activo, String descripcion, int idtratamientoint) {
        this.tipo = tipo;
        this.codigoTratamiento = codigoTratamiento;
        this.importe = importe;
        this.activo = activo;
        this.descripcion = descripcion;
        this.idtratamiento = idtratamiento;
    }*/

    public Tratamiento() {
    }

    /*public void setImporte(float importe) {
        this.importe = importe;
    }*/

    public int getCodigoTratamiento() {
        return codigoTratamiento;
    }

    public void setCodigoTratamiento(int codigoTratamiento) {
        this.codigoTratamiento = codigoTratamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdtratamiento() {
        return idtratamiento;
    }

    public void setIdtratamiento(int idtratamiento) {
        this.idtratamiento = idtratamiento;
    }
    
    
    
    
}
