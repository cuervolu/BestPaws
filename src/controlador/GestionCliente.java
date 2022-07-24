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
import modelo.Cliente;
/**
 *
 * @author usuario
 */
public class GestionCliente {
    ConexionOracle con;
    PreparedStatement prepa = null;
    Statement st;
    ArrayList<Cliente> cliente = new ArrayList<>();

    public GestionCliente() {
        con = new ConexionOracle();
    }
    
    public boolean agregarCliente(Cliente cl){
        boolean valida = false;
        try {
            String sql = "insert into cliente (rut_cli,nombre_cli,direccion_cli,comuna_id,telefono_cli,email_cli,tipo_cli)"
                    + "values(?,?,?,?,?,?,?)";
            prepa= con.getConnection().prepareStatement(sql);
            prepa.setString(1,cl.getRut_cli());
            prepa.setString(2,cl.getNombre_cli());
            prepa.setString(3,cl.getDireccion_cli());
            prepa.setInt(4,cl.getComuna_id());
            prepa.setInt(5,cl.getTelefono_cli());
            prepa.setString(6,cl.getEmail_cli());
            prepa.setString(7,String.valueOf(cl.getTipo_cli()));
            
            prepa.executeQuery();
            valida = true;
        } catch (SQLException ex) {
             System.out.println("No se puede insertar al cliente: "+ex);
             valida=false;
        }
        return valida;
}
    
    public boolean actualizarCliente(Cliente cl){
        boolean valida  = false;
        try {
            st.getConnection().createStatement();
            Cliente c = (Cliente)cl;
            String query = "update cliente set rut_cli = '"+cl.getRut_cli()+"',"
                    +"nombre_cli = '"+cl.getNombre_cli()+"',"+"direccion_cli = '"
                    +cl.getDireccion_cli()+"',"+"comuna_id = "+cl.getComuna_id()
                    +","+"telefono_cli = "+cl.getTelefono_cli()+","+"email_cli = '"
                    +cl.getEmail_cli()+"',"+"tipo_cli = '"+cl.getTipo_cli()+"'"
                    + "where rut_cli = '"+cl.getRut_cli()+"'";
            st.executeUpdate(query);
            valida = true;
        } catch (SQLException  ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return valida;
    }
    
    public boolean eliminarCliente(String rut_cli){
    boolean valida = false;
        try {
            st.getConnection().createStatement();
            String sql = "delete from cliente where rut_cl = ?";
            prepa = con.getConnection().prepareStatement(sql);
            prepa.setString(1, rut_cli);
            prepa.executeUpdate();
            valida = true;
        } catch (SQLException ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return valida;
    
    }
    
    
}
