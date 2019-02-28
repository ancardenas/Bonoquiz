/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonoquiz;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class MatPrima extends Producto implements Serializable{
    
    public MatPrima(String nombre) {
        super(nombre);
        addGranja();
    }
    public void addGranja(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la granja que tiene la materia prima");
                String nom = sc.nextLine();
                System.out.println("Descripcion de la misma");
                String descripcion = sc.nextLine();
                System.out.println("Direccion latitud de la granja");
                int lat = sc.nextInt();
                System.out.println("Direccion longitud");
                int lon = sc.nextInt();
                this.traza.add(new Farmer(nom, descripcion, lat, lon));
    }

    @Override
    public void showTraza() {
        System.out.println(this.nombre + " viene de la granja");
        this.traza.get(0).darInformacion();//To change body of generated methods, choose Tools | Templates.
    }
}
