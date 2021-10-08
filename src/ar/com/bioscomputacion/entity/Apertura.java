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

    private int id_apertura;
    private int id_usuario;
    private Timestamp fecha;
    private Double saldo;

    public Apertura() {
    }

    public Apertura(int id_usuario, Timestamp fecha, Double saldo) {
        this.id_usuario = id_usuario;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public int getId_apertura() {
        return id_apertura;
    }

    public void setId_apertura(int id_apertura) {
        this.id_apertura = id_apertura;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
