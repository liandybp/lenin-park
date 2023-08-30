/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASES;

/**
 *
 * @author Ramon
 */
public abstract class Aparato {
    
    protected String nombre;
    protected int capacidad;
    protected boolean enPareja;

    public Aparato(String nombre, int capacidad, boolean enPareja) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.enPareja = enPareja;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isEnPareja() {
        return enPareja;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract double PrecioTicket();
    @Override
    public abstract String toString();
    

}
