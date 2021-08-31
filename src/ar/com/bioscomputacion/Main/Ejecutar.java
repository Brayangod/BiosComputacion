/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.Main;

import ar.com.bioscomputacion.Formularios.FrmLogin;
import ar.com.bioscomputacion.Funciones.ConexionBD;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class Ejecutar {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        if(conexion.getConexionBD() != null){
            FrmLogin.main(args);
        }
        else{
            JOptionPane.showMessageDialog(null, "Hubo un error al conectar con la base de datos!");
        }
    }
    
}
