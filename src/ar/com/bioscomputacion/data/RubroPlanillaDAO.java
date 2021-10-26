/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class RubroPlanillaDAO {

    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();

    public List<String> listar() {
        List<String> rubros = new ArrayList<>();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM rubro_planilla");

            while (rs.next()) {
                rubros.add(rs.getString("nombre"));
            }
            ConexionBD.close(cn);
            ConexionBD.close(st);
            ConexionBD.close(rs);
        } catch (Exception e) {
        }
        return rubros;
    }

    public DefaultTableModel listarTabla(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"COD RUBRO", "NOMBRE"};

        String[] registros = new String[2];

        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 2) {
                    return true;
                } else {
                    return false;
                }

            }

        };
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_rubro,nombre FROM rubro_planilla WHERE nombre LIKE '%" + buscar + "%' ORDER BY id_rubro ASC");

            while (rs.next()) {
                registros[0] = rs.getString("id_rubro");
                registros[1] = rs.getString("nombre");

                modelo.addRow(registros);
            }
            ConexionBD.close(cn);
            ConexionBD.close(st);
            ConexionBD.close(rs);
        } catch (Exception e) {
        }
        return modelo;
    }

    public boolean agregar(String nombre) {

        try {

            PreparedStatement pst = cn.prepareStatement("INSERT INTO rubro_planilla (nombre) VALUES (?)");

            pst.setString(1, nombre);

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
    
    public boolean editar(int id_rubro, String nombre) {

        try {

            PreparedStatement pst = cn.prepareStatement("UPDATE rubro_planilla SET nombre = ? WHERE id_rubro ='"+id_rubro+"'");

            pst.setString(1, nombre);

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
    
    public boolean eliminar(int id_rubro) {

        try {

            PreparedStatement pst = cn.prepareStatement("DELETE FROM rubro_planilla WHERE id_rubro = ?");

            pst.setInt(1, id_rubro);

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
