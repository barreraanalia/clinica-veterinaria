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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erecem
 */
public class ClienteData {
    
private Connection conecction= null;

    public ClienteData(Conexion conexion) {
    
    try {
        conecction = conexion.getConexion();
    } catch (SQLException ex) {
        Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
    }
    
   }

   
    
    public void guardarCliente (Cliente cliente){
        String sql =  "INSERT into cliente (nombrecompleto,telefono,direccion,personalternativa,documento) VALUES (?,?,?,?,?)";
        
    try {
        PreparedStatement statement = conecction.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,cliente.getNombreApellido());
        statement.setString(2,cliente.getTelefono());
        statement.setString(3,cliente.getDireccion());
        statement.setString(4,cliente.getPersonAlternativa());
        statement.setLong(5,cliente.getDocumento());
       
        statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
             
             if (rs.next()) {
                cliente.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un cliente");
            }
            
            
            statement.close();
            
    } catch (SQLException ex) {
        Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
    }
      
     
       }
public void borrarCliente(int id){
    try {
            
            String sql = "DELETE  cliente WHERE idcliente =?;";

            PreparedStatement statement = conecction.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
        
    
    }
public List<Cliente> obtenerCliente(){
        List<Cliente> clientes = new ArrayList<Cliente>();
            

        try {
            String sql = "SELECT * FROM Cliente;";
            PreparedStatement statement = conecction.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Cliente cliente;
            while(resultSet.next()){
               cliente.setId(resultSet.getInt("idcliente")); 
                cliente.setNombreApellido(resultSet.getString("nombrecompleto"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setDocumento(resultSet.getInt("documento"));
                cliente.setPersonAlternativa(resultSet.getString("personalternativa"));
                cliente.setTelefono(resultSet.getString("telefono"));
                
     
        

                clientes.add(cliente);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }
        
        
        return clientes;
    }

public void actualizarCliente(Cliente cliente){
    try {
        String sql = "UPDATE cliente SET nombrecompleto= ?,telefono= ?,direccion= ?,personalternativa= ?,documento= ? WHERE idcliente=?";
        PreparedStatement statement = conecction.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,cliente.getNombreApellido());
        statement.setString(2,cliente.getTelefono());
        statement.setString(3,cliente.getDireccion());
        statement.setString(4,cliente.getPersonAlternativa());
        statement.setLong(5,cliente.getDocumento());
        statement.setInt(6, cliente.getId());
        statement.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public Cliente buscarCliente (int id){
    Cliente cliente= null;
        try {
        
        String sql = "SELECT * FROM cliente WHERE idcliente=?;";
        PreparedStatement statement = conecction.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, id);
        
 
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next()){
                cliente = new Cliente();
                cliente.setId(resultSet.getInt("idcliente"));
                cliente.setNombreApellido(resultSet.getString("nombrecompleto"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getString("telefono"));
                cliente.setDocumento(resultSet.getLong("documento"));
                cliente.setPersonAlternativa(resultSet.getString("personalternativa"));
                

                
            }      
            statement.close();
        
       
    } catch (SQLException ex) {
        Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
    }
        return cliente; 
    }
    


}
