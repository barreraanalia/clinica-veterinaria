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
 * @author Carlos
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
            String sql = "INSERT INTO visitaatencion (idmascota, idtratamiento, detalles, fecha, peso) VALUES (?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, visitaAtencion.getMascota().getIdmascota());
            
            statement.setInt(2, visitaAtencion.getTratamiento().getIdtratamiento());
           
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
            String sql2;
            sql = "SELECT * FROM visitaatencion;";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                VisitaAtencion visitaatencion;
          
                while(resultSet.next()){
                    visitaatencion = new VisitaAtencion();
                    visitaatencion.setDetalles(resultSet.getString("detalles"));
                    visitaatencion.setFechaVisita(resultSet.getDate("fecha").toLocalDate());
                    visitaatencion.setPeso(resultSet.getDouble("peso"));
                    Mascota mascota = new Mascota();
                    mascota.setIdmascota(resultSet.getInt("idmascota"));
                    Tratamiento tratamiento = new Tratamiento ();
                    tratamiento.setIdtratamiento(resultSet.getInt("idtratamiento"));
                   
                   visitaatencion.setMascota(mascota);
                   visitaatencion.setTratamiento(tratamiento);
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
            
            String sql = "DELETE FROM visitaAtencion WHERE idvisitaatencion =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            statement.executeUpdate();
        }
    
        } catch (SQLException ex) {
            System.out.println("Error al eliminar una visitaAtencion: " + ex.getMessage());
        }
        
    
    }
     
     public void actualizarVisitaAtencion(VisitaAtencion visitaAtencion){
    
        try {
            
            String sql = "UPDATE FROM visitaatencion SET idmascota = ?, idtratamiento = ? , detalles =? fecha=?, peso=? WHERE idvisitaatencion = ?;";

            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
               
            statement.setString(1, visitaAtencion.getDetalles());
            statement.setDate(2, Date.valueOf(visitaAtencion.getFechaVisita()));
            statement.setDouble(3, visitaAtencion.getPeso());
            statement.executeUpdate();
               
  
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una visitaAtencion: " + ex.getMessage());
        }
    
    }
    
     public VisitaAtencion buscarVisitaAtencion(int id){
    VisitaAtencion visitaatencion=null;
    try {            
            
            String sql = "SELECT * FROM visitaAtencion WHERE idvisitaatencion =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                   visitaatencion= new VisitaAtencion();
                   
                    visitaatencion.setIdvisitaatencion(resultSet.getInt("idvisitaatencion"));
                    visitaatencion.setDetalles(resultSet.getString("detallles"));
                    visitaatencion.setFechaVisita(resultSet.getDate("fecha").toLocalDate());
                    visitaatencion.setPeso(resultSet.getDouble("peso"));
                                   Mascota mascota = new Mascota();
                    mascota.setIdmascota(resultSet.getInt("idmascota"));
                    Tratamiento tratamiento = new Tratamiento ();
                    tratamiento.setIdtratamiento(resultSet.getInt("idtratamiento"));
                   visitaatencion.setMascota(mascota);
                   visitaatencion.setTratamiento(tratamiento);
                                           
                    
            }
            statement.close();
        }
        
        } catch (SQLException ex) {
            System.out.println("No se encontro la visita de Atencion: " + ex.getMessage());
        }
        
        return visitaatencion;
    }

    
    
}

    

