/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.desing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Brayan Godoy
 */
public class ColorCeldaGestionProductoCentrado extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col) {
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        setHorizontalAlignment(SwingConstants.CENTER);
        int stock = Integer.parseInt(table.getValueAt(row, 10).toString());
        if (stock < 10) {

            setBackground(new Color(249, 137, 113));
            setForeground(Color.black);

        } else {
            setBackground(new Color(146, 208, 80));
            setForeground(Color.black);
        }

        return this;

    }

}
