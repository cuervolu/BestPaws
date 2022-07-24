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
import modelo.Especie;
/**
 *
 * @author usuario
 */
public class GestionEspecie {
    ConexionOracle con;
    PreparedStatement prepa = null;
    Statement st;
    ArrayList<Especie> especie = new ArrayList<>();

    public GestionEspecie() {
        con = new ConexionOracle();
    }
    
    public ArrayList<Especie> listarEspecies(){
        try {
            st = con.getConnection().createStatement();
            String consulta = "select * from especie";
            ResultSet resultado = st.executeQuery(consulta);
            while(resultado.next()){
                Especie e = new Especie();
                e.setEspecie_id(resultado.getInt(1));
                e.setEspecie_desc(resultado.getString(2));
                especie.add(e);
            }
        }catch (Exception ex) {
            System.out.println("Error :"+ex);
        }
        return especie;
    }
    
    
}
