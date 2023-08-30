/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASES;

/**
 *
 * @author Ramon
 */
public class AparatoAdultos extends Aparato{
    
    private final double tiempoDuracion;
    private final int indicePeligrosidad;

    public AparatoAdultos(String nombre, int capacidad, boolean enPareja, double tiempoDuracion, int indicePeligrosidad) {
       super(nombre, capacidad, enPareja);
        this.tiempoDuracion = tiempoDuracion;
        this.indicePeligrosidad = indicePeligrosidad;
    }

    public int getIndicePeligrosidad() {
        return indicePeligrosidad;
    }

    public double getTiempoDuracion() {
        return tiempoDuracion;
    }

    
    public double PrecioTicket() {
        
        return tiempoDuracion*0.5+indicePeligrosidad/5;
        
        
    }
    public String toString(){
        return "Nombre:"+nombre + "Capacidad:" + capacidad +"EnPareja:"+enPareja
                +"Duracion:" + tiempoDuracion +"Indice de Peligrocidada:" + indicePeligrosidad;
    }
    
    

    
    
    

}
