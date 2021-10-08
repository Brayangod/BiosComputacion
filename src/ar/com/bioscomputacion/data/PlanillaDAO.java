/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.data;

import ar.com.bioscomputacion.entity.Planilla;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class PlanillaDAO {
    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();

    public DefaultTableModel mostrarDiario(Date fecha){
        DefaultTableModel modelo;
        
        String[] titulos = {"CODIGO","VENDEDOR","HORA","RUBRO","OBSERVACION","TIPO","INGRESOS","EGRESOS"};
        String[] registros = new String[8];
        
        modelo = new DefaultTableModel(null,titulos){
            @Override
            public boolean isCellEditable(int filas, int culumnas) {
                if (culumnas == 8) {
                    return true;
                } else {
                    return false;
                }

            }

        };
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT cod_movimiento,nom_vendedor,DATE_FORMAT(fecha_movimiento,'%H:%i:%s'),rubro,observacion,tipo_moneda,ingresos,egresos FROM planilla WHERE fecha_movimiento between '"+fecha+" 00:00:00' and '"+fecha+" 23:59:59'");
            
            while(rs.next()){                
                registros[0] = rs.getString("cod_movimiento");
                registros[1] = rs.getString("nom_vendedor");
                registros[2] = rs.getString("DATE_FORMAT(fecha_movimiento,'%H:%i:%s')");
                registros[3] = rs.getString("rubro");
                registros[4] = rs.getString("observacion");
                registros[5] = rs.getString("tipo_moneda");
                registros[6] = rs.getString("ingresos");
                registros[7] = rs.getString("egresos");
                
                modelo.addRow(registros);
            }
            return modelo;
            
        } catch (Exception e) {
            System.out.println("e = " + e);
            return null;
        }
        
    }
    
    public DefaultTableModel mostrarHistorico(Date inicio, Date fin){
        DefaultTableModel modelo;
        
        String[] titulos = {"CODIGO","VENDEDOR","FECHA","RUBRO","OBSERVACION","TIPO","INGRESOS","EGRESOS"};
        String[] registros = new String[8];
        
        modelo = new DefaultTableModel(null,titulos){
            @Override
            public boolean isCellEditable(int filas, int culumnas) {
                if (culumnas == 8) {
                    return true;
                } else {
                    return false;
                }

            }

        };
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT cod_movimiento,nom_vendedor,fecha_movimiento,rubro,observacion,tipo_moneda,ingresos,egresos FROM planilla WHERE fecha_movimiento between '"+inicio+" 00:00:00' and '"+fin+" 23:59:59'");
            
            while(rs.next()){                
                registros[0] = rs.getString("cod_movimiento");
                registros[1] = rs.getString("nom_vendedor");
                registros[2] = rs.getString("fecha_movimiento");
                registros[3] = rs.getString("rubro");
                registros[4] = rs.getString("observacion");
                registros[5] = rs.getString("tipo_moneda");
                registros[6] = rs.getString("ingresos");
                registros[7] = rs.getString("egresos");
                
                modelo.addRow(registros);
            }
            return modelo;
            
        } catch (Exception e) {
            System.out.println("e = " + e);
            return null;
        }
        
    }
    
    public boolean insertar(Planilla datos)
    {

        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO planilla (nom_vendedor,fecha_movimiento,rubro,observacion,tipo_moneda,ingresos,egresos) VALUES (?,?,?,?,?,?,?)");
            
            pst.setString(1, datos.getNom_vendedor());
            pst.setTimestamp(2, datos.getFecha());
            pst.setString(3, datos.getRubro());
            pst.setString(4, datos.getObservacion());
            pst.setString(5, datos.getTipo_moneda());
            pst.setDouble(6, datos.getIngresos());
            pst.setDouble(7, datos.getEgresos());
            
            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {

                return false;
            }

        } catch (Exception e) {

            System.out.println(e);
            return false;
        }
        
    }
    public boolean editar(Planilla datos){
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE planilla SET nom_vendedor = ?,rubro = ?,observacion = ?,tipo_moneda = ?,ingresos = ?,egresos = ?"
                    + " WHERE cod_movimiento='"+datos.getCod_movimiento()+"'");
            
            pst.setString(1, datos.getNom_vendedor());
            pst.setString(2, datos.getRubro());
            pst.setString(3, datos.getObservacion());
            pst.setString(4, datos.getTipo_moneda());
            pst.setDouble(5, datos.getIngresos());
            pst.setDouble(6, datos.getEgresos());
            
            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {

                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean eliminar(int cod_movimiento){
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM planilla WHERE cod_movimiento='"+cod_movimiento+"'");
            
            int N = pst.executeUpdate();
            
            if (N != 0) {
                return true;
            } else {

                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public Double calcularSaldo(Date fecha){
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ingresos,egresos FROM planilla WHERE fecha_movimiento between '"+fecha+" 00:00:00' and '"+fecha+" 23:59:59' AND tipo_moneda='EFECTIVO'");
            
            Double ingresos = 0.00;
            Double egresos = 0.00;
            Double total = 0.00;
            
            while(rs.next()){
                ingresos = ingresos + Double.valueOf(rs.getString("ingresos"));
                egresos = egresos + Double.valueOf(rs.getString("egresos"));
            }
            total = ingresos - egresos;
            
            return total;
        } catch (Exception e) {
            
        }
        return 0.00;
    }
}
