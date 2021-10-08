/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.data;

import ar.com.bioscomputacion.entity.Cierre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

/**
 *
 * @author braya
 */
public class CierreDAO {
    ConexionBD mysql = new ConexionBD();
    Connection cn = mysql.getConexionBD();

    public boolean cerrarCaja(Cierre datos) {

        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO cierre (id_apertura,id_usuario,saldo_cierre,fecha_cierre,diferencia_cierre) VALUES ((SELECT id_apertura FROM apertura ORDER BY id_apertura DESC LIMIT 1),?,?,?,?)");
            
            PreparedStatement pst2 = cn.prepareStatement("INSERT INTO planilla (nom_vendedor,fecha_movimiento,rubro,observacion,tipo_moneda,ingresos,egresos)"
                    + " VALUES ((SELECT p.nombre FROM persona p INNER JOIN usuario u ON p.id_persona = u.id_persona AND u.id_usuario ='"+datos.getId_usuario()+"'),?,?,?,?,?,?)");

            PreparedStatement pst3 = cn.prepareStatement("UPDATE caja SET estado='CERRADA'");
            
            
            pst.setInt(1, datos.getId_usuario());
            pst.setDouble(2, datos.getSaldo());
            pst.setTimestamp(3, datos.getFecha());
            pst.setDouble(4, datos.getDiferencia());

            pst2.setTimestamp(1, datos.getFecha());
            pst2.setString(2, "OTROS");
            pst2.setString(3, "CIERRE CAJA");
            pst2.setString(4, "EFECTIVO");
            pst2.setDouble(5, 0.00);
            pst2.setDouble(6, datos.getSaldo());

            int N = pst.executeUpdate();
            int N2 = pst2.executeUpdate();
            int N3 = pst3.executeUpdate();

            if (N != 0 || N2 != 0 || N3 != 0) {
                return true;
            } else {

                return false;
            }

        } catch (Exception e) {

            System.out.println(e);
            return false;
        }

    }
    
    public boolean isCajaCerrada(){
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre,estado FROM caja WHERE estado='CERRADA'");
            
            while(rs.next()){
                return true;
            }
            
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
