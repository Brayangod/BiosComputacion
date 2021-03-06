/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.controller;

import ar.com.bioscomputacion.data.CierreDAO;
import ar.com.bioscomputacion.data.PlanillaDAO;
import ar.com.bioscomputacion.entity.Cierre;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class FrmCierreCaja extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCierreCaja
     */
    public FrmCierreCaja() {
        initComponents();

        txtCod_usuario.setVisible(false);
        Calendar calendario = new GregorianCalendar();
        dateCierre.setCalendar(calendario);
        dateCierre.setEnabled(false);

        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("0.00", simbolos);

        java.util.Date dt = new java.util.Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentTime = sdf.format(dt);

        PlanillaDAO funcion = new PlanillaDAO();

        txtSaldoCaja.setText(String.valueOf(formateador.format(funcion.calcularSaldo(Date.valueOf(currentTime)))));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        dateCierre = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSaldoCaja = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtDiferencia = new javax.swing.JTextField();
        btnCerrar = new rojeru_san.RSButtonRiple();
        txtCod_usuario = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(51, 84, 111));

        rSPanelShadow1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CIERRE DE CAJA");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA:");

        dateCierre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMPLEADO:");

        txtEmpleado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        txtEmpleado.setText("Empleado");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TURNO:");

        txtTurno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTurno.setForeground(new java.awt.Color(204, 204, 204));
        txtTurno.setText("Ma??ana/Tarde");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SALDO EN CAJA: $");

        txtSaldoCaja.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSaldoCaja.setForeground(new java.awt.Color(153, 255, 0));
        txtSaldoCaja.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DIFERENCIA");

        txtDiferencia.setBackground(new java.awt.Color(51, 84, 111));
        txtDiferencia.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtDiferencia.setForeground(new java.awt.Color(153, 255, 0));
        txtDiferencia.setText("0.00");

        btnCerrar.setText("CERRAR CAJA");
        btnCerrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelShadow1Layout = new javax.swing.GroupLayout(rSPanelShadow1);
        rSPanelShadow1.setLayout(rSPanelShadow1Layout);
        rSPanelShadow1Layout.setHorizontalGroup(
            rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                        .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                                        .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dateCierre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTurno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(269, 269, 269))
                                    .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                                        .addComponent(txtSaldoCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addGap(284, 284, 284))))
                            .addComponent(jSeparator2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelShadow1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelShadow1Layout.createSequentialGroup()
                        .addComponent(txtCod_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );
        rSPanelShadow1Layout.setVerticalGroup(
            rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                        .addComponent(dateCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(txtTurno)))
                .addGap(18, 18, 18)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSaldoCaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelShadow1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCod_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        java.util.Date dt = new java.util.Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);

        Cierre cierre = new Cierre(Integer.parseInt(txtCod_usuario.getText()), Double.valueOf(txtSaldoCaja.getText()), Timestamp.valueOf(currentTime), Double.valueOf(txtDiferencia.getText()));
        CierreDAO cierreDao = new CierreDAO();
        
        if (cierreDao.isCajaCerrada()) {
            JOptionPane.showMessageDialog(null, "La caja ya esta cerrada!");
            return;
        }
        if (cierreDao.cerrarCaja(cierre)) {
            JOptionPane.showMessageDialog(null, "Se cerr?? la caja con exito");
            FrmPrincipal.menuVentas.setEnabled(false);
            FrmPrincipal.menuPlanilla.setEnabled(false);
            FrmPrincipal.menuReparaciones.setEnabled(false);
            FrmPrincipal.menuCtaCte.setEnabled(false);
            FrmPrincipal.menuItemApertura.setEnabled(true);
            FrmPrincipal.menuItemCierre.setEnabled(false);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error al cerrar la caja");
        }
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCerrar;
    private com.toedter.calendar.JDateChooser dateCierre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    public javax.swing.JTextField txtCod_usuario;
    private javax.swing.JTextField txtDiferencia;
    public javax.swing.JLabel txtEmpleado;
    private javax.swing.JLabel txtSaldoCaja;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
