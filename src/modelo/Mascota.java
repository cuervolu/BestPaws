/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class Mascota {
    int mascota_id,especie_id;
    String nombre,rut_cli,raza,descripcion;
    Date fec_nac;

    public Mascota() {
    }

    public Mascota(int mascota_id, int especie_id, String nombre, String rut_cli, String raza, String descripcion, Date fec_nac) {
        setMascota_id(mascota_id);
        setEspecie_id(especie_id);
        setNombre(nombre);
        setRut_cli(rut_cli);
        setRaza(raza);
        setDescripcion(descripcion);
        setFec_nac(fec_nac);
    }

    public int getMascota_id() {
        return mascota_id;
    }

    public void setMascota_id(int mascota_id) {
        this.mascota_id = mascota_id;
    }

    public int getEspecie_id() {
        return especie_id;
    }

    public void setEspecie_id(int especie_id) {
        this.especie_id = especie_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut_cli() {
        return rut_cli;
    }

    public void setRut_cli(String rut_cli) {
        this.rut_cli = rut_cli;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Date fec_nac) {
        this.fec_nac = fec_nac;
    }

    @Override
    public String toString() {
        return "Mascota{" + "mascota_id=" + getMascota_id() + ", especie_id=" + 
                getEspecie_id() + ", nombre=" + getNombre() + ", rut_cli=" + getRut_cli() +
                ", raza=" + getRaza() + ", descripcion=" + getDescripcion() + 
                ", fec_nac=" + getFec_nac() + '}';
    }
    
    
    
}
