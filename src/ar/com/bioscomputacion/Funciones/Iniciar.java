/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.Funciones;

import java.sql.*;

/**
 *
 * @author braya
 */
public class Iniciar {
    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();
    public int verificarUsuario(String usuario, String contraseña){
//        0 = No se pudo conecta a la base de datos
//        1 = Se encontro usuario y contraseña
//        2 = No se encontro ningun usuario y contraseña
        try {
            if(cn == null){
                return 0;
            }
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE login='"+usuario+"' AND password='"+contraseña+"'");
            
            while(rs.next()){
                return 1;
            }
        } catch (Exception e) {
        }
        return 2;
    }
    public boolean hayUsuariosCreados(){
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario");
            
            while(rs.next()){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
