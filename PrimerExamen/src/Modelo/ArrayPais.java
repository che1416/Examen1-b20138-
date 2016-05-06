/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Che
 */
public class ArrayPais {
    
       ArrayList<Pais>arrayPais;
       
       public ArrayPais(){
           arrayPais=new ArrayList<Pais>();
       }
       
       public void agregarPais(Pais pais){
           arrayPais.add(pais);
       }
       
       
}
