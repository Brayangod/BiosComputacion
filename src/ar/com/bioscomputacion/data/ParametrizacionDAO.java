/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.data;

import ar.com.bioscomputacion.entity.Parametrizacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author braya
 */
public class ParametrizacionDAO {
    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();
    
    public Double listarGanancia(){
        Double ganancias = 0.00;
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT porcentaje_ganancias FROM parametrizacion");
            
            while(rs.next()){
                ganancias = rs.getDouble("porcentaje_ganancias");
            }
        } catch (Exception e) {
        }
        return ganancias;
    }
    
    public Double listarDolar(){
        Double dolar = 0.00;
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT valor_dolar FROM parametrizacion");
            
            while(rs.next()){
                dolar = rs.getDouble("valor_dolar");
            }
        } catch (Exception e) {
        }
        return dolar;
    }
    public boolean editar(Parametrizacion parametrizacion) {

        try {

            PreparedStatement pst = cn.prepareStatement("UPDATE parametrizacion SET porcentaje_ganancias = ?, valor_dolar = ?");

            pst.setDouble(1, parametrizacion.getPorcentaje_ganancias());
            pst.setDouble(2, parametrizacion.getPrecio_dolar());

            int N = pst.executeUpdate();

            if (N != 0) {
                ConexionBD.close(cn);
                ConexionBD.close(pst);
                return true;
            }
            else{
                ConexionBD.close(cn);
                ConexionBD.close(pst);
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return false;
    }
    
    
}
