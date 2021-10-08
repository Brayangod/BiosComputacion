/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.data;

import ar.com.bioscomputacion.entity.Apertura;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

/**
 *
 * @author braya
 */
public class AperturaDAO {

    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();

    public boolean abrirCaja(Apertura datos) {

        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO apertura (id_usuario,fecha,saldo_apertura) VALUES (?,?,?)");
            
            PreparedStatement pst2 = cn.prepareStatement("INSERT INTO planilla (nom_vendedor,fecha_movimiento,rubro,observacion,tipo_moneda,ingresos,egresos)"
                    + " VALUES ((SELECT p.nombre FROM persona p INNER JOIN usuario u ON p.id_persona = u.id_persona AND u.id_usuario ='"+datos.getId_usuario()+"'),?,?,?,?,?,?)");

            PreparedStatement pst3 = cn.prepareStatement("UPDATE caja SET estado='ABIERTA'");
            
            
            pst.setInt(1, datos.getId_usuario());
            pst.setTimestamp(2, datos.getFecha());
            pst.setDouble(3, datos.getSaldo());

            pst2.setTimestamp(1, datos.getFecha());
            pst2.setString(2, "OTROS");
            pst2.setString(3, "APERTURA CAJA");
            pst2.setString(4, "EFECTIVO");
            pst2.setDouble(5, datos.getSaldo());
            pst2.setDouble(6, 0.00);

            int N = pst.executeUpdate();
            int N2 = pst2.executeUpdate();
            int N3 = pst3.executeUpdate();

            if (N != 0 || N2 != 0) {
                return true;
            } else {

                return false;
            }

        } catch (Exception e) {

            System.out.println(e);
            return false;
        }

    }
    
    public boolean isCajaAbierta(){
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre,estado FROM caja WHERE estado='ABIERTA'");
            
            while(rs.next()){
                return true;
            }
            
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
