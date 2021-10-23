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
public class SubRubroProducto {
    private int idSubRubro;
    private String nombre;

    public SubRubroProducto() {
    }

    public SubRubroProducto(String nombre) {
        this.nombre = nombre;
    }

    public int getIdSubRubro() {
        return idSubRubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "SubRubro{" + "idSubRubro=" + idSubRubro + ", nombre=" + nombre + '}';
    }
    
    
}
