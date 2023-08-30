/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASES;

/**
 *
 * @author Ramon
 */
public class AparatoNinos extends Aparato{
    
    private final String nombreCancion;
    private final boolean tienePremio;
    private final int edadMinima;

    public AparatoNinos(String nombre, int capacidad, boolean enPareja, String nombreCancion, boolean tienePremio, int edadMinima) {
       super(nombre, capacidad, enPareja);
        this.nombreCancion = nombreCancion;
        this.tienePremio = tienePremio;
        this.edadMinima = edadMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public boolean isTienePremio() {
        return tienePremio;
    }
    
    public double PrecioTicket() {
        int p=0;
        if(tienePremio)
            p=1;
        return edadMinima/3+p*5;
        
    }
     public String toString(){
        return "Nombre:"+nombre + "Capacidad:" + capacidad +"EnPareja:"+enPareja
                +"Edad Minima:" + edadMinima +"TienePremio:" + tienePremio
                + "nombre de la cancion"+nombreCancion ;
    }
    
    
    
    
    
    

}
