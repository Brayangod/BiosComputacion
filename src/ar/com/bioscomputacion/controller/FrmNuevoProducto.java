/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.controller;

import ar.com.bioscomputacion.data.ParametrizacionDAO;
import ar.com.bioscomputacion.data.ProductoDAO;
import ar.com.bioscomputacion.data.RubroProductoDAO;
import ar.com.bioscomputacion.data.SubRubroProductoDAO;
import ar.com.bioscomputacion.entity.Producto;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Caco
 */
public class FrmNuevoProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmGenerico
     */
    public FrmNuevoProducto() {
        initComponents();
        listarRubros();
        listarSubRubros();
        listarPorcentajeGanacias();
    }

    public void listarRubros() {
        RubroProductoDAO rubroDao = new RubroProductoDAO();

        for (String rubros : rubroDao.listar()) {
            cbRubro.addItem(rubros);
        }

    }

    public void listarSubRubros() {
        cbSubRubro.removeAllItems();
        SubRubroProductoDAO subRubroDao = new SubRubroProductoDAO();

        if (cbRubro.getSelectedItem() != null) {
            for (String subRubros : subRubroDao.listar(cbRubro.getSelectedItem().toString())) {
                cbSubRubro.addItem(subRubros);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Recuerde agregar los rubros y/o sub rubros necesarios para el alta del producto");
        }
    }

    public void listarPorcentajeGanacias() {
        ParametrizacionDAO parametros = new ParametrizacionDAO();

        txtPorcentajeGanancias.setText(String.valueOf(parametros.listarGanancia()));
    }

    public void calcularPrecio(Double precioCosto) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("0.00", simbolos);

        Double efectivo = Double.valueOf(formateador.format(Double.valueOf(txtPrecioCosto.getText()) + (Double.valueOf(txtPrecioCosto.getText()) * (Double.valueOf(txtPorcentajeGanancias.getText()) - 10)) / 100));
        Double cuotas = Double.valueOf(formateador.format(Double.valueOf(txtPrecioCosto.getText()) + (Double.valueOf(txtPrecioCosto.getText()) * Double.valueOf(txtPorcentajeGanancias.getText())) / 100));

        txtPrecioEfectivo.setText(String.valueOf(efectivo));
        txtPrecioCuotas.setText(String.valueOf(cuotas));

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
        txtCodBarras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioEfectivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioCuotas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPorcentajeGanancias = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioCosto = new javax.swing.JTextField();
        btnAltaProducto = new rojeru_san.RSButtonRiple();
        jLabel9 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbRubro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbSubRubro = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(51, 84, 111));

        rSPanelShadow2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTA DE PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO DE BARRAS:");

        txtCodBarras.setBackground(new java.awt.Color(51, 84, 111));
        txtCodBarras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCodBarras.setForeground(new java.awt.Color(255, 255, 255));
        txtCodBarras.setNextFocusableComponent(txtCodProveedor);
        txtCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodBarrasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CODIGO DEL PROVEEDOR:");

        txtCodProveedor.setBackground(new java.awt.Color(51, 84, 111));
        txtCodProveedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCodProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtCodProveedor.setNextFocusableComponent(txtNombreProducto);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE DEL PRODUCTO:");

        txtNombreProducto.setBackground(new java.awt.Color(51, 84, 111));
        txtNombreProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setNextFocusableComponent(txtPrecioCosto);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRECIO VENTA EFECTIVO:");

        txtPrecioEfectivo.setBackground(new java.awt.Color(51, 84, 111));
        txtPrecioEfectivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPrecioEfectivo.setForeground(new java.awt.Color(153, 255, 0));
        txtPrecioEfectivo.setText("0.00");
        txtPrecioEfectivo.setNextFocusableComponent(txtPrecioCuotas);
        txtPrecioEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioEfectivoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRECIO PLAN 3 CUOTAS:");

        txtPrecioCuotas.setBackground(new java.awt.Color(51, 84, 111));
        txtPrecioCuotas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPrecioCuotas.setForeground(new java.awt.Color(153, 255, 0));
        txtPrecioCuotas.setText("0.00");
        txtPrecioCuotas.setNextFocusableComponent(txtPorcentajeGanancias);
        txtPrecioCuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCuotasKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PORCENTAJE GANANCIAS:");

        txtPorcentajeGanancias.setBackground(new java.awt.Color(51, 84, 111));
        txtPorcentajeGanancias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPorcentajeGanancias.setForeground(new java.awt.Color(153, 255, 0));
        txtPorcentajeGanancias.setText("0.00");
        txtPorcentajeGanancias.setNextFocusableComponent(txtStock);
        txtPorcentajeGanancias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcentajeGananciasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeGananciasKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRECIO COSTO:");

        txtPrecioCosto.setBackground(new java.awt.Color(51, 84, 111));
        txtPrecioCosto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPrecioCosto.setForeground(new java.awt.Color(153, 255, 0));
        txtPrecioCosto.setText("0.00");
        txtPrecioCosto.setNextFocusableComponent(txtPrecioEfectivo);
        txtPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioCostoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCostoKeyTyped(evt);
            }
        });

        btnAltaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ar/com/bioscomputacion/desing/icons/agregar.png"))); // NOI18N
        btnAltaProducto.setText("ALTA DE PRODUCTO");
        btnAltaProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAltaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaProductoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("STOCK:");

        txtStock.setBackground(new java.awt.Color(51, 84, 111));
        txtStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setText("0");
        txtStock.setNextFocusableComponent(cbRubro);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RUBRO:");

        cbRubro.setBackground(new java.awt.Color(51, 84, 111));
        cbRubro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbRubro.setForeground(new java.awt.Color(255, 255, 255));
        cbRubro.setNextFocusableComponent(cbSubRubro);
        cbRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRubroActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SUB RUBRO:");

        cbSubRubro.setBackground(new java.awt.Color(51, 84, 111));
        cbSubRubro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbSubRubro.setForeground(new java.awt.Color(255, 255, 255));
        cbSubRubro.setNextFocusableComponent(txtCodBarras);

        javax.swing.GroupLayout rSPanelShadow2Layout = new javax.swing.GroupLayout(rSPanelShadow2);
        rSPanelShadow2.setLayout(rSPanelShadow2Layout);
        rSPanelShadow2Layout.setHorizontalGroup(
            rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelShadow2Layout.createSequentialGroup()
                        .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrecioCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtPorcentajeGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(149, 149, 149))
                                    .addComponent(cbRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(cbSubRubro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                        .addComponent(btnAltaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                        .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSubRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorcentajeGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(rSPanelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelShadow2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnAltaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void cbRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRubroActionPerformed
        listarSubRubros();
    }//GEN-LAST:event_cbRubroActionPerformed

    private void txtPrecioCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCostoKeyReleased
        if (txtPrecioCosto.getText().length() != 0) {
            calcularPrecio(Double.valueOf(txtPrecioCosto.getText()));
        }
    }//GEN-LAST:event_txtPrecioCostoKeyReleased

    private void txtPorcentajeGananciasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeGananciasKeyReleased
        if (txtPorcentajeGanancias.getText().length() != 0) {
            calcularPrecio(Double.valueOf(txtPrecioCosto.getText()));
        }

    }//GEN-LAST:event_txtPorcentajeGananciasKeyReleased

    private void txtPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCostoKeyTyped
        char c = evt.getKeyChar();

        if (txtPrecioCosto.getText().contains(".") && c == '.') {
            getToolkit().beep();
            evt.consume();
        } else if (!Character.isDigit(c)) {
            if (c != '.') {
                getToolkit().beep();
                evt.consume();
            }

        }
    }//GEN-LAST:event_txtPrecioCostoKeyTyped

    private void txtPrecioEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioEfectivoKeyTyped
        char c = evt.getKeyChar();

        if (txtPrecioEfectivo.getText().contains(".") && c == '.') {
            getToolkit().beep();
            evt.consume();
        } else if (!Character.isDigit(c)) {
            if (c != '.') {
                getToolkit().beep();
                evt.consume();
            }

        }
    }//GEN-LAST:event_txtPrecioEfectivoKeyTyped

    private void txtPrecioCuotasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCuotasKeyTyped
        char c = evt.getKeyChar();

        if (txtPrecioCuotas.getText().contains(".") && c == '.') {
            getToolkit().beep();
            evt.consume();
        } else if (!Character.isDigit(c)) {
            if (c != '.') {
                getToolkit().beep();
                evt.consume();
            }

        }
    }//GEN-LAST:event_txtPrecioCuotasKeyTyped

    private void txtPorcentajeGananciasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeGananciasKeyTyped
        char c = evt.getKeyChar();

        if (txtPorcentajeGanancias.getText().contains(".") && c == '.') {
            getToolkit().beep();
            evt.consume();
        } else if (!Character.isDigit(c)) {
            if (c != '.') {
                getToolkit().beep();
                evt.consume();
            }

        }
    }//GEN-LAST:event_txtPorcentajeGananciasKeyTyped

    private void btnAltaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaProductoActionPerformed

        if (txtCodBarras.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de barra del producto");
            txtCodBarras.requestFocus();
        } else if (txtCodProveedor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de proveedor del producto");
            txtCodProveedor.requestFocus();
        } else if (txtNombreProducto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del producto");
            txtNombreProducto.requestFocus();
        } else if (txtPrecioCosto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el precio de costo del producto");
            txtPrecioCosto.requestFocus();
        } else if (txtPrecioEfectivo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el precio de efectivo del producto");
            txtPrecioEfectivo.requestFocus();
        } else if (txtPrecioCuotas.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el precio de plan 3 cuotas del producto");
            txtPrecioCuotas.requestFocus();
        } else if (txtPorcentajeGanancias.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el porcentaje de ganancia del producto");
            txtPorcentajeGanancias.requestFocus();
        } else if (txtStock.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el stock actual del producto");
            txtStock.requestFocus();
        } else if (cbRubro.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Por lo menos debe seleccionar un rubro para dar de alta el producto");
            cbRubro.requestFocus();
        } else {
            Producto producto = new Producto();
            producto.setCodigoBarra(Long.valueOf(txtCodBarras.getText()));
            producto.setCodigoProveedor(String.valueOf(txtCodProveedor.getText()));
            producto.setNombreProducto(txtNombreProducto.getText().toUpperCase());
            producto.setPrecioCosto(Double.valueOf(txtPrecioCosto.getText()));
            producto.setPrecioEfectivo(Double.valueOf(txtPrecioEfectivo.getText()));
            producto.setPrecioPlanCuotas(Double.valueOf(txtPrecioCuotas.getText()));
            producto.setPorcentajeGanancias(Double.valueOf(txtPorcentajeGanancias.getText()));
            producto.setStock(Integer.parseInt(txtStock.getText()));
            producto.setNombreRubro(String.valueOf(cbRubro.getSelectedItem()));
            if (!String.valueOf(cbSubRubro.getSelectedItem()).equals("null")) {
                producto.setNombreSubRubro(String.valueOf(cbSubRubro.getSelectedItem()));
            }

            ProductoDAO productoDao = new ProductoDAO();

            if (productoDao.agregar(producto)) {
                JOptionPane.showMessageDialog(null, "El producto ha sido de alta satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al dar de alta el producto");
            }
            FrmGestionDeProducto.btnActualizar.doClick();
            this.dispose();
        }

    }//GEN-LAST:event_btnAltaProductoActionPerformed

    private void txtCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodBarrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnAltaProducto;
    private javax.swing.JComboBox<String> cbRubro;
    private javax.swing.JComboBox<String> cbSubRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtCodProveedor;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPorcentajeGanancias;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioCuotas;
    private javax.swing.JTextField txtPrecioEfectivo;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
