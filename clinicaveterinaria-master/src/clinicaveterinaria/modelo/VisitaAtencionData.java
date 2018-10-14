/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class VisitaAtencionData {
    private Connection connection = null;

    public VisitaAtencionData(Conexion conexion) {
           try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarVisita (VisitaAtencion visitaAtencion) {
        try {
            String sql = "INSERT INTO visitaatencion (idmascota, idtratamiento, detallles, fechavisita, peso) VALUES (?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //statement.setInt(1, visitaAtencion.getMascota().getIdmascota());
            statement.setInt(1, visitaAtencion.getIdmascota());
            //statement.setInt(2, visitaAtencion.getTratamiento().getIdtratamiento());
            statement.setInt(2, visitaAtencion.getIdtratamiento());
            statement.setString(3, visitaAtencion.getDetalles());
            statement.setDate(4, Date.valueOf(visitaAtencion.getFechaVisita()));
            statement.setDouble(5, visitaAtencion.getPeso());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()){
                visitaAtencion.setIdvisitaatencion(1);
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la visita");
            }
            statement.close();
        }
        catch (SQLException ex) {
            System.out.println("Error al guardar datos de la visita: "+ ex.getMessage());
        }
    }
    
     public List<VisitaAtencion> obtenerVisitaAtencion(){
        List<VisitaAtencion> visitasatenciones = new ArrayList<>();
            

        try {
            String sql;
            sql = "SELECT * FROM cliente;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                VisitaAtencion visitaatencion;
          
                while(resultSet.next()){
                    visitaatencion= new VisitaAtencion();
                    visitaatencion.setIdmascota(resultSet.getInt("idMascota"));
                    visitaatencion.setIdtratamiento(resultSet.getInt("idTratamiento"));
                    visitaatencion.setDetalles(resultSet.getString("detalles"));
                    visitaatencion.setFechaVisita(resultSet.getDate("fechaVisita").toLocalDate());
                    visitaatencion.setPeso(resultSet.getDouble("peso"));
                    
                   
                   visitasatenciones.add(visitaatencion);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las visitasAtenciones: " + ex.getMessage());
        }
        
        
        return visitasatenciones;
     }
     
     public void borrarVistitaAtencion(int id){
    try {
            
            String sql = "DELETE FROM visitaAtencion WHERE id =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            statement.executeUpdate();
        }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una visitaAtencion: " + ex.getMessage());
        }
        
    
    }
     
     public void actualizarVisitaAtencion(VisitaAtencion visitaAtencion){
    
        try {
            
            String sql = "UPDATE cliente SET nombre = ?, fechaVisita = ? , activo =? WHERE id = ?;";

            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
               
                //statement.setInt(1, visitaAtencion.getMascota().getIdmascota());
            statement.setInt(1, visitaAtencion.getIdmascota());
            //statement.setInt(2, visitaAtencion.getTratamiento().getIdtratamiento());
            statement.setInt(2, visitaAtencion.getIdtratamiento());
            statement.setString(3, visitaAtencion.getDetalles());
            statement.setDate(4, Date.valueOf(visitaAtencion.getFechaVisita()));
            statement.setDouble(5, visitaAtencion.getPeso());
               statement.executeUpdate();
               
  
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una visitaAtencion: " + ex.getMessage());
        }
    
    }
    
     public VisitaAtencion buscarVisitaAtencion(int id){
    VisitaAtencion visitaatencion=null;
    try {
            
            String sql = "SELECT * FROM mascota WHERE id =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                    visitaatencion= new VisitaAtencion();
                    visitaatencion.setIdmascota(resultSet.getInt("idMascota"));
                    visitaatencion.setIdtratamiento(resultSet.getInt("idTratamiento"));
                    visitaatencion.setDetalles(resultSet.getString("detalles"));
                    visitaatencion.setFechaVisita(resultSet.getDate("fechaVisita").toLocalDate());
                    visitaatencion.setPeso(resultSet.getDouble("peso"));
                    
            }
        }
        
        } catch (SQLException ex) {
            System.out.println("Error al insertar una visitaAtencion: " + ex.getMessage());
        }
        
        return visitaatencion;
    }

    
    
}

    

