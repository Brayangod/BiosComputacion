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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class SubRubroPlanillaDAO {
    
    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();
    
    
    public List<String> listar(String nombre){
        List<String> subRubros = new ArrayList<>();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT s.nombre FROM subrubro_planilla s INNER JOIN rubro_planilla r ON s.id_rubro = r.id_rubro WHERE r.nombre ='"+nombre+"'");
            
            while(rs.next()){
                subRubros.add(rs.getString("s.nombre"));
            }
        } catch (Exception e) {
        }
        return subRubros;
    }
    
    public DefaultTableModel listarTabla(int id_rubro, String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"COD SUB_RUBRO", "NOMBRE"};

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
            ResultSet rs = st.executeQuery("SELECT id_subrubro,nombre FROM subrubro_planilla WHERE id_rubro='"+id_rubro+"' AND nombre LIKE '%" + buscar + "%' ORDER BY id_rubro ASC");

            while (rs.next()) {
                registros[0] = rs.getString("id_subrubro");
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

    public boolean agregar(int id_rubro,String nombre) {

        try {

            PreparedStatement pst = cn.prepareStatement("INSERT INTO subrubro_planilla (id_rubro,nombre) VALUES (?,?)");

            pst.setInt(1, id_rubro);
            pst.setString(2, nombre);

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
    
    public boolean editar(int id_subrubro, String nombre) {

        try {

            PreparedStatement pst = cn.prepareStatement("UPDATE subrubro_planilla SET nombre = ? WHERE id_subrubro ='"+id_subrubro+"'");

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
    
    public boolean eliminar(int id_subrubro) {

        try {

            PreparedStatement pst = cn.prepareStatement("DELETE FROM subrubro_planilla WHERE id_subrubro = ?");

            pst.setInt(1, id_subrubro);

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
