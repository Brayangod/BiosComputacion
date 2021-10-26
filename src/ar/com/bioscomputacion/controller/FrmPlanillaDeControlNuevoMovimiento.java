/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.controller;

import ar.com.bioscomputacion.data.PlanillaDAO;
import ar.com.bioscomputacion.data.RubroPlanillaDAO;
import ar.com.bioscomputacion.data.SubRubroPlanillaDAO;
import ar.com.bioscomputacion.entity.Planilla;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class FrmPlanillaDeControlNuevoMovimiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmPlanillaDeControlNuevoMovimiento
     */
    public FrmPlanillaDeControlNuevoMovimiento() {
        initComponents();
        txtNombrepersona.setVisible(false);
        listarRubros();
        listarSubRubros();
    }
    
    public void listarRubros() {
        RubroPlanillaDAO rubroDao = new RubroPlanillaDAO();

        for (String rubros : rubroDao.listar()) {
            cbRubro.addItem(rubros);
        }

    }

    public void listarSubRubros() {
        cbSubRubro.removeAllItems();
        SubRubroPlanillaDAO subRubroDao = new SubRubroPlanillaDAO();

        if (cbRubro.getSelectedItem() != null) {
            for (String subRubros : subRubroDao.listar(cbRubro.getSelectedItem().toString())) {
                cbSubRubro.addItem(subRubros);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Recuerde agregar los rubros y/o sub rubros necesarios para el alta del producto");
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JcbMovimiento = new javax.swing.JComboBox<>();
        txtMonto = new javax.swing.JTextField();
        cbRubro = new javax.swing.JComboBox<>();
        jCbTipoMoneda = new javax.swing.JComboBox<>();
        txtNombrepersona = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        cbSubRubro = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(51, 84, 111));

        rSPanelShadow1.setBackground(new java.awt.Color(51, 84, 111));
        rSPanelShadow1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLANILLA DE CONTROL - NUEVO MOVIMIENTO");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rubro:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sub Rubro");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de moneda:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de movimiento:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Monto:");

        JcbMovimiento.setBackground(new java.awt.Color(51, 84, 111));
        JcbMovimiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JcbMovimiento.setForeground(new java.awt.Color(255, 255, 255));
        JcbMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "INGRESO", "EGRESO" }));
        JcbMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbMovimientoActionPerformed(evt);
            }
        });

        txtMonto.setBackground(new java.awt.Color(51, 84, 111));
        txtMonto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(153, 255, 0));
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoKeyReleased(evt);
            }
        });

        cbRubro.setBackground(new java.awt.Color(51, 84, 111));
        cbRubro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbRubro.setForeground(new java.awt.Color(255, 255, 255));
        cbRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRubroActionPerformed(evt);
            }
        });

        jCbTipoMoneda.setBackground(new java.awt.Color(51, 84, 111));
        jCbTipoMoneda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCbTipoMoneda.setForeground(new java.awt.Color(255, 255, 255));
        jCbTipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "EFECTIVO", "TARJ. CREDITO", "TARJ. DEBITO" }));
        jCbTipoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTipoMonedaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 0));
        jLabel7.setText("$");

        rSButtonRiple1.setBackground(new java.awt.Color(47, 110, 164));
        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/nuevo.png"))); // NOI18N
        rSButtonRiple1.setText("INSERTAR MOVIMIENTO");
        rSButtonRiple1.setFont(new java.awt.Font("Roboto Bold", 3, 14)); // NOI18N
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });

        cbSubRubro.setBackground(new java.awt.Color(51, 84, 111));
        cbSubRubro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbSubRubro.setForeground(new java.awt.Color(255, 255, 255));
        cbSubRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSubRubroActionPerformed(evt);
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
                        .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18))
                            .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)))
                        .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMonto)
                            .addComponent(JcbMovimiento, javax.swing.GroupLayout.Alignment.LEADING, 0, 230, Short.MAX_VALUE)
                            .addComponent(cbRubro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSubRubro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCbTipoMoneda, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelShadow1Layout.createSequentialGroup()
                        .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombrepersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE))
                .addContainerGap())
        );
        rSPanelShadow1Layout.setVerticalGroup(
            rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JcbMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbSubRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCbTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombrepersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void JcbMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbMovimientoActionPerformed
        String ingresos[] = new String[]{"COBRO DEUDA", "REPARACION", "ENTRADA A CAJA", "LIQUIDACION GIRE", "LIQUIDACION POSNET", "VENTA", "PLUS TURNO MAÑANA", "PLUS TURNO TARDE", "OTROS"};
        String egresos[] = new String[]{"ABONO MENSUAL POSNET", "ADELANTOS", "GTS. BIOS", "IMPUESTOS", "SUELDOS", "PROVEEDORES", "SALIDA DE CAJA", "OTROS"};

        String seleccion = JcbMovimiento.getSelectedItem().toString();

        if (seleccion == "INGRESO") {
            cbRubro.setEnabled(true);
            cbRubro.removeAllItems();
            for (String ingreso : ingresos) {
                cbRubro.addItem(ingreso);
            }
        }

        if (seleccion == "EGRESO") {
            cbRubro.setEnabled(true);
            cbRubro.removeAllItems();
            for (String egreso : egresos) {
                cbRubro.addItem(egreso);
            }
        }

        if (seleccion == "SELECCIONE") {
            cbRubro.setEnabled(false);
            cbRubro.removeAllItems();
        }
    }//GEN-LAST:event_JcbMovimientoActionPerformed

    private void cbRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRubroActionPerformed
        listarSubRubros();
    }//GEN-LAST:event_cbRubroActionPerformed

    private void jCbTipoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTipoMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbTipoMonedaActionPerformed

    private void txtMontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyReleased
        
    }//GEN-LAST:event_txtMontoKeyReleased

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("0.00", simbolos);
        Double monto = Double.valueOf(txtMonto.getText());
        txtMonto.setText(formateador.format(monto));
    }//GEN-LAST:event_txtMontoActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        java.util.Date dt = new java.util.Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        Planilla planilla;
        PlanillaDAO planillaDao = new PlanillaDAO();
        if(JcbMovimiento.getSelectedItem().equals("INGRESO")){
            planilla = new Planilla(txtNombrepersona.getText(), Timestamp.valueOf(currentTime), cbRubro.getSelectedItem().toString(), cbSubRubro.getSelectedItem().toString(), jCbTipoMoneda.getSelectedItem().toString(), Double.valueOf(txtMonto.getText()), 0.00);
            if(planillaDao.insertar(planilla)){
                JOptionPane.showMessageDialog(null, "Movimiento dado de alta satisfactoriamente");
                this.dispose();
                FrmPlanillaDeControlDiaria.btnActualizar.doClick();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error al agrega movimiento");
                this.dispose();
                FrmPlanillaDeControlDiaria.btnActualizar.doClick();
            }
        }
        else if(JcbMovimiento.getSelectedItem().equals("EGRESO")){
            planilla = new Planilla(txtNombrepersona.getText(), Timestamp.valueOf(currentTime), cbRubro.getSelectedItem().toString(), cbSubRubro.getSelectedItem().toString(), jCbTipoMoneda.getSelectedItem().toString(), 0.00, Double.valueOf(txtMonto.getText()));
            if(planillaDao.insertar(planilla)){
                JOptionPane.showMessageDialog(null, "Movimiento dado de alta satisfactoriamente");
                this.dispose();
                FrmPlanillaDeControlDiaria.btnActualizar.doClick();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error al agrega movimiento");
                this.dispose();
                FrmPlanillaDeControlDiaria.btnActualizar.doClick();
            }
        }
        
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void cbSubRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSubRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSubRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcbMovimiento;
    private javax.swing.JComboBox<String> cbRubro;
    private javax.swing.JComboBox<String> cbSubRubro;
    private javax.swing.JComboBox<String> jCbTipoMoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private javax.swing.JTextField txtMonto;
    public javax.swing.JTextField txtNombrepersona;
    // End of variables declaration//GEN-END:variables
}
