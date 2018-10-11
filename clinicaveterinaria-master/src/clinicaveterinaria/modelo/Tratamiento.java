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
    private float importe;
    private boolean activo;

    public Tratamiento(int codigoTratamiento, String tipo, String descripcion, float importe, boolean activo) {
        this.codigoTratamiento = codigoTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.activo = activo;
    }

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

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
    
}
