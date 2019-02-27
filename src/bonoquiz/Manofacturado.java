/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonoquiz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Manofacturado extends Producto implements Serializable{
    private ArrayList<MatPrima> matPrima;
    

    public Manofacturado(String nombre) {
        super(nombre);
        this.matPrima =new ArrayList<>();
        addManufacturer();
    }
    public void addManufacturer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del productor");
                String nom = sc.nextLine();
                System.out.println("Descripcion");
                String descripcion = sc.nextLine();
                System.out.println("Direccion latitud");
                int lat = sc.nextInt();
                System.out.println("Direccion longitud");
                int lon = sc.nextInt();
                this.traza.add( new Manufacturer(nom, descripcion, lat, lon));
                boolean a = true;
                System.out.println("Añada la materia prima");
                while (a){
                    System.out.println("1 Añadir");
                    
                    System.out.println("2 Completar");
                    int b = sc.nextInt();
                    switch (b){
                        case 1: System.out.println("Ingrese el nombre de la materia prima");
                            this.matPrima.add(new MatPrima(sc.nextLine()));break;
                        case 2: a=false; break;
                    }
                }
    }

    @Override
    public void showTraza() {
        for (int i = 0; i < this.traza.size(); i++) {
            if(this.traza.get(i) instanceof Farmer){
                System.out.println("Granja");
            }
            if(this.traza.get(i) instanceof Manufacturer){
                System.out.println("Manofacturado en");
            }   
            if(this.traza.get(i) instanceof DistributionCenter){
                System.out.println("Centro de distribucion distribuido desde");
            }
            if(this.traza.get(i) instanceof Retail){
                System.out.println("Tienda vendido en ");
            }
            
                this.traza.get(i).darInformacion();
            } //To change body of generated methods, choose Tools | Templates.
    }
}
