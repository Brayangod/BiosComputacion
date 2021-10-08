/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.controller;

import static ar.com.bioscomputacion.controller.FrmPrincipal.deskPrincipal;
import ar.com.bioscomputacion.data.PlanillaDAO;
import ar.com.bioscomputacion.desing.ColorCeldaPlanillaControlCentrado;
import ar.com.bioscomputacion.desing.ColorCeldaPlanillaControlDerecha;
import ar.com.bioscomputacion.entity.Planilla;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author braya
 */
public class FrmPlanillaDeControlDiaria extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmPlanillaDeControl2
     */
    int fila = -1;

    public FrmPlanillaDeControlDiaria() {
        initComponents();
        txtNombrepersona.setVisible(false);
        mostrar();

    }

    public void mostrar() {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("0.00", simbolos);

        PlanillaDAO funcion = new PlanillaDAO();

        java.util.Date dt = new java.util.Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentTime = sdf.format(dt);

        tablaPlanilla.setModel(funcion.mostrarDiario(Date.valueOf(currentTime)));

        ColorCeldaPlanillaControlCentrado colorCentrado = new ColorCeldaPlanillaControlCentrado();
        ColorCeldaPlanillaControlDerecha colorDerecha = new ColorCeldaPlanillaControlDerecha();
        tablaPlanilla.getColumnModel().getColumn(0).setCellRenderer(colorCentrado);
        tablaPlanilla.getColumnModel().getColumn(1).setCellRenderer(colorCentrado);
        tablaPlanilla.getColumnModel().getColumn(2).setCellRenderer(colorCentrado);
        tablaPlanilla.getColumnModel().getColumn(3).setCellRenderer(colorCentrado);
        tablaPlanilla.getColumnModel().getColumn(4).setCellRenderer(colorCentrado);
        tablaPlanilla.getColumnModel().getColumn(5).setCellRenderer(colorCentrado);
        tablaPlanilla.getColumnModel().getColumn(6).setCellRenderer(colorDerecha);
        tablaPlanilla.getColumnModel().getColumn(7).setCellRenderer(colorDerecha);

        tablaPlanilla.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                //l.setBorder(new LineBorder(Color.black, 1));
                l.setBackground(new java.awt.Color(51, 153, 255));
                l.setForeground(new java.awt.Color(0, 0, 0));
                l.setFont(new java.awt.Font("Arial Italic", 1, 12));
                setHorizontalAlignment(CENTER);
                return l;
            }
        });
        txtSaldo.setText(String.valueOf(formateador.format(funcion.calcularSaldo(Date.valueOf(currentTime)))));

    }

    public void insertar() {

        java.util.Date dt = new java.util.Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);

        Planilla planilla = new Planilla("Brayan Godoy", Timestamp.valueOf(currentTime), "VENTA", "VENTA", "EFECTIVO", 0.00, 104400.00);
        PlanillaDAO planillaDao = new PlanillaDAO();

        planillaDao.insertar(planilla);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlanilla = new javax.swing.JTable();
        btnNuevo = new rojeru_san.RSButtonRiple();
        btnEditar = new rojeru_san.RSButtonRiple();
        btnEliminar = new rojeru_san.RSButtonRiple();
        txtSaldo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombrepersona = new javax.swing.JTextField();
        btnActualizar = new rojeru_san.RSButtonRiple();

        setTitle("PLANILLA DE CONTROL DIARIA");

        jPanel1.setBackground(new java.awt.Color(51, 84, 111));

        rSPanelShadow1.setBackground(new java.awt.Color(51, 84, 111));
        rSPanelShadow1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLANILLA DE CONTROL DIARIA");

        tablaPlanilla.setBackground(new java.awt.Color(204, 204, 204));
        tablaPlanilla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tablaPlanilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPlanillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPlanilla);

        btnNuevo.setBackground(new java.awt.Color(47, 110, 164));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO MOVIMIENTO");
        btnNuevo.setFont(new java.awt.Font("Roboto Bold", 3, 14)); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(47, 110, 164));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/editar.png"))); // NOI18N
        btnEditar.setText("EDITAR MOVIMIENTO");
        btnEditar.setFont(new java.awt.Font("Roboto Bold", 3, 14)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(47, 110, 164));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR MOVIMIENTO");
        btnEliminar.setFont(new java.awt.Font("Roboto Bold", 3, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtSaldo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(153, 255, 0));
        txtSaldo.setText("0.00");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SALDO EN CAJA: $");

        btnActualizar.setBackground(new java.awt.Color(47, 110, 164));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/actualizar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setFont(new java.awt.Font("Roboto Bold", 3, 14)); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelShadow1Layout = new javax.swing.GroupLayout(rSPanelShadow1);
        rSPanelShadow1.setLayout(rSPanelShadow1Layout);
        rSPanelShadow1Layout.setHorizontalGroup(
            rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                        .addComponent(txtNombrepersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaldo))
                    .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        rSPanelShadow1Layout.setVerticalGroup(
            rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(rSPanelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrepersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        FrmPlanillaDeControlNuevoMovimiento form = new FrmPlanillaDeControlNuevoMovimiento();
        deskPrincipal.add(form);
        Dimension desktopSize = deskPrincipal.getSize();
        Dimension FrameSize = form.getSize();

        form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form.setVisible(true);

        form.setClosable(true);
        form.setIconifiable(false);
        form.txtNombrepersona.setText(this.txtNombrepersona.getText());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mostrar();
        fila = -1;
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el movimiento a editar");
            return;
        }
        FrmPlanillaDeControlEditarMovimiento form = new FrmPlanillaDeControlEditarMovimiento();
        deskPrincipal.add(form);
        Dimension desktopSize = deskPrincipal.getSize();
        Dimension FrameSize = form.getSize();

        form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form.setVisible(true);

        form.setClosable(true);
        form.setIconifiable(false);

        form.txtNombrepersona.setText(this.txtNombrepersona.getText());
        form.txtId_movimiento.setText(String.valueOf(tablaPlanilla.getValueAt(fila, 0).toString()));
        if (Double.valueOf(tablaPlanilla.getValueAt(fila, 6).toString()) > 0.00) {
            form.JcbMovimiento.setSelectedItem("INGRESO");
            form.txtMonto.setText(String.valueOf(tablaPlanilla.getValueAt(fila, 6)));
        } else {
            form.JcbMovimiento.setSelectedItem("EGRESO");
            form.txtMonto.setText(String.valueOf(tablaPlanilla.getValueAt(fila, 7)));
        }
        form.jCbRubro.setSelectedItem(String.valueOf(tablaPlanilla.getValueAt(fila, 3).toString()));
        form.jCbTipoMoneda.setSelectedItem(String.valueOf(tablaPlanilla.getValueAt(fila, 5).toString()));
        form.txtObservaciones.setText(String.valueOf(tablaPlanilla.getValueAt(fila, 4).toString()));

        fila = -1;

    }//GEN-LAST:event_btnEditarActionPerformed

    private void tablaPlanillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPlanillaMouseClicked
        fila = tablaPlanilla.getSelectedRow();
    }//GEN-LAST:event_tablaPlanillaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el movimiento a eliminar");
            return;
        }
        Planilla planilla = new Planilla();
        PlanillaDAO planillaDao = new PlanillaDAO();
        if (planillaDao.eliminar(Integer.parseInt(tablaPlanilla.getValueAt(fila, 0).toString()))) {
            JOptionPane.showMessageDialog(null, "El movimiento se dio de baja satisfactoriamente");
            btnActualizar.doClick();
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al eliminar el movimiento");
            btnActualizar.doClick();
        }
        fila = -1;

    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojeru_san.RSButtonRiple btnActualizar;
    private rojeru_san.RSButtonRiple btnEditar;
    private rojeru_san.RSButtonRiple btnEliminar;
    private rojeru_san.RSButtonRiple btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private javax.swing.JTable tablaPlanilla;
    public javax.swing.JTextField txtNombrepersona;
    private javax.swing.JLabel txtSaldo;
    // End of variables declaration//GEN-END:variables
}
