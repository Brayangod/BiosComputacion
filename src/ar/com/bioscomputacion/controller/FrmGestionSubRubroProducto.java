/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.controller;

import static ar.com.bioscomputacion.controller.FrmPrincipal.deskPrincipal;
import ar.com.bioscomputacion.data.SubRubroProductoDAO;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Caco
 */
public class FrmGestionSubRubroProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmGenerico
     */
    int fila = -1;
    public int id_rubro;

    public FrmGestionSubRubroProducto() {
        initComponents();
        mostrar(id_rubro, "");
    }

    public void mostrar(int id_rubro, String buscar) {
        SubRubroProductoDAO subRubroDao = new SubRubroProductoDAO();

        tablaSubRubro.setModel(subRubroDao.listarTabla(id_rubro, buscar));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        rSPanelShadow2 = new rojeru_san.RSPanelShadow();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSubRubro = new javax.swing.JTable();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        rSButtonRiple4 = new rojeru_san.RSButtonRiple();
        btnActualizar = new rojeru_san.RSButtonRiple();

        jPanel1.setBackground(new java.awt.Color(51, 84, 111));

        rSPanelShadow2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTI??N DE SUB RUBROS - PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR SUB RUBRO:");

        txtBuscar.setBackground(new java.awt.Color(51, 84, 111));
        txtBuscar.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tablaSubRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaSubRubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSubRubroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSubRubro);

        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/agregar.png"))); // NOI18N
        rSButtonRiple1.setText("AGREGAR");
        rSButtonRiple1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });

        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/editar.png"))); // NOI18N
        rSButtonRiple2.setText("MODIFICAR");
        rSButtonRiple2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });

        rSButtonRiple3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/buscar.png"))); // NOI18N
        rSButtonRiple3.setText("RUBROS");
        rSButtonRiple3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rSButtonRiple3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple3ActionPerformed(evt);
            }
        });

        rSButtonRiple4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/eliminar.png"))); // NOI18N
        rSButtonRiple4.setText("ELIMINAR");
        rSButtonRiple4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rSButtonRiple4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple4ActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/actualizar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelShadow2Layout = new javax.swing.GroupLayout(rSPanelShadow2);
        rSPanelShadow2.setLayout(rSPanelShadow2Layout);
        rSPanelShadow2Layout.setHorizontalGroup(
            rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                        .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonRiple4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonRiple3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rSPanelShadow2Layout.setVerticalGroup(
            rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrar(id_rubro, txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mostrar(id_rubro, "");
        txtBuscar.setText("");
        fila = -1;
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        String nombre = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nombre del sub rubro", "ALTA DE SUB RUBRO", JOptionPane.QUESTION_MESSAGE)).toUpperCase();
        SubRubroProductoDAO subRubroDao = new SubRubroProductoDAO();
        if (nombre.equals("NULL")) {
            JOptionPane.showMessageDialog(null, "Movimiento cancelado");
            btnActualizar.doClick();
            fila = -1;
        } else {
            if (subRubroDao.agregar(id_rubro, nombre)) {
                JOptionPane.showMessageDialog(null, "El sub rubro se agrego satisfactoriamente");
                btnActualizar.doClick();
            } else {
                JOptionPane.showMessageDialog(null, "Ocurri?? un error al agregar el sub rubro");
                btnActualizar.doClick();
            }
        }

    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void tablaSubRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSubRubroMouseClicked
        fila = tablaSubRubro.getSelectedRow();
    }//GEN-LAST:event_tablaSubRubroMouseClicked

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el sub rubro que desea modificar");
        } else {
            String nombre = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nombre del sub rubro", "MODIFICACION DE SUB RUBRO", JOptionPane.QUESTION_MESSAGE)).toUpperCase();
            SubRubroProductoDAO subRubroDao = new SubRubroProductoDAO();

            if (nombre.equals("NULL")) {
                JOptionPane.showMessageDialog(null, "Movimiento cancelado");
                btnActualizar.doClick();
                fila = -1;
            } else {
                if (subRubroDao.editar(Integer.parseInt(tablaSubRubro.getValueAt(fila, 0).toString()), nombre)) {
                    JOptionPane.showMessageDialog(null, "El sub rubro se modific?? satisfactoriamente");
                    btnActualizar.doClick();
                    fila = -1;
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurri?? un error al agregar el sub rubro");
                    btnActualizar.doClick();
                    fila = -1;
                }
            }
        }
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void rSButtonRiple4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple4ActionPerformed
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el sub rubro que desea eliminar");
        } else {
            SubRubroProductoDAO subRubroDao = new SubRubroProductoDAO();

            if (JOptionPane.showConfirmDialog(null, "Desea eliminar el sub rubro", "Est?? seguro que desea eliminar el rubro?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                if (subRubroDao.eliminar(Integer.parseInt(tablaSubRubro.getValueAt(fila, 0).toString()))) {
                    JOptionPane.showMessageDialog(null, "El sub rubro se elimin?? satisfactoriamente");
                    btnActualizar.doClick();
                    fila = -1;
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurri?? un error al eliminar el sub rubro");
                    btnActualizar.doClick();
                    fila = -1;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Movimiento cancelado!");
                btnActualizar.doClick();
                fila = -1;
            }

        }
    }//GEN-LAST:event_rSButtonRiple4ActionPerformed

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        FrmGestionRubroProducto form = new FrmGestionRubroProducto();

        deskPrincipal.add(form);
        Dimension desktopSize = deskPrincipal.getSize();
        Dimension FrameSize = form.getSize();

        form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form.setVisible(true);

        form.setClosable(true);
        form.setIconifiable(false);
        this.dispose();
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojeru_san.RSButtonRiple rSButtonRiple4;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    private javax.swing.JTable tablaSubRubro;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
