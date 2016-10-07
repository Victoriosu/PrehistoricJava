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
public class Computador {
    private String nombre, tarjeta;
    private int memoria;

    public Computador(String nombre, String tarjeta, int memoria) 
   {
   setNombre(nombre);
   setTarjeta(tarjeta);
   setMemoria(memoria);
   }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        if (tarjeta.length()>=2) {
        this.tarjeta = tarjeta;
        } else {
            System.out.println("Tarjeta debe contener mínimo 2 caracteres de largo");
        }
    }

    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        if (memoria>0) {
        this.memoria = memoria;
        } else {
            System.out.println("Memoria debe ser mayor a 0");
        }
    }
    
    
}
