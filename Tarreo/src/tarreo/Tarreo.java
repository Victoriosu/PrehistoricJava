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
public class Tarreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Duoc duoc1 = new Duoc(20);
        
        Persona persona1, persona2, persona3, persona4;
        Computador comp1, comp2, comp3, comp4;
        
        comp1 = new Computador("LAbESTIA", "ASDAS", 2000);
        persona1 = new Persona ("11111111-1", "Carlos", 20, 'M', false, comp1);
        
        comp2 = new Computador("LAsbESTIAs", "ASDASasdasd", 3000);
        persona2 = new Persona ("22222222-2", "Pedro", 18, 'F', true, comp2);
        
        comp3 = new Computador("LaMaquina", "lnmlnmlnm", 4000);
        persona3 = new Persona ("33333333-3", "Luis", 29, 'M', true, comp3);
        
        comp4 = new Computador("ElMostro", "gffgfg", 5000);
        persona4 = new Persona ("44444444-4", "Juan", 27, 'F', false, comp4);
        
        duoc1.agregarPersona(persona1);
        duoc1.agregarPersona(persona2);
        duoc1.agregarPersona(persona3);
        duoc1.agregarPersona(persona4);
        
        duoc1.listarPersonas();
        
        
    }
    
}
