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
public class Auditor implements Serializable{
    public ArrayList<Producto> prod;

    public Auditor() {
        this.prod = new ArrayList<>();
    }

}
