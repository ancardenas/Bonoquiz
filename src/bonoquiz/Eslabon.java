/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonoquiz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Andres
 */
public class Eslabon implements Serializable{
    protected String nom;
    protected String descripcion;
    protected int latitud;
    protected int longitud;
    protected HashMap<String,Producto> productos;
    public Eslabon(String nom, String descripcion, int latitud, int longitud) {
        this.nom = nom;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.productos = new HashMap<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public void addProducto(String nom,Producto pord){
        this.productos.put(nom, pord);
    }
    public void getProducto(String nom){
        this.productos.get(nom);
    }
    public void darInformacion(){
        System.out.println(this.nom);
        System.out.println(this.descripcion);
        System.out.println("Direccion longitud "+this.longitud);
        System.out.println("Direccion latitud "+this.latitud);
             
    }
}
