/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.builder.director;

import modelo.Boleta;
import patron.builder.Builder;
import modelo.Factura;

/**
 *
 * @author jvall
 */
public class Director {
    
    Builder builder;
    
    public Director(Builder builder){
        this.builder = builder;
    }
    
    public Boleta crearBoleta(String DNI,Double monto){
        builder.crearCodigo();
        builder.crearCodigoCliente(DNI);
        builder.establecerMonto(monto);
        return (Boleta)builder.getResult();
    }
    public Factura crearFactura(String RUC,Double monto){
        builder.crearCodigo();
        builder.crearCodigoCliente(RUC);
        builder.establecerMonto(monto);
        return (Factura)builder.getResult();
    }
}
