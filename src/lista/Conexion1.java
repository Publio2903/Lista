/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALFM
 */
public class Conexion1 {
    
    private Connection connection = null;
    
    public void conectar() {
        try {
            System.out.println("Generando conexiÃ³n a Postgresql");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/PUBLIO", "postgres", "Publio2017*");  
            Class.forName("org.postgresql.Driver");  
            System.out.println("ConexiÃ³n generada exitosamente");
        } catch(SQLException ex) {
            System.err.println("No se pudo generar la conexiÃ³n: " + ex.getMessage());
        } catch(ClassNotFoundException ex) {
            System.err.println("No encotro el Driver: " + ex.getMessage());
        } catch(Exception ex) {
            System.err.println("Exception general: " + ex.getMessage());
        }
    }
    
    public void desconectar() {        
        try {
            if(connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("ConexiÃ³n cerrada exitosamente");
            } else {
                 System.out.println("No existe ninguna conexiÃ³n por cerrar");
            } 
        } catch(SQLException ex) {
            System.err.println("No se pudo cerrar la conexiÃ³n: " + ex.getMessage());
        } catch(Exception ex) {
            System.err.println("Exception general: " + ex.getMessage());
        }
    }
    
    public Connection getConnetion() {
        return connection;
    }
    
    
}
