/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import conexionBD.ConexionOracle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Comuna;

/**
 *
 * @author usuario
 */
public class GestionComuna {
    ConexionOracle con;
    PreparedStatement prepa = null;
    Statement st;
    ArrayList<Comuna> comuna = new ArrayList<>();

    public GestionComuna() {
        con = new ConexionOracle();
    }
    
    public ArrayList<Comuna> listarComunas(){
        try {
            st = con.getConnection().createStatement();
            String consulta = "select * from comuna";
            ResultSet resultado = st.executeQuery(consulta);
            while(resultado.next()){
                Comuna c = new Comuna();
                c.setComuna_id(resultado.getInt(1));
                c.setComuna_desc(resultado.getString(2));
                comuna.add(c);
            }
        } catch (Exception ex) {
            System.out.println("Error :"+ex);
        }
        return comuna;
    }
    
    
    
    
    
    
}
