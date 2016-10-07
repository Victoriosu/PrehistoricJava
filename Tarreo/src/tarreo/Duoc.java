/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarreo;

/**
 *
 * @author CETECOM
 */
public class Duoc {
    private int cantidadP=0, capMax;
    private Persona[] participantes;
    
    public Duoc(int capMax) {
        participantes=new Persona[capMax];
        setCapMax(capMax);
    }
    
    
    
    public boolean buscarPersona(String rutB) {
        boolean match=false;
        for (Persona temporal : participantes) {
            if (temporal.getRut().equals(rutB)){
            match=true;
            break;
            }
        }
            
        return match;
    }
    
    public void obtenerNovatosHombres(){
        boolean hay=false;
    for (Persona temporal : participantes)
         if ((temporal.isExperiencia()==false) && (temporal.getSexo()=='M')){
             System.out.println(temporal);
             hay=true;
         } if (hay==false) {
             System.out.println("No existen novatos hombres en el arreglo");
         } 
    } 
    
    public void listarPersonas(){
        
        int i=0;
        for(Persona temporal : participantes){
            
          i=i+1;
          System.out.println("Participante N°"+i);
          System.out.println("Participante: "+temporal.getUsername());
          System.out.println("Nombre computador: "+temporal.getComputador().getNombre());                
          System.out.println("Edad : "+temporal.getEdad());
          System.out.println("----------------------------------------");
          
         if (i>=cantidadP) {
             break;
         }
        }
  
    }
    
    public void agregarPersona(Persona persona)
    {
       if (cantidadP<capMax) {
           participantes[cantidadP]=persona;
           cantidadP=cantidadP+1;
       } else {
           System.out.println("No hay capacidad");
       }
            
        
    }
    
    
    /**
     * @return the cantidadP
     */
    public int getCantidadP() {
        return cantidadP;
    }

    /**
     * @return the capMax
     */
    public int getCapMax() {
        return capMax;
    }

    /**
     * @return the participantes
     */
    public Persona[] getParticipantes() {
        return participantes;
    }

    /**
     * @param cantidadP the cantidadP to set
     */
    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    /**
     * @param capMax the capMax to set
     */
    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    /**
     * @param participantes the participantes to set
     */
    public void setParticipantes(Persona[] participantes) {
        this.participantes = participantes;
    }
    
    
}
