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
public class Mascota {
    private String especie,raza,colorPelo,sexo,alias;
    private LocalDate feNac;
    private double pesoPromedio;
    private int codigo;
    private Cliente cliente;
    private int idmascota;

    public Mascota(String especie, String raza, String colorPelo, String sexo, String alias, LocalDate feNac, int codigo, Cliente cliente) {
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.sexo = sexo;
        this.alias = alias;
        this.feNac = feNac;
        this.codigo = codigo;
        this.cliente = cliente;
    }

    Mascota() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public LocalDate getFeNac() {
        return feNac;
    }

    public void setFeNac(LocalDate feNac) {
        this.feNac = feNac;
    }

   

   

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return idmascota;
    }

    public void setId(int idmascota) {
        this.idmascota = idmascota;
    }
 
public void promedioPeso(double peso){
    
    
}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }


}
