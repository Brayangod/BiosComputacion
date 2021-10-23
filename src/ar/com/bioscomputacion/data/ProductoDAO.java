/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.data;

import ar.com.bioscomputacion.entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class ProductoDAO {

    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();

    public DefaultTableModel listarTabla(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"ID", "RUBRO", "SUBRUBRO", "NOMBRE PRODUCTO", "COD_BARRA", "COD_PROVEEDOR",
            "PRECIO_COSTO", "PRECIO_EFECTIVO", "PRECIO_CUOTAS", "PORCENTAJE_GANANCIAS", "STOCK"};

        String[] registros = new String[11];

        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 11) {
                    return true;
                } else {
                    return false;
                }

            }

        };
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE nombre_producto LIKE '%" + buscar + "%' ORDER BY id_producto ASC");

            while (rs.next()) {
                registros[0] = rs.getString("id_producto");
                registros[1] = rs.getString("nombre_rubro");
                registros[2] = rs.getString("nombre_subrubro");
                registros[3] = rs.getString("nombre_producto");
                registros[4] = rs.getString("codigo_barra");
                registros[5] = rs.getString("codigo_proveedor");
                registros[6] = rs.getString("precio_costo");
                registros[7] = rs.getString("precio_efectivo");
                registros[8] = rs.getString("precio_cuotas");
                registros[9] = rs.getString("porcentaje_ganancias");
                registros[10] = rs.getString("stock");

                modelo.addRow(registros);
            }
            ConexionBD.close(cn);
            ConexionBD.close(st);
            ConexionBD.close(rs);
        } catch (Exception e) {
        }
        return modelo;
    }

    public boolean agregar(Producto producto) {

        try {

            PreparedStatement pst = cn.prepareStatement("INSERT INTO producto (nombre_rubro,nombre_subrubro,nombre_producto,codigo_barra,codigo_proveedor,precio_costo,precio_efectivo,"
                    + "precio_cuotas,porcentaje_ganancias,stock) VALUES (?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, producto.getNombreRubro());
            pst.setString(2, producto.getNombreSubRubro());
            pst.setString(3, producto.getNombreProducto());
            pst.setLong(4, producto.getCodigoBarra());
            pst.setString(5, producto.getCodigoProveedor());
            pst.setDouble(6, producto.getPrecioCosto());
            pst.setDouble(7, producto.getPrecioEfectivo());
            pst.setDouble(8, producto.getPrecioPlanCuotas());
            pst.setDouble(9, producto.getPorcentajeGanancias());
            pst.setInt(10, producto.getStock());

            int N = pst.executeUpdate();

            if (N != 0) {
                ConexionBD.close(cn);
                ConexionBD.close(pst);
                return true;
            } else {
                ConexionBD.close(cn);
                ConexionBD.close(pst);
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return false;
    }

    public boolean editar(Producto producto) {

        try {

            PreparedStatement pst = cn.prepareStatement("UPDATE producto SET nombre_rubro = ?,nombre_subrubro = ?,nombre_producto = ?,codigo_barra = ?,codigo_proveedor = ?,precio_costo = ?,precio_efectivo = ?,"
                    + "precio_cuotas = ?,porcentaje_ganancias = ?,stock = ? WHERE id_producto ='" + producto.getIdProducto() + "'");

            pst.setString(1, producto.getNombreRubro());
            pst.setString(2, producto.getNombreSubRubro());
            pst.setString(3, producto.getNombreProducto());
            pst.setLong(4, producto.getCodigoBarra());
            pst.setString(5, producto.getCodigoProveedor());
            pst.setDouble(6, producto.getPrecioCosto());
            pst.setDouble(7, producto.getPrecioEfectivo());
            pst.setDouble(8, producto.getPrecioPlanCuotas());
            pst.setDouble(9, producto.getPorcentajeGanancias());
            pst.setInt(10, producto.getStock());

            int N = pst.executeUpdate();

            if (N != 0) {
                ConexionBD.close(cn);
                ConexionBD.close(pst);
                return true;
            } else {
                ConexionBD.close(cn);
                ConexionBD.close(pst);
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return false;
    }

    public boolean eliminar(Producto producto) {

        try {

            PreparedStatement pst = cn.prepareStatement("DELETE FROM producto WHERE id_producto = ?");

            pst.setInt(1, producto.getIdProducto());

            int N = pst.executeUpdate();

            if (N != 0) {
                ConexionBD.close(cn);
                ConexionBD.close(pst);
                return true;
            } else {
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
