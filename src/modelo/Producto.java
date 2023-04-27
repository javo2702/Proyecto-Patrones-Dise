/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import patron.decorator.ProductoInt;

/**
 *
 * @author jvall
 */
public class Producto implements ProductoInt, Serializable{
    private String codigo;
    private String nombre;
    private String presentacion;
    private String marca;
    private Double precio_compra;
    private Double precio_venta;
    private Double precio_venta_original;
    
    public Producto(){
        
    }

    public Producto(String codigo, String nombre, String presentacion, String marca, Double precio_compra, Double precio_venta, Double precio_venta_original) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.marca = marca;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.precio_venta_original = precio_venta_original;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public Double getPrecio_compra() {
        return precio_compra;
    }

    @Override
    public void setPrecio_compra(Double precio_compra) {
        this.precio_compra = precio_compra;
    }

    @Override
    public Double getPrecio_venta() {
        return precio_venta;
    }

    @Override
    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public Double getPrecio_venta_original() {
        return precio_venta_original;
    }

    public void setPrecio_venta_original(Double precio_venta_original) {
        this.precio_venta_original = precio_venta_original;
    }

}
