/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.entity;

import ar.com.bioscomputacion.data.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

/**
 *
 * @author braya
 */
public class Cierre {
    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();
    
    private int cod_cierre;
    private int cod_apertura;
    private int cod_usuario;
    private Double saldo;
    private Timestamp fecha;
    private Double diferencia;

    public Cierre() {
    }

    public Cierre(int cod_usuario, Double saldo, Timestamp fecha, Double diferencia) {
        this.cod_usuario = cod_usuario;
        this.saldo = saldo;
        this.fecha = fecha;
        this.diferencia = diferencia;
    }

    public int getCod_cierre() {
        return cod_cierre;
    }

    public void setCod_cierre(int cod_cierre) {
        this.cod_cierre = cod_cierre;
    }

    public int getCod_apertura() {
        return cod_apertura;
    }

    public void setCod_apertura(int cod_apertura) {
        this.cod_apertura = cod_apertura;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Double diferencia) {
        this.diferencia = diferencia;
    }
    
}
