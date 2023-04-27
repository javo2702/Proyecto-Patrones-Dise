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
public class ProductoPromocion extends ProductoDecorator {
    public ProductoPromocion (ProductoInt producto){
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
    
    public String promocion(Producto prod){
        return prod.getCodigo();
    }
}
