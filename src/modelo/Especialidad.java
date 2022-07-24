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
public class Especialidad {
    int esp_id;
    String nombre;

    public Especialidad() {
    }

    public Especialidad(int esp_id, String nombre) {
        setEsp_id(esp_id);
        setNombre(nombre);
    }

    public int getEsp_id() {
        return esp_id;
    }

    public void setEsp_id(int esp_id) {
        this.esp_id = esp_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "esp_id=" + getEsp_id() + ", nombre=" + getNombre() + '}';
    }
    
    
    
}
