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
import modelo.Atencion;
/**
 *
 * @author usuario
 */
public class GestionAtencion {
    ConexionOracle con;
    PreparedStatement prepa = null;
    Statement st;
    ArrayList<Atencion> atencion = new ArrayList<>();  

    public GestionAtencion() {
        con = new ConexionOracle();
    }
    
    public boolean agregarAtencion(Atencion a){
        boolean valida = false;
        try {
            String sql = "insert into atencion (ate_id,fecha_ate,med_rut,mascota_id,procedimiento,observaciones,valor_ate)"
                    + "values(?,?,?,?,?,?)";
            prepa = con.getConnection().prepareStatement(sql);
            prepa.setInt(1, a.getAte_id());
            prepa.setDate(2,a.getFecha_Ate());
            prepa.setString(3,a.getMed_rut());
            prepa.setInt(4, a.getMascota_id());
            prepa.setString(5, a.getProcedimiento());
            prepa.setString(6, a.getObservaciones());
            prepa.setInt(7, a.getValor_ate());
            prepa.executeQuery();
            valida = true;
        } catch (SQLException ex) {
            System.out.println("No se puede insertar la atención: "+ex);
            valida=false;
        }
        return valida;
    }
    
    public boolean actualizarAtencion(Atencion a){
        boolean valida = false;
        try {
            st.getConnection().createStatement();
            Atencion ac = (Atencion)a;
            String query = "update atencion set ate_id = '"+a.getAte_id()+"',"
                    +"fecha_ate = "+a.getFecha_Ate()+"',"+"med_rut = '"+a.getMed_rut()
                    +","+"mascota_id = '"+a.getMascota_id()
                    +"',"+"procedimiento = '"+a.getProcedimiento()+"',"
                    +"observaciones = '"+a.getObservaciones()+"',"+"valor_ate = "
                    +a.getValor_ate()+" where ate_id = '"+a.getAte_id()+"'";
            st.executeUpdate(query);
            valida = true;
        } catch (SQLException ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return valida;
    }
    
    public boolean eliminarAtencion(int ate_id){
    boolean valida = false;
        try {
            st.getConnection().createStatement();
            String sql = "delete from atencion where ate_id = ?";
            prepa = con.getConnection().prepareStatement(sql);
            prepa.setInt(1, ate_id);
            prepa.executeUpdate();
            valida = true;
        } catch (SQLException ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return valida;
    
    }
    
    public String[] atencionesMed (int med_rut){
        String[] dato = new String[8];
        try {
            st = con.getConnection().createStatement();
            String consulta = "select * from atencion where med_rut = '"+med_rut+"'";
            ResultSet  resultado = st.executeQuery(consulta);
            while(resultado.next()){
             dato[0]=""+resultado.getString(1);
             dato[1]=resultado.getString(2);
             dato[2]=resultado.getString(3);
             dato[3]=""+resultado.getString(4);
             dato[4]=""+resultado.getString(5);
             dato[5]=""+resultado.getString(6);;
             dato[6]=""+resultado.getString(7);
             dato[7]=""+resultado.getString(8); 
            }
        } catch (SQLException ex) {
            System.out.println("Error:"+ex.getMessage()); 
        }
        return dato;
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
