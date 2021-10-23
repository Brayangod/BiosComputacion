/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.bioscomputacion.entity;

/**
 *
 * @author braya
 */
public class Parametrizacion {
    
    private Double porcentaje_ganancias;
    private Double precio_dolar;

    public Parametrizacion() {
    }

    public Parametrizacion(Double porcentaje_ganancias, Double precio_dolar) {
        this.porcentaje_ganancias = porcentaje_ganancias;
        this.precio_dolar = precio_dolar;
    }

    public Double getPorcentaje_ganancias() {
        return porcentaje_ganancias;
    }

    public void setPorcentaje_ganancias(Double porcentaje_ganancias) {
        this.porcentaje_ganancias = porcentaje_ganancias;
    }

    public Double getPrecio_dolar() {
        return precio_dolar;
    }

    public void setPrecio_dolar(Double precio_dolar) {
        this.precio_dolar = precio_dolar;
    }

    @Override
    public String toString() {
        return "Parametrizacion{" + "porcentaje_ganancias=" + porcentaje_ganancias + ", precio_dolar=" + precio_dolar + '}';
    }
    
    
    
}
