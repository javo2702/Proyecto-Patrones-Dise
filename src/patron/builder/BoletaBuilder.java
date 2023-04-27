/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.builder;

import modelo.Boleta;
/**
 *
 * @author jvall
 */
public class BoletaBuilder implements Builder{
    
    private String codigo;
    private String DNI;
    private double monto;

    @Override
    public void crearCodigoCliente(String DNI){
        this.DNI = DNI;
    }
    @Override
    public void establecerMonto(Double monto){
        this.monto = monto;
    }
    @Override
    public void crearCodigo(){
        codigo = "B0010";
    }
    
    @Override
    public Boleta getResult(){
        return new Boleta(this.codigo,this.monto,this.DNI);
    }
}
