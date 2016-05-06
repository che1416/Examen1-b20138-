/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;
import Modelo.ArrayPais;
import Modelo.ArrayPersona;
import Vista.CrearPais;
import javax.swing.JOptionPane;
/**
 *
 * @author Che
 */
public class Generador {
    
      ArrayPais arrayPais;
      ArrayPersona arrayP;
      CrearPais crear;
    int contadorInter=0;
   int numero=0;
    ;
    Random r;
    int num;
   public int metodoRandom(){
       
         
          r=new Random();
          num=r.nextInt(arrayPais.tamano());
          
          for(int i=0;i<arrayPais.tamano();i++){
              if(crear.obtenerCapacidad()==0){
                  
                  for(int j=0;j<arrayP.tamano();j++){
                      if(i==num){
                          arrayPais.get(i).getNombre();
                          arrayP.get(j).getProcedencia();
                          contadorInter++;
                      }
                      
                  }
              }
              else
              {
                  JOptionPane.showMessageDialog(null," no hay capacidad");
              }
          }
          
          
          
          return contadorInter;
    }
       
        
}
