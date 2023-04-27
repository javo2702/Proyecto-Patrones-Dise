/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.commands.invoker;

import java.util.ArrayList;
import patron.command.IOperacion;

/**
 *
 * @author jvall
 */
public class Invoker {
    
    private ArrayList<IOperacion> operaciones = new ArrayList<>();
    
    public Invoker(){}

    public ArrayList<IOperacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<IOperacion> operaciones) {
        this.operaciones = operaciones;
    }
    public void eliminarOperacion(int indice){
        operaciones.remove(indice);
    }
    public void recibirOperacion(IOperacion operacion){
        this.operaciones.add(operacion);
    }

    public void realizarOperaciones(){
        this.operaciones.forEach(x -> x.ejecutar());
        this.operaciones.clear();
    }
}
