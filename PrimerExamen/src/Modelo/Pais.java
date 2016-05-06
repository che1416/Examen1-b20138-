/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Che
 */
public class Pais {
    
    String nombre,codigo;
    int cantidadLimitada,refugiados;

    public Pais(String nombre, String codigo, int cantidadLimitada, int refugiados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadLimitada = cantidadLimitada;
        this.refugiados = refugiados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidadLimitada() {
        return cantidadLimitada;
    }

    public int getRefugiados() {
        return refugiados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCantidadLimitada(int cantidadLimitada) {
        this.cantidadLimitada = cantidadLimitada;
    }

    public void setRefugiados(int refugiados) {
        this.refugiados = refugiados;
    }
    
    
    public int cantidadMaxima(){
        
       
        if(cantidadLimitada==0){
            JOptionPane.showMessageDialog(null,"no es posible");
        }else{
             cantidadLimitada--;
        }
        return cantidadLimitada;
    }
   
    public int cantidadRefugiado(){
        if((cantidadLimitada==0)&& (refugiados==0)){
           JOptionPane.showMessageDialog(null," No es posible,ya no existe campo");
         }else{
              refugiados--;
        }
        return refugiados;
    }
    
}
