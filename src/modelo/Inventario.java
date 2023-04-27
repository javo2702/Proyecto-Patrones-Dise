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
public class Inventario implements Serializable {
    private ProductoInt p;
    private int stock;

    public Inventario(){
        
    }
    public Inventario(ProductoInt p, int stock) {
        this.p = p;
        this.stock = stock;
    }
    
    public ProductoInt getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void disminuir(int cant){
        this.stock=this.stock-cant;
    }

    public void aumentar(int cant){
        this.stock=this.stock+cant;
    }
    
}
