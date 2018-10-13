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
            
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                visitaAtencion.setIdvisitaatencion(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la visita");
            }
            statement.close();
        }
        catch (SQLException ex) {
            System.out.println("Error al guardar datos de la visita: "+ ex.getMessage());
        }
    }
    
    
}

    

