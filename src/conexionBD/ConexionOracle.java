/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class ConexionOracle {
    Connection conexion;

    public ConexionOracle() {
       conectar(); 
    }
    
    public Connection getConnection(){
        return conexion;
    }
    
    public void conectar(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");//driver
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            String user="BEST_PAWS";
            String pass="BEST_PAWS";
            conexion=DriverManager.getConnection(url, user, pass);
        System.out.println("Conectado........");
        } catch (Exception ex) {
            System.err.println("Error :"+ex.getMessage());
        }
    
    }
    
    
    
}
