/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Inventario;

/**
 *
 * @author jvall
 */
public class LlenarProductos {
    
    private static String fichero = "Productos.obj";
    
    /*
    private ArrayList<Inventario> productos;
    public LlenarProductos(){
        productos = new ArrayList<>();
    }
    
    public void llenar(){
        Inventario i;
        ProductoInt p;
        p = new Producto("P0001","Agua","Botella","San Luis",1.5,2.5,2.5);
        // Producto 1
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 2
        p = new Producto("P0002","Arroz","Bolsa","Costeno",2.5,3.5,3.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 3
        p = new Producto("P0003","Azucar","Bolsa","Costeno",1.5,2.5,2.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 4
        p = new Producto("P0004","Yogurt","Botella","Gloria",5.5,6.5,6.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 5
        p = new Producto("P0005","Mantequilla","Barra","Gloria",3.5,5.5,5.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 6
        p = new Producto("P0006","Papas","Bolsa","Lays",0.5,1.5,1.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 7
        p = new Producto("P0007","Piqueos","Bolsa","",1.5,2.5,2.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 8
        p = new Producto("P0008","Coca cola","Botella","Coca Cola",1.5,2.5,2.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 9
        p = new Producto("P0009","Sporade","Botella","age",1.8,2.5,2.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
        // Producto 10
        p = new Producto("P0010","Cafe","Sobre","Altomayo",0.9,1.5,1.5);
        i = new Inventario(p,20);
        productos.add(i);
        // ----------
    }
    public ArrayList<Inventario> getProductos(){
        llenar();
        return productos;
    }
    
    public void setProductos(ArrayList<Inventario> p){
        this.productos = p;
    }*/
    
 
    public static ArrayList<Inventario> cargaProductos() {
            FileInputStream fis = null;
            ObjectInputStream entrada = null;
            ArrayList<Inventario> obj = null;
            try {
                    fis = new FileInputStream(fichero);
                    entrada = new ObjectInputStream(fis);
                    obj = (ArrayList<Inventario>) entrada.readObject();
            } catch (IOException ex) {
                    System.out.println("Fallo la carga del archivo");
            } catch (ClassNotFoundException ex) {
                    System.out.println("Fallo la carga del objeto 2");
            } finally {
                    try {
                            if (fis != null) {
                                    fis.close();
                            }
                    } catch (IOException ex) {
                            System.out.println("Fallo la carga del archivo 3");
                    }
                    try {
                            if (entrada != null) {
                                    entrada.close();
                            }
                    } catch (IOException ex) {
                            System.out.println("Fallo la carga del archivo");
                    }
            }
            return obj;
    }

    public static void guardaArchivo(ArrayList<Inventario> object) {
        ObjectOutputStream salida = null;
        FileOutputStream fos = null;
        try {
                fos = new FileOutputStream(fichero);
                salida = new ObjectOutputStream(fos);
                salida.writeObject(object);
                System.out.println("Se guardo correctamente el archivo");
        } catch (IOException ex) {
                System.out.println("Fallo la cerrar del archivo");

        } finally {
                try {
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException ex) {
                    System.out.println("Fallo la cerrar del archivo 2");
                }
                try {
                    if (salida != null) {
                        salida.close();
                    }
                } catch (IOException ex) {
                    System.out.println("Fallo la cerrar del archivo 3");
                }
        }
    }
}
