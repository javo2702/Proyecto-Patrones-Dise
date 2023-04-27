/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.command.commands;

import modelo.Inventario;
import patron.command.IOperacion;

/**
 *
 * @author jvall
 */
public class DisminuirImpl implements IOperacion{
    private Inventario productoStock;
    private int cantidad;

    public DisminuirImpl(Inventario productoStock,int cantidad){
        this.productoStock=productoStock;
        this.cantidad=cantidad;
    }

    @Override
    public void ejecutar() {
        this.productoStock.disminuir(this.cantidad);
    }

}
