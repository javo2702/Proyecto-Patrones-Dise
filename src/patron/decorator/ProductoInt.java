/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.decorator;

/**
 *
 * @author jvall
 */
public interface ProductoInt {
    public Double getPrecio_compra();
    public void setPrecio_compra(Double precio_compra);
    public Double getPrecio_venta();
    public void setPrecio_venta(Double precio_venta);
}
