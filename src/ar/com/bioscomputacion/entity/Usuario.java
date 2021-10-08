/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author braya
 */
public class Usuario extends Persona {
    
    private String usuario;
    private String contraseña;
    private String estado;
    private String acceso;
    
    

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, String estado, String acceso, String nombre, String direccion, String telefono, String email, String dni) {
        super(nombre, direccion, telefono, email, dni);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
        this.acceso = acceso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{usuario=").append(usuario);
        sb.append(", contrase\u00f1a=").append(contraseña);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
