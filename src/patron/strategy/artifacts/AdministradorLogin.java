/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.strategy.artifacts;

import javax.swing.JOptionPane;
import patron.strategy.ILoginStrategy;
import vista.Interfaz_venta;
import vista.PanelAdministrador;

/**
 *
 * @author PC
 */
public class AdministradorLogin implements ILoginStrategy{
    
    @Override
    public void login(){
        JOptionPane.showMessageDialog(null,"Login por administrador"); //To change body of generated methods, choose Tools | Templates.
        Interfaz_venta interfaz_venta = new Interfaz_venta();
        PanelAdministrador v = new PanelAdministrador();
        interfaz_venta.getContentPane().removeAll();
        interfaz_venta.repaint();
        interfaz_venta.getContentPane().add(v);
        interfaz_venta.pack();
    }
}
