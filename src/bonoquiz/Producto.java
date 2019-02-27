/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonoquiz;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public abstract class Producto implements Serializable{
    protected String nombre;
    protected ArrayList<Eslabon> traza;
    public Producto(String nombre) {
        this.nombre = nombre;
        this.traza=new ArrayList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addTraza(Eslabon es){
       this.traza.add(es);
    }
    public abstract void showTraza();
        
        
    }
    

