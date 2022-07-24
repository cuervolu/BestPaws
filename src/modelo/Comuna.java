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
public class Comuna {
    int comuna_id;
    String comuna_desc;

    public Comuna() {
    }

    public Comuna(int comuna_id, String comuna_desc) {
        setComuna_id(comuna_id);
        setComuna_desc(comuna_desc);
    }

    public int getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(int comuna_id) {
        this.comuna_id = comuna_id;
    }

    public String getComuna_desc() {
        return comuna_desc;
    }

    public void setComuna_desc(String comuna_desc) {
        this.comuna_desc = comuna_desc;
    }

    @Override
    public String toString() {
        return "Comuna{" + "comuna_id=" + getComuna_id() + ", comuna_desc=" + getComuna_desc() + '}';
    }
    
    
    
}
