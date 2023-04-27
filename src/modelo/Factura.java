/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jvall
 */
public class Factura extends Comprobante {
    private String RUC;
    
    public Factura(String codigo, Double monto, String RUC){
        super(codigo,monto);
        this.RUC = RUC;
    }
    
    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
}
