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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barreraanalia
 */
public class MascotaData {
    private Connection connection = null;
    private Conexion conexion;

public MascotaData (Conexion conexion) {
    try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

    
  public void  guardarMascota(Mascota mascota){
        try {
            String sql = "INSERT INTO mascota (especie,raza,colorPelo,sexo,alias,pesoPromedio,fechanacimiento,codigo,idcliente) VALUES (?,?,?,?,?,?,?,?,?);";
            
            
            PreparedStatement statement = null;
            
            try {
                statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                
                statement.setString(1, mascota.getEspecie());
                statement.setString(2, mascota.getRaza());
                statement.setString(3, mascota.getColorPelo());
                statement.setString(4, mascota.getSexo());
                statement.setString(5, mascota.getAlias());
                statement.setDouble(6, mascota.getPesoPromedio());
                statement.setDate(7, Date.valueOf(mascota.getFechanacimiento()));
                statement.setInt(8, mascota.getCodigo());
                statement.setInt(9,mascota.getcliente().getId());
            } catch (SQLException ex) {
                Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement.executeUpdate();
            
            statement.close();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            try {
                if (rs.next()) {
                    mascota.setIdmascota(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una mascota");
                }
            } catch (SQLException ex) {
                Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
 }
  public List<Mascota> obtenerMascota(){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql;
            sql = "SELECT * FROM mascota;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                Mascota mascota;
          
                while(resultSet.next()){
                    mascota = new Mascota();
                    mascota.setIdmascota(resultSet.getInt("idmascota"));
                    mascota.setEspecie(resultSet.getString("especie"));
                    mascota.setRaza(resultSet.getString("raza"));
                    mascota.setColorPelo(resultSet.getString("colorPelo"));
                    mascota.setSexo(resultSet.getString("sexo"));
                    mascota.setAlias(resultSet.getString("alias"));
                    mascota.setPesoPromedio(resultSet.getDouble("pesoPromedio"));
                    mascota.setFechanacimiento(resultSet.getDate("fechanacimiento").toLocalDate());
                    mascota.setCodigo(resultSet.getInt("codigo"));
                    Cliente clientes = new Cliente ();
               clientes.setId(resultSet.getInt("idcliente"));
                mascota.setcliente(clientes);
               

                    mascotas.add(mascota);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        
        
        return mascotas;
     }
   public List<Mascota> obtenerMascotacliente(int id){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql;
            sql = "SELECT * FROM mascota WHERE idcliente = ?;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1,id);
            
                ResultSet resultSet = statement.executeQuery();
                Mascota mascota;
          
                while(resultSet.next()){
                    mascota = new Mascota();
                    mascota.setEspecie(resultSet.getString("especie"));
                    mascota.setRaza(resultSet.getString("raza"));
                    mascota.setColorPelo(resultSet.getString("colorPelo"));
                    mascota.setSexo(resultSet.getString("sexo"));
                    mascota.setAlias(resultSet.getString("alias"));
                    mascota.setPesoPromedio(resultSet.getDouble("pesoPromedio"));
                    mascota.setFechanacimiento(resultSet.getDate("fechanacimiento").toLocalDate());
                    mascota.setCodigo(resultSet.getInt("codigo"));
                    Cliente clientes = new Cliente ();
               clientes.setId(resultSet.getInt("idcliente"));
                mascota.setcliente(clientes);
               

                    mascotas.add(mascota);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        
        
        return mascotas;
     }

     public Cliente buscarCLiente(int id){
    
        ClienteData ad=new ClienteData(conexion);
        
        return ad.buscarCliente(id);
        
    }
     
    public void borrarMascota(int id){
    try {
            
            String sql = "DELETE FROM mascota WHERE idmascota =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            statement.executeUpdate();
        }
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una mascota: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarMascota(Mascota mascota){
    
        try {
            
            String sql = "UPDATE mascota SET especie = ? ,raza = ? , colorPelo = ?, sexo = ?, alias = ? ,pesoPromedio= ?,  fechanacimiento = ? , codigo =?, Idcliente =? ;";

            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
               statement.setString(1, mascota.getEspecie());
               statement.setString(2, mascota.getRaza());
               statement.setString(3, mascota.getColorPelo());
               statement.setString(4, mascota.getSexo());
               statement.setString(5, mascota.getAlias());
               statement.setDouble(6,mascota.getPesoPromedio());
               statement.setDate(7, Date.valueOf(mascota.getFechanacimiento()));
               statement.setInt(8, mascota.getCodigo());
               statement.setInt(9,mascota.getcliente().getId());
               statement.executeUpdate();
               statement.close();
  
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un mascota: " + ex.getMessage());
        }
    
    }
    
     public Mascota buscarMascota(int id){
    Mascota mascota=null;
    try {
            
            String sql = "SELECT * FROM mascota WHERE idmascota =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                mascota = new Mascota();
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColorPelo(resultSet.getString("colorPelo"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setPesoPromedio(resultSet.getDouble("pesoPromedio"));
                mascota.setFechanacimiento(resultSet.getDate("fechanacimiento").toLocalDate());
                mascota.setCodigo(resultSet.getInt("codigo"));
                
               Cliente clientes = new Cliente ();
               clientes.setId(resultSet.getInt("idcliente"));
                mascota.setcliente(clientes);
                
                
                
                
            }
            statement.close();
        }
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mascota: " + ex.getMessage());
        }
        
        return mascota;
    }

}
