/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.data;

import ar.com.bioscomputacion.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author braya
 */
public class UsuarioDAO {
    
    public boolean registrar(Usuario usuario){
        try {
            ConexionBD mysql = new ConexionBD();
            Connection cn = mysql.getConexionBD();
            PreparedStatement pst = cn.prepareStatement("INSERT INTO persona (nombre,num_documento,direccion,telefono,email) "
                    + "VALUES (?,?,?,?,?)");
            PreparedStatement pst2 = cn.prepareStatement("INSERT INTO usuario (cod_persona,login,password,tipo,estado) VALUES ((select cod_persona from persona order by cod_persona desc limit 1),"
                    + "?,?,?,?)");
            
            
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getDni());
            pst.setString(3, usuario.getDireccion());
            pst.setString(4, usuario.getTelefono());
            pst.setString(5, usuario.getEmail());
            
            pst2.setString(1, usuario.getUsuario());
            pst2.setString(2, usuario.getContraseña());
            pst2.setString(3, usuario.getAcceso());
            pst2.setString(4, usuario.getEstado());
            
            int N = pst.executeUpdate();
            int N2 = pst2.executeUpdate();

            if (N != 0 || N2 != 0) {
                return true;
            } else {
                return false;
            }
            
            
        } catch (Exception e) {
        }
        return false;
    }
}
