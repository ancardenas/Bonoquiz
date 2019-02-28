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
        Scanner sc = new  Scanner(System.in);
        System.out.println("Esta en un centro de distribucion y/n");
        if("y".equals(sc.next())){addDistributionCenter();
            System.out.println("Esta en Venta Y/N");
        if("y".equalsIgnoreCase(sc.next())){addRetail();}}
        
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
                        String nom2 =sc.nextLine();
                            this.matPrima.add(new MatPrima(sc.nextLine()));break;
                        case 2: a=false; break;
                    }
                }
    }
    public void addDistributionCenter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del centro de distribucion");
                String nom = sc.nextLine();
                System.out.println("Descripcion");
                String descripcion = sc.nextLine();
                System.out.println("Direccion latitud");
                int lat = sc.nextInt();
                System.out.println("Direccion longitud");
                int lon = sc.nextInt();
                this.traza.add( new DistributionCenter(nom, descripcion, lat, lon));
                boolean a = true;
                System.out.println("Añada la materia prima");
                
    }
public void addRetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del centro de la tienda");
                String nom = sc.nextLine();
                System.out.println("Descripcion");
                String descripcion = sc.nextLine();
                System.out.println("Direccion latitud");
                int lat = sc.nextInt();
                System.out.println("Direccion longitud");
                int lon = sc.nextInt();
                this.traza.add( new Retail(nom, descripcion, lat, lon));
                boolean a = true;
                System.out.println("Añada la materia prima");
                
    }

    @Override
    public void showTraza() {
        System.out.println("");
        System.out.println("");
        System.out.println(this.nombre);
        System.out.println("Su materia prima es ");
        for (int i = 0; i < this.matPrima.size(); i++) {
            
            this.matPrima.get(i).showTraza();
        }
        for (int i = 0; i < this.traza.size(); i++) {
            if(this.traza.get(i) instanceof Farmer){
                System.out.println("Granja");
            }
            if(this.traza.get(i) instanceof Manufacturer){
                System.out.println("");
                System.out.println("");
                System.out.println("Manofacturado en");
            }   
            if(this.traza.get(i) instanceof DistributionCenter){
                System.out.println("Distribuido desde ");
            }
            if(this.traza.get(i) instanceof Retail){
                System.out.println("Vendido en ");
            }
            
                this.traza.get(i).darInformacion();
            } //To change body of generated methods, choose Tools | Templates.
    }
}
