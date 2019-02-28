/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonoquiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;

/**
 *
 * @author Andres
 */
public class Bonoquiz {

    /**
     * @paraym args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File objetos = new File("prod.txt");
        FileInputStream entrada =null;
        FileOutputStream salida =null;
        ObjectInputStream reader = null;
        ObjectOutputStream writer =null;
        Auditor au = new Auditor();
        Scanner sc = new Scanner(System.in);
        //au.prod.add(new MatPrima("Harina"));
       try {System.out.println("Cargando");
            entrada =new FileInputStream(objetos);
            reader = new ObjectInputStream(entrada);
            
            au = (Auditor) reader.readObject();
            
            //UN.listSedes();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(true){
            System.out.println("");
            System.out.println("");
            System.out.println("Bienvenido");
            System.out.println("1 Añadir materia prima");
            System.out.println("2 Añadir producto");
            System.out.println("3 Eliminar producto o materia prima");
            System.out.println("4 Traza de producto");
            System.out.println("5 Traza de todos los productos");
            System.out.println("6 Salir");
            int a = sc.nextInt();
        switch(a){
            case 1:System.out.println("Nombre de la materia prima");
                String nom = sc.nextLine();
                MatPrima aux = new  MatPrima(nom);
                au.prod.add(aux);break;
            case 2: System.out.println("Producto manofacturado");
                System.out.println("Ingrese el nombre del producto");    
             String nom1 = sc.nextLine();
             nom1 = sc.nextLine();
                au.prod.add(new Manofacturado(nom1));break;
            case 3: for (int i = 0; i < au.prod.size(); i++) {
                    System.out.println(i+" "+ au.prod.get(i).getNombre());
                }System.out.println("Introduzca el numero del Producto que desea eliminar");
                au.prod.remove(sc.nextInt());break;
            case 4: System.out.println("De que porducto quiere conocer su traza");
                for (int i = 0; i < au.prod.size(); i++) {
                    System.out.println(i+" "+au.prod.get(i).getNombre());
                }au.prod.get(sc.nextInt()).showTraza();break;
            case 5: for (int i = 0; i < au.prod.size(); i++) {
                    au.prod.get(i).showTraza();
                }break;
 
            case 6: System.exit(0);break;
              
                
        }
      try {
          System.out.println("Guardando");
            salida =new FileOutputStream(objetos);
            writer =new ObjectOutputStream(salida);
            writer.writeObject(au);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            System.err.println("Null pointer");
        }  
    }
    
        
    }
    
}
