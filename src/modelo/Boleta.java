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
public class Boleta extends Comprobante {
    private String DNI;
    
    public Boleta(String codigo, Double monto, String DNI){
        super(codigo,monto);
        this.DNI = DNI;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
