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
public class Atencion {
    int ate_id,mascota_id,valor_ate;
    String procedimiento, observaciones,med_rut;
    Date fecha_Ate;

    public Atencion() {
    }

    public Atencion(int ate_id, int mascota_id, int valor_ate, String procedimiento, String observaciones, String med_rut, Date fecha_Ate) {
        setAte_id(ate_id);
        setMascota_id(mascota_id);
        setValor_ate(valor_ate);
        setProcedimiento(procedimiento);
        setObservaciones(observaciones);
        setMed_rut(med_rut);
        setFecha_Ate(fecha_Ate);
    }

    public int getAte_id() {
        return ate_id;
    }

    public void setAte_id(int ate_id) {
        this.ate_id = ate_id;
    }

    public int getMascota_id() {
        return mascota_id;
    }

    public void setMascota_id(int mascota_id) {
        this.mascota_id = mascota_id;
    }

    public int getValor_ate() {
        return valor_ate;
    }

    public void setValor_ate(int valor_ate) {
        this.valor_ate = valor_ate;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMed_rut() {
        return med_rut;
    }

    public void setMed_rut(String med_rut) {
        this.med_rut = med_rut;
    }

    
    public Date getFecha_Ate() {
        return fecha_Ate;
    }

    public void setFecha_Ate(Date fecha_Ate) {
        this.fecha_Ate = fecha_Ate;
    }

    @Override
    public String toString() {
        return "Atencion{" + "ate_id=" + getAte_id() + ", mascota_id=" + getMascota_id()
                + ", valor_ate=" + getValor_ate() + ", procedimiento=" + getProcedimiento()
                + ", observaciones=" + getObservaciones() + ", med_rut=" + getMed_rut()
                + ", fecha_Ate=" + getFecha_Ate() + '}';
    }


    
    
    
    
}
