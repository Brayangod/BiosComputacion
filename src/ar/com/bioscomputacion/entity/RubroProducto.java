/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.entity;

/**
 *
 * @author braya
 */
public class RubroProducto {
    private int idRubro;
    private String nombre;

    public RubroProducto() {
    }

    public RubroProducto(String nombre) {
        this.nombre = nombre;
    }

    public int getIdRubro() {
        return idRubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rubro{" + "idRubro=" + idRubro + ", nombre=" + nombre + '}';
    }
    
}
