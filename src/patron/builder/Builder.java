    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.builder;

import modelo.Comprobante;

/**
 *
 * @author jvall
 */
public interface Builder {
    //void setTipoComprobante(Comprobante comp);
    void crearCodigoCliente(String s);
    void establecerMonto(Double s);
    void crearCodigo();
    Comprobante getResult();
}
