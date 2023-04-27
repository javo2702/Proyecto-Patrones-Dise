/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.decorator.notifier;

import modelo.Producto;
import patron.decorator.ProductoInt;

/**
 *
 * @author jvall
 */
public class ProductoDescuento extends ProductoDecorator{
    public ProductoDescuento (ProductoInt producto){
        super(producto);        
    }
    
    @Override
    public Double getPrecio_compra(){
        return getProducto().getPrecio_compra();
    }

    @Override
    public void setPrecio_compra(Double precio_compra){
        getProducto().setPrecio_compra(precio_compra);
    }

    @Override
    public Double getPrecio_venta(){
        return getProducto().getPrecio_venta();
    }

    @Override
    public void setPrecio_venta(Double precio_venta){
        getProducto().setPrecio_venta(precio_venta);
    }
    
    public void setDescuento(double porcentaje){
        double nuevo_precio=getProducto().getPrecio_venta();
        nuevo_precio=nuevo_precio*(100-porcentaje)/100;
        getProducto().setPrecio_venta(nuevo_precio);
    } 
    
    public Producto getProductoM(){
        return (Producto)getProducto();
    }
}
