/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.entity;

import ar.com.bioscomputacion.data.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class Planilla {
    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();
    private int id_movimiento;
    private String nom_vendedor;
    private Timestamp fecha;
    private String rubro;
    private String observacion;
    private String tipo_moneda;
    private Double ingresos;
    private Double egresos;

    public Planilla() {
    }

    public Planilla(String nom_vendedor, Timestamp fecha, String rubro, String observacion, String tipo_moneda, Double ingresos, Double egresos) {
        this.nom_vendedor = nom_vendedor;
        this.fecha = fecha;
        this.rubro = rubro;
        this.observacion = observacion;
        this.tipo_moneda = tipo_moneda;
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    public int getId_movimiento() {
        return id_movimiento;
    }
    public void setId_movimiento(int id_movimiento){
        this.id_movimiento = id_movimiento;
    }

    public String getNom_vendedor() {
        return nom_vendedor;
    }

    public void setNom_vendedor(String nom_vendedor) {
        this.nom_vendedor = nom_vendedor;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getTipo_moneda() {
        return tipo_moneda;
    }

    public void setTipo_moneda(String tipo_moneda) {
        this.tipo_moneda = tipo_moneda;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }

    public Double getEgresos() {
        return egresos;
    }

    public void setEgresos(Double egresos) {
        this.egresos = egresos;
    }
}
