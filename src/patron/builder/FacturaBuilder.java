/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.builder;

import modelo.Factura;


/**
 *
 * @author jvall
 */
public class FacturaBuilder implements Builder{
    
    private String codigo;
    private String RUC;
    private double monto;

    @Override
    public void crearCodigoCliente(String RUC){
        this.RUC = RUC;
    }
    @Override
    public void establecerMonto(Double monto){
        this.monto = monto;
    }
    @Override
    public void crearCodigo(){
        codigo = "F0010";
    }
    
    @Override
    public Factura getResult(){
        return new Factura(this.codigo,this.monto,this.RUC);
    }
}

