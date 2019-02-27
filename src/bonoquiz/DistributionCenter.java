/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonoquiz;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class DistributionCenter extends Eslabon implements Serializable{
    
    public DistributionCenter(String nom, String descripcion, int latitud, int longitud) {
        super(nom, descripcion, latitud, longitud);
    }
    
}
