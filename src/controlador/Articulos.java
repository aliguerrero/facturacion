/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Olberth
 */
public class Articulos {
    protected int id_articulo;
    protected String descripcion;
    protected int precio_venta;
    protected int precio_costo;
    protected int stock;
    protected int cod_tipo_articulo;
    protected String cod_proveedor;
    protected String fecha_ingreso;

    public Articulos(int id_articulo, String descripcion, int precio_venta, int precio_costo, int stock, int cod_tipo_articulo, String cod_proveedor, String fecha_ingreso) {
        this.id_articulo = id_articulo;
        this.descripcion = descripcion;
        this.precio_venta = precio_venta;
        this.precio_costo = precio_costo;
        this.stock = stock;
        this.cod_tipo_articulo = cod_tipo_articulo;
        this.cod_proveedor = cod_proveedor;
        this.fecha_ingreso = fecha_ingreso;
    }

    public Articulos() {

    }

    public int getId_articulo() {
        return id_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public int getPrecio_costo() {
        return precio_costo;
    }

    public int getStock() {
        return stock;
    }

    public int getCod_tipo_articulo() {
        return cod_tipo_articulo;
    }

    public String getCod_proveedor() {
        return cod_proveedor;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setPrecio_costo(int precio_costo) {
        this.precio_costo = precio_costo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCod_tipo_articulo(int cod_tipo_articulo) {
        this.cod_tipo_articulo = cod_tipo_articulo;
    }

    public void setCod_proveedor(String cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

  

    
    
}