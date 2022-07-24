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
public class Especie {
    int especie_id;
    String especie_desc;

    public Especie() {
    }

    public Especie(int especie_id, String especie_desc) {
        setEspecie_id(especie_id);
        setEspecie_desc(especie_desc);
    }

    public int getEspecie_id() {
        return especie_id;
    }

    public void setEspecie_id(int especie_id) {
        this.especie_id = especie_id;
    }

    public String getEspecie_desc() {
        return especie_desc;
    }

    public void setEspecie_desc(String especie_desc) {
        this.especie_desc = especie_desc;
    }

    @Override
    public String toString() {
        return "Especie{" + "especie_id=" + getEspecie_id() + ", especie_desc=" + getEspecie_desc() + '}';
    }
    
    
    
}
