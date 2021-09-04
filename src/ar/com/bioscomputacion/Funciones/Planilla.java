/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.Funciones;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class Planilla {
    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();
    private int cod_movimiento;
    private String nom_vendedor;
    private Timestamp fecha;
    private String rubro;
    private String observacion;
    private String tipo_moneda;
    private Double ingresos;
    private Double egresos;

    public Planilla() {
    }

    public Planilla(String nom_vendedor, Timestamp fecha, String rubro, String observacion, String tipo_moneda, Double ingresos, Double egresos) {
        this.nom_vendedor = nom_vendedor;
        this.fecha = fecha;
        this.rubro = rubro;
        this.observacion = observacion;
        this.tipo_moneda = tipo_moneda;
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    public int getCod_movimiento() {
        return cod_movimiento;
    }

    public String getNom_vendedor() {
        return nom_vendedor;
    }

    public void setNom_vendedor(String nom_vendedor) {
        this.nom_vendedor = nom_vendedor;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getTipo_moneda() {
        return tipo_moneda;
    }

    public void setTipo_moneda(String tipo_moneda) {
        this.tipo_moneda = tipo_moneda;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }

    public Double getEgresos() {
        return egresos;
    }

    public void setEgresos(Double egresos) {
        this.egresos = egresos;
    }
    
    
    
    
    //METODOS PARA PLANILLA DE CONTROL
    
    public DefaultTableModel mostrar(Date fecha){
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
            ResultSet rs = st.executeQuery("SELECT cod_movimiento,nom_vendedor,fecha_movimiento,rubro,observacion,tipo_moneda,ingresos,egresos FROM planilla WHERE fecha_movimiento between '"+fecha+" 00:00:00' and '"+fecha+" 23:59:59'");
            
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
            return null;
        }
        
    }
    
    public boolean insertar(Planilla datos)
    {

        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO planilla (nom_vendedor,fecha_movimiento,rubro,observacion,tipo_moneda,ingresos,egresos) VALUES (?,?,?,?,?,?,?)");
            
            pst.setString(1, datos.getNom_vendedor());
            System.out.println("pst = " + datos.getNom_vendedor());
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
}
