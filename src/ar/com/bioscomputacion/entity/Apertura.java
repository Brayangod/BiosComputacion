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
public class Apertura {

    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();

    private int cod_apertura;
    private int cod_usuario;
    private Timestamp fecha;
    private Double saldo;

    public Apertura() {
    }

    public Apertura(int cod_usuario, Timestamp fecha, Double saldo) {
        this.cod_usuario = cod_usuario;
        this.fecha = fecha;
        this.saldo = saldo;
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

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
