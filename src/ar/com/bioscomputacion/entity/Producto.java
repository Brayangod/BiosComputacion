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
public class Producto {

    private int idProducto;
    private String nombreRubro;
    private String nombreSubRubro;
    private String nombreProducto;
    private long codigoBarra;
    private String codigoProveedor;
    private Double precioCosto;
    private Double precioEfectivo;
    private Double precioPlanCuotas;
    private Double porcentajeGanancias;
    private int stock;

    public Producto() {
    }

    public Producto(String nombreRubro, String nombreSubRubro, String nombreProducto, long codigoBarra, String codigoProveedor, Double precioCosto, Double precioEfectivo, Double precioPlanCuotas, Double porcentajeGanancias, int stock) {
        this.nombreRubro = nombreRubro;
        this.nombreSubRubro = nombreSubRubro;
        this.nombreProducto = nombreProducto;
        this.codigoBarra = codigoBarra;
        this.codigoProveedor = codigoProveedor;
        this.precioCosto = precioCosto;
        this.precioEfectivo = precioEfectivo;
        this.precioPlanCuotas = precioPlanCuotas;
        this.porcentajeGanancias = porcentajeGanancias;
        this.stock = stock;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreRubro() {
        return nombreRubro;
    }

    public void setNombreRubro(String nombreRubro) {
        this.nombreRubro = nombreRubro;
    }

    public String getNombreSubRubro() {
        return nombreSubRubro;
    }

    public void setNombreSubRubro(String nombreSubRubro) {
        this.nombreSubRubro = nombreSubRubro;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(long codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getPrecioEfectivo() {
        return precioEfectivo;
    }

    public void setPrecioEfectivo(Double precioEfectivo) {
        this.precioEfectivo = precioEfectivo;
    }

    public Double getPrecioPlanCuotas() {
        return precioPlanCuotas;
    }

    public void setPrecioPlanCuotas(Double precioPlanCuotas) {
        this.precioPlanCuotas = precioPlanCuotas;
    }

    public Double getPorcentajeGanancias() {
        return porcentajeGanancias;
    }

    public void setPorcentajeGanancias(Double porcentajeGanancias) {
        this.porcentajeGanancias = porcentajeGanancias;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreRubro=" + nombreRubro + ", nombreSubRubro=" + nombreSubRubro + ", nombreProducto=" + nombreProducto + ", codigoBarra=" + codigoBarra + ", codigoProveedor=" + codigoProveedor + ", precioCosto=" + precioCosto + ", precioEfectivo=" + precioEfectivo + ", precioPlanCuotas=" + precioPlanCuotas + ", porcentajeGanancias=" + porcentajeGanancias + ", stock=" + stock + '}';
    }

}
