/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Cliente {
    String rut_cli, nombre_cli, direccion_cli, email_cli;
    int comuna_id,telefono_cli;
    char tipo_cli;

    public Cliente() {
    }

    public Cliente(String rut_cli, String nombre_cli, String direccion_cli, String email_cli, int comuna_id, int telefono_cli, char tipo_cli) {
        setRut_cli(rut_cli);
        setNombre_cli(nombre_cli);
        setDireccion_cli(direccion_cli);
        setEmail_cli(email_cli);
        setComuna_id(comuna_id);
        setTelefono_cli(telefono_cli);
        setTipo_cli(tipo_cli);
    }

    public String getRut_cli() {
        return rut_cli;
    }

    public void setRut_cli(String rut_cli) {
        this.rut_cli = rut_cli;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getDireccion_cli() {
        return direccion_cli;
    }

    public void setDireccion_cli(String direccion_cli) {
        this.direccion_cli = direccion_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public int getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(int comuna_id) {
        this.comuna_id = comuna_id;
    }

    public int getTelefono_cli() {
        return telefono_cli;
    }

    public void setTelefono_cli(int telefono_cli) {
        this.telefono_cli = telefono_cli;
    }

    public char getTipo_cli() {
        return tipo_cli;
    }

    public void setTipo_cli(char tipo_cli) {
        this.tipo_cli = tipo_cli;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut_cli=" + getRut_cli() + ", nombre_cli=" + getNombre_cli()
                + ", direccion_cli=" + getDireccion_cli() + ", email_cli=" + getEmail_cli()
                + ", comuna_id=" + getComuna_id() + ", telefono_cli=" + getTelefono_cli()
                + ", tipo_cli=" + getTipo_cli() + '}';
    }
    
    
}
