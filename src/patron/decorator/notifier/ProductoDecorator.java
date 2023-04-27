/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.decorator.notifier;

import patron.decorator.ProductoInt;

/**
 *
 * @author jvall
 */
public abstract class ProductoDecorator implements ProductoInt{
    
    private ProductoInt producto;
    
    public ProductoDecorator(ProductoInt producto){
        this.producto = producto;
    }
    
    protected ProductoInt getProducto(){
        return producto;
    }
}
