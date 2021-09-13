/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.Formularios;

import ar.com.bioscomputacion.Funciones.Apertura;
import ar.com.bioscomputacion.Funciones.ConexionBD;
import ar.com.bioscomputacion.Funciones.Iniciar;
import ar.com.bioscomputacion.Funciones.TextPrompt;
import java.awt.Desktop;
import java.net.URI;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        p_cargando.setVisible(false);
        new TextPrompt("¡Ingrese su usuario!", txtUsuario);
        new TextPrompt("¡Ingrese su contraseña!", txtPassword);
        txtUsuario.requestFocus();
        setIconImage(new ImageIcon(getClass().getResource("/ar/com/bioscomputacion/Iconos/forms.png")).getImage());
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
        jPanel2 = new javax.swing.JPanel();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelUsuario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        panelContraseña = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIniciar = new rojeru_san.RSButtonRiple();
        p_cargando = new rojerusan.componentes.RSProgressMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 58, 146));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelShadow1.setBackground(new java.awt.Color(0, 58, 146));
        rSPanelShadow1.setOpaque(false);
        rSPanelShadow1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRiple2.setBackground(new java.awt.Color(0, 58, 146));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/Imagenes/btn-minimizar.png"))); // NOI18N
        rSButtonRiple2.setBorderPainted(false);
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 24));

        rSButtonRiple1.setBackground(new java.awt.Color(0, 58, 146));
        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/Imagenes/btn-cerrar.png"))); // NOI18N
        rSButtonRiple1.setBorderPainted(false);
        rSButtonRiple1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonRiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 45, 24));

        rSPanelShadow1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 5, 95, 24));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/Imagenes/Logo-mediano.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        rSPanelShadow1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 35, 418, 194));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIAR SESIÓN");
        rSPanelShadow1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 235, 398, -1));

        panelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/Iconos/icons8_customer_36px_3.png"))); // NOI18N
        panelUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 58, 146));
        txtUsuario.setToolTipText("Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.setName(""); // NOI18N
        panelUsuario.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 11, 251, 36));
        txtUsuario.getAccessibleContext().setAccessibleName("");

        rSPanelShadow1.add(panelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 281, 330, 60));

        panelContraseña.setBackground(new java.awt.Color(255, 255, 255));
        panelContraseña.setPreferredSize(new java.awt.Dimension(315, 58));
        panelContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/Iconos/icons8_lock_36px_2.png"))); // NOI18N
        panelContraseña.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, -1, -1));

        txtPassword.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 58, 146));
        txtPassword.setToolTipText("Contraseña");
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        panelContraseña.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 11, 253, 36));

        rSPanelShadow1.add(panelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 357, 330, 60));

        btnIniciar.setText("Iniciar");
        btnIniciar.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        rSPanelShadow1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        p_cargando.setFocusable(false);
        rSPanelShadow1.add(p_cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jPanel1.add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 428, 558));

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

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/bios.computacion"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        if (txtUsuario.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el usuario");
            txtUsuario.requestFocus();
            return;
        }
        if (txtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese la contraseña");
            txtPassword.requestFocus();
            return;
        }
        p_cargando.setVisible(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    txtUsuario.setFocusable(false);
                    txtPassword.setFocusable(false);
                    btnIniciar.setEnabled(false);
                    Thread.sleep(2000);
                    Iniciar login = new Iniciar();
                    p_cargando.setVisible(false);
                    txtUsuario.setFocusable(true);
                    txtPassword.setFocusable(true);
                    btnIniciar.setEnabled(true);
                    switch (login.verificarUsuario(txtUsuario.getText(), txtPassword.getText())) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Error en la base de datos");
                            break;
                        case 1:
                            FrmPrincipal form = new FrmPrincipal();
                            form.setVisible(true);
                            form.lbNombre.setText(login.nombre);
                            form.lbTipo.setText(login.tipo);
                            form.txtCod_usuario.setText(String.valueOf(login.cod_usuario));
                            if(!new Apertura().isCajaAbierta()){
                                FrmPrincipal.menuVentas.setEnabled(false);
                                FrmPrincipal.menuPlanilla.setEnabled(false);
                                FrmPrincipal.menuReparaciones.setEnabled(false);
                                FrmPrincipal.menuCtaCte.setEnabled(false);
                                FrmPrincipal.menuItemCierre.setEnabled(false);
                                FrmPrincipal.menuItemApertura.setEnabled(true);
                            }
                            else{
                                FrmPrincipal.menuVentas.setEnabled(true);
                                FrmPrincipal.menuPlanilla.setEnabled(true);
                                FrmPrincipal.menuReparaciones.setEnabled(true);
                                FrmPrincipal.menuCtaCte.setEnabled(true);
                                FrmPrincipal.menuItemCierre.setEnabled(true);
                                FrmPrincipal.menuItemApertura.setEnabled(false);
                            }
                            FrmLogin.this.dispose();
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Su usuario y/o contraseña son incorrectos");
                            break;

                    }
//                    if (login.verificarUsuario(txtUsuario.getText(), txtPassword.getText()) == 0) {
//                        JOptionPane.showMessageDialog(null, "Error en la base de datos");
//                    } else if (login.verificarUsuario(txtUsuario.getText(), txtPassword.getText()) == 1) {
//                        JOptionPane.showMessageDialog(null, "Su usuario y contraseña son correctos");
//                    } else if (login.verificarUsuario(txtUsuario.getText(), txtPassword.getText()) == 2) {
//
//                        JOptionPane.showMessageDialog(null, "Su usuario y/o contraseña son incorrectos");
//                    }
                } catch (Exception e) {
                }
            }

        }).start();

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnIniciar.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.componentes.RSProgressMaterial p_cargando;
    private javax.swing.JPanel panelContraseña;
    private javax.swing.JPanel panelUsuario;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
