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
public class Persona {
   private String rut, username;
   private int edad;
   private char sexo;
   private boolean experiencia;
   private Computador computador;

   public Persona(String rut, String username, int edad, char sexo, boolean experiencia, Computador computador) 
   {
   setRut(rut);
   setUsername(username);
   setEdad(edad);
   setSexo(sexo);
   setExperiencia(experiencia);
   setComputador(computador);
   }
   
    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        if (edad>=18 && edad<30) {
        this.edad = edad;
        } else {
            System.out.println("Edad debe estar entre 18 y 29 años");
        }
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        if (sexo=='M' || sexo=='F') {
        this.sexo = sexo;
        } else {
            System.out.println("Valor ingresado debe ser 'M' o 'F'");
        }
    }

    /**
     * @return the experiencia
     */
    public boolean isExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia the experiencia to set
     */
    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * @return the computador
     */
    public Computador getComputador() {
        return computador;
    }

    /**
     * @param computador the computador to set
     */
    public void setComputador(Computador computador) {
        this.computador = computador;
    }
   
    public void imprimirCaca() {
        System.out.println("Rut: "+rut);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Experiencia: "+experiencia);
        System.out.println("Usernamer: "+username);
        System.out.println("Computador: "+computador);
    }
}
