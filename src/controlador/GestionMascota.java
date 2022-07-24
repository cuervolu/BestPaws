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
import modelo.Mascota;
/**
 *
 * @author usuario
 */
public class GestionMascota {
    ConexionOracle con;
    PreparedStatement prepa = null;
    Statement st;
    ArrayList<Mascota> mascota = new ArrayList<>();

    public GestionMascota() {
        con = new ConexionOracle();
    }
    
    public boolean agregarMascota(Mascota m){
        boolean valida = false;
        try {
            String sql = "insert into mascota (mascota_id,nombre,rut_cli,fec_nac,especie_id,raza,descripcion)"
                    + "values(?,?,?,?,?,?,?)";
            prepa= con.getConnection().prepareStatement(sql);
            prepa.setInt(1,m.getMascota_id());
            prepa.setString(2,m.getNombre());
            prepa.setString(3,m.getRut_cli());
            prepa.setDate(4,m.getFec_nac());
            prepa.setInt(5,m.getEspecie_id());
            prepa.setString(6,m.getRaza());
            prepa.setString(7,m.getDescripcion());
            
            prepa.executeQuery();
            valida = true;
            
        } catch (SQLException ex) {
            System.out.println("No se puede insertar a la mascota: "+ex);
            valida=false;
        }
        return valida;
    }
    
    public boolean actualizarMascota(Mascota m){
    boolean valida = false;
        try {
            st.getConnection().createStatement();
            Mascota ms = (Mascota)m;
            String query = "update mascota set mascota_id = '"+m.getMascota_id()+"',"
                    +"nombre = '"+m.getNombre()+"',"+"rut_cli = '"+m.getRut_cli()
                    +"',"+"fec_nac = "+m.getFec_nac()
                    +","+"especie_id = "+m.getEspecie_id()+","+"raza = '"
                    +m.getRaza()+"',"+"descripcion = '"+m.getDescripcion()+"'"
                    + "where mascota_id = '"+m.getMascota_id()+"'";
            st.executeUpdate(query);
            valida = true;
        } catch (SQLException  ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return valida;
    }
    
    public boolean eliminarMascota(int mascota_id){
    boolean valida = false;
        try {
            st.getConnection().createStatement();
            String sql = "delete from mascota where mascota_id = ?";
            prepa = con.getConnection().prepareStatement(sql);
            prepa.setInt(1, mascota_id);
            prepa.executeUpdate();
            valida = true;
        } catch (SQLException ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return valida;
    
    }
    
    
}
