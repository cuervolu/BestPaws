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
import modelo.Especialidad;

/**
 *
 * @author usuario
 */
public class GestionEspecialidad {
    ConexionOracle con;
    PreparedStatement prepa = null;
    Statement st;
    ArrayList<Especialidad> especialidad = new ArrayList<>();

    public GestionEspecialidad() {
        con = new ConexionOracle();
    }
    public ArrayList<Especialidad> listarEspecialidad(){
        try {
            st = con.getConnection().createStatement();
            String consulta = "select * from especialidad";
            ResultSet resultado = st.executeQuery(consulta);
            while(resultado.next()){
                Especialidad e = new Especialidad();
                e.setEsp_id(resultado.getInt(1));
                e.setNombre(resultado.getString(2));
                especialidad.add(e);
            }
        }catch (Exception ex) {
            System.out.println("Error :"+ex);
        }
        return especialidad;
    }   
    
    
}
