/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CETECOM
 */
public class RegistrarPedido {
    static int i=0;
    static String[] fondo, entrada, ensalada, postre, bebestible;
    

    //crear colección
    public RegistrarPedido() {
        fondo=new String[20];
        ensalada=new String[20];
        postre=new String[20];
        entrada=new String[20];
        bebestible=new String[20];
    }

    public void agregarPedidoFondo() {
        
      
         if (Menu.jComboBox1.getSelectedItem().equals("Seleccione un Plato de Fondo")){
                JOptionPane.showMessageDialog(null,"No has seleccionado un plato de fondo","ADVERTENCIA", 0);
            }else{
            fondo[i]=(Menu.jComboBox1.getSelectedItem().toString());
            i++;
            };
   
    }
    
    
    public void agregarPedidoEntrada() {
            if (Menu.jComboBox2.getSelectedItem().equals("Seleccione una Entrada")){
                JOptionPane.showMessageDialog(null,"No has seleccionado una entrada","ADVERTENCIA", 0);
            }else{
            entrada[i]=(Menu.jComboBox2.getSelectedItem().toString());
            }
    }
    
    public void agregarPedidoEnsalada() {
            if (Menu.jComboBox4.getSelectedItem().equals("Seleccione una Ensalada")){
                JOptionPane.showMessageDialog(null,"No has seleccionado una ensalada","ADVERTENCIA", 0);
            }else{
            ensalada[i]=(Menu.jComboBox4.getSelectedItem().toString());
            }
    }
    
    public void agregarPedidoPostre() {
            if (Menu.jComboBox3.getSelectedItem().equals("Seleccione un Postre")){
                JOptionPane.showMessageDialog(null,"No has seleccionado un postre","ADVERTENCIA", 0);
            }else{
            postre[i]=(Menu.jComboBox3.getSelectedItem().toString());
            }
    }
    
    public void agregarPedidoBebestible() {
            if (Menu.jComboBox5.getSelectedItem().equals("Seleccione el Bebestible")){
                JOptionPane.showMessageDialog(null,"No has seleccionado un bebestible","ADVERTENCIA", 0);
            }else{
            bebestible[i]=(Menu.jComboBox5.getSelectedItem().toString());
            }
    }

    
    public static String listar() {
        String a="";
        for (int i=0;i<fondo.length;i++) {
            a = "---------MENU Nª" + (i+1) + "---------" + System.lineSeparator() + "El Plato de fondo sleccionado es: " + fondo[i] + System.lineSeparator()+"La entrada seleccionada es: " + entrada+System.lineSeparator()+"La ensalada seleccionada es: " + ensalada+System.lineSeparator()+"El postre seleccionado es: " + postre+System.lineSeparator()+"El bebestible seleccionado es: " + bebestible+System.lineSeparator();
            
        }
        return a;
    }
    //eliminar documentos por código
 //   public static boolean eliminarPedido(int codigo) {
  //      boolean valida = false;
  //      for (int i = 0; i < documentos.size(); i++) {
  //          if (documentos.get(i).getCodigo() == codigo) {
  //              documentos.remove(i);
  //              valida = true;
  //              break;
   //         }            
   //     }   
   //     return valida;
   // }
    
}
