/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.main;

import ar.com.bioscomputacion.controller.FrmLogin;
import ar.com.bioscomputacion.controller.FrmRegistro;
import ar.com.bioscomputacion.data.ConexionBD;
import ar.com.bioscomputacion.data.Iniciar;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class Ejecutar {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        Iniciar funcion = new Iniciar();
        if(conexion.getConexionBD() != null){
            if(funcion.hayUsuariosCreados()){
                FrmLogin.main(args);
            }
            else{
                JOptionPane.showMessageDialog(null, "Por favor cree el primer usuario del sistema");
                FrmRegistro.main(args);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Hubo un error al conectar con la base de datos!");
        }
    }
    
}
