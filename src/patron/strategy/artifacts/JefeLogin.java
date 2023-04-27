/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.strategy.artifacts;

import javax.swing.JOptionPane;
import patron.strategy.ILoginStrategy;
import vista.Interfaz_venta;
import vista.PanelJefe;

/**
 *
 * @author PC
 */
public class JefeLogin implements ILoginStrategy{

    @Override
    public void login() {
        JOptionPane.showMessageDialog(null,"Login por Jefe de almacen"); //To change body of generated methods, choose Tools | Templates.
        Interfaz_venta interfaz_venta = new Interfaz_venta();
        PanelJefe v = new PanelJefe();
        interfaz_venta.getContentPane().removeAll();
        interfaz_venta.repaint();
        interfaz_venta.getContentPane().add(v);
        interfaz_venta.pack();
    }
    
}
