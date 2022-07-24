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
public class Medico {
    String rut_med,nombre_med,direccion_med,email_med;
    int esp_id,comuna_id;

    public Medico() {
    }

    public Medico(String rut_med, String nombre_med, String direccion_med, String email_med, int esp_id, int comuna_id) {
        setRut_med(rut_med);
        setNombre_med(nombre_med);
        setDireccion_med(direccion_med);
        setEmail_med(email_med);
        setEsp_id(esp_id);
        setComuna_id(comuna_id);
    }

    public String getRut_med() {
        return rut_med;
    }

    public void setRut_med(String rut_med) {
        this.rut_med = rut_med;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public String getDireccion_med() {
        return direccion_med;
    }

    public void setDireccion_med(String direccion_med) {
        this.direccion_med = direccion_med;
    }

    public String getEmail_med() {
        return email_med;
    }

    public void setEmail_med(String email_med) {
        this.email_med = email_med;
    }

    public int getEsp_id() {
        return esp_id;
    }

    public void setEsp_id(int esp_id) {
        this.esp_id = esp_id;
    }

    public int getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(int comuna_id) {
        this.comuna_id = comuna_id;
    }

    @Override
    public String toString() {
        return "Medico{" + "rut_med=" + getRut_med() + ", nombre_med=" + getNombre_med()
                + ", direccion_med=" + getDireccion_med() + ", email_med=" 
                + getEmail_med() + ", esp_id=" + getEsp_id() + ", comuna_id=" + getComuna_id() + '}';
    }
    
    
    
}
