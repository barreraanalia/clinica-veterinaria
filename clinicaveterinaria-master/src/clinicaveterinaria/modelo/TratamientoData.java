/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.modelo;

import java.sql.Connection;
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
public class TratamientoData {
    private Connection connection = null;

    public TratamientoData(Conexion conexion) {
           try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
           
    public void guardarTratamiento (Tratamiento tratamiento) {
        try {
             String sql = "INSERT INTO tratamiento (codigotratamiento, tipotratamiento, descripcion, importe, tratamientoactivo ) VALUES (?,?,?,?,?);";
             PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             statement.setInt(1, tratamiento.getCodigoTratamiento());
             statement.setString(2, tratamiento.getTipo());
             statement.setString(3, tratamiento.getDescripcion());
             statement.setDouble(4, tratamiento.getImporte());
             statement.setBoolean(5, tratamiento.isActivo());             
             statement.executeUpdate();
             
             ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()){
                tratamiento.setIdtratamiento(1);
            } else {
                System.out.println("No se pudo agregar un tratamiento");
            }
            statement.close();
         }
         catch (SQLException ex) {
             System.out.println("Error al insertar "+ ex.getMessage());
         }
    }
    
    public List<Tratamiento> obtenerTratamiento (){
        List<Tratamiento> tratamientos = new ArrayList<Tratamiento>();
        try {
            String sql = "SELECT * FROM tratamiento;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.executeQuery();
            Tratamiento tratamiento;
            while(resultSet.next()){
                tratamiento = new Tratamiento();
                tratamiento.setIdtratamiento(resultSet.getInt("idtratamiento"));
                tratamiento.setTipo(resultSet.getString("tipotratamiento"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setImporte(resultSet.getDouble("importe"));
                tratamiento.setActivo(resultSet.getBoolean("tratamientoactivo"));
                tratamientos.add(tratamiento);
                
                System.out.println("tratamiento: "+tratamiento.getIdtratamiento());
                System.out.println("tipo de tratamiento: "+ tratamiento.getTipo());
                System.out.println("descripcion: "+tratamiento.getDescripcion());
                System.out.println("importe: "+tratamiento.getImporte());
                System.out.println("El tratamiento se encuentra: "+tratamiento.isActivo());
            }      
            statement.close();
        }
        catch (SQLException ex) {
            System.out.println("Error al obtener tratamientos "+ ex.getMessage());
        }
        return tratamientos;
    }
    
    public void borrarTratamiento(int idtratamiento){
        try {
            String sql = "DELETE FROM tratamiento WHERE idtratamiento=?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idtratamiento);
            statement.executeUpdate();
            statement.close();
            
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void actualizarTratamiento(Tratamiento tratamiento) {
        try {
            String sql = "UPDATE tratamiento SET tipotratamiento=?, codigotratamiento=?, importe=?, tratamientoactivo=?, descripcion=? WHERE idtratamiento=?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);            
            statement.setString(1, tratamiento.getTipo());
            statement.setInt(2, tratamiento.getCodigoTratamiento());
            statement.setDouble(3, tratamiento.getImporte());            
            statement.setBoolean(4, tratamiento.isActivo());
            statement.setString(5, tratamiento.getDescripcion());
            statement.setInt(6, tratamiento.getIdtratamiento());
            statement.executeUpdate();
            statement.close();
        }
        catch (SQLException ex) {
            System.out.println("Error de actualizacion: "+ex.getMessage());
        }
    }
    
  }
