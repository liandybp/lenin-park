/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASES;

/**
 *
 * @author Ramon
 */
public class Parque {
    
    //ATRIBUTOS DEL PARQUE DEFINIDOS POR LA RELACIÓN EN EL
    //UML ENTRE LAS CLASES PARQUE Y APARATO
    private final Aparato[] equipos;
    private int cantEquipos;

    
    //CONSTRUCTOR DE LA CLASE PARQUE
    public Parque() {
        
        equipos= new Aparato[20];
        cantEquipos=0;
        
    }

    
    //RETORNA LA CANTIDAD DE EQUIPOS EN EL ARREGLO
    public int getCantEquipos() {
        return cantEquipos;
    }

    //RETORNA EL ARREGLO CON TODOS LOS EQUIPOS DEL PARQUE
    public Aparato[] getEquipos() {
        return equipos;
    }   
    
    //MÉTODO ADICIONAR
    public void AdicionarAparato(Aparato a){
        
        if(cantEquipos<20)
            equipos[cantEquipos++]=a;
    
    }
    
    //DETERMINAR EL TOTAL DE DINERO RECAUDADO POR EL PARQUE COMPLETANDO TODA 
    //SU CAPACIDAD
    public double TotalDineroRecaudado(){        
        double suma=0;
        for(int i=0;i<cantEquipos;i++)
            suma+=equipos[i].PrecioTicket();
        
        return suma;
    }
    
    //CONOCER LA CANTIDAD DE APARATOS PARA ADULTOS DE CATEGORIA ALTA
    //QUE ADEMAS POSEEN UN TIEMPO DE DURACION SUPERIOR A UN VALOR DADO    
    public int CantidadAparatosAdultosAlta(double tiempo){
        
        int c=0;
        for(int i=0;i<cantEquipos;i++)
            if(equipos[i] instanceof AparatoAdultos)
                if(((AparatoAdultos) equipos[i]).getIndicePeligrosidad()>6 && 
                ((AparatoAdultos) equipos[i]).getIndicePeligrosidad()<=10 && 
                ((AparatoAdultos) equipos[i]).getTiempoDuracion()>tiempo)
                    c++;
        
        return c;
    
    }
    
    
    //DETERMINAR LA CATEGORIA QUE MAS PREDOMINA ENTRE LOS APARATOS 
    //PARA ADULTOS DEL PARQUE    
    public String CategoriaMasPredomina(){
        
        int cb=0,cm=0,ca=0;
        for(int i=0;i<cantEquipos;i++)
            if(equipos[i] instanceof AparatoAdultos)
                if(((AparatoAdultos) equipos[i]).getIndicePeligrosidad()<=3)
                    cb++;
                else
                    if(((AparatoAdultos) equipos[i]).getIndicePeligrosidad()>3 && 
                    (((AparatoAdultos) equipos[i]).getIndicePeligrosidad()<=6))
                        cm++;
                    else
                         if(((AparatoAdultos) equipos[i]).getIndicePeligrosidad()>6 && 
                    (((AparatoAdultos) equipos[i]).getIndicePeligrosidad()<=10))
                        
                        ca++;
                         else
                             cb+=0;
        
        if(cb>cm && cb>ca)
            return "BAJA";
        else
            if(cm>cb && cm>ca)
                return "MEDIA";
            else
                if(ca>cm && ca>cb)
                return "ALTA";    
                else
                    return "Ninguna";
        
    }
    
    //NOMBRES DE LAS CANCIONES DE APARATOS DE NIÑOS PRESENTES EN EL PARQUE
    //ORDENADOS DESCENDENTEMENTE POR EL PRECIO DEL TICKET
    public String[] ListadoDeCanciones(){
        
        AparatoNinos [] apa= new AparatoNinos[cantEquipos];
        int capa=0;
        
        for(int i=0;i<cantEquipos;i++)
            if(equipos[i] instanceof AparatoNinos)
                apa[capa++]=(AparatoNinos) equipos[i];
        
        AparatoNinos temp=null;
        for(int i=0;i<capa;i++){
            for(int j=0;j<capa-1;j++){
                if(apa[j].PrecioTicket()<apa[j+1].PrecioTicket())
                    {temp=apa[j];
                     apa[j]=apa[j+1];
                     apa[j+1]=temp; }
                }
        }
        
        String [] listado= new String[capa];
        for(int i=0;i<capa;i++)
            listado[i]=apa[i].getNombreCancion();
        
        return listado;
                
    }
    
    
    
    
    
    
    
    
    
    
    

}
