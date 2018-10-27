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
    private String especie;
    private String raza;
    private String colorPelo;
    private String sexo;
    private String alias;
    private double pesoPromedio;
    private LocalDate fechaNacimiento;
    private int codigo;
    private Cliente cliente;
    private int idmascota;

    public Mascota(String especie, String raza, String colorPelo, String sexo, String alias, double pesoPromedio, LocalDate fechaNacimiento, int codigo, Cliente cliente, int idmascota) {
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.sexo = sexo;
        this.alias = alias;
        this.pesoPromedio = pesoPromedio;
        this.fechaNacimiento = fechaNacimiento;
        this.codigo = codigo;
        this.cliente = cliente;
        this.idmascota = idmascota;
    }

   public  Mascota() {
        
    }

    public Mascota(String especie, String raza, String colorPelo, String sexo, String alias, LocalDate fechaNacimiento, String codigo, Cliente cliente) {
      this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.sexo = sexo;
        this.alias = alias;
        this.pesoPromedio = pesoPromedio;
        this.fechaNacimiento = fechaNacimiento;
        
        this.cliente = cliente;
        this.idmascota = idmascota;
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

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getcliente() {
        return cliente;
    }

    public void setcliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    
    }

   
    

    

 
    

    