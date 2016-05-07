/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Factories.ArchivoSalva;
import Modelo.ArrayPais;
import Modelo.ArrayPersona;
import Modelo.ConfigManager;
import Modelo.Pais;
import Modelo.Persona;
import Vista.CrearPais;
import Vista.GuardarPersona;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Che
 */
public class ControlPrincipal implements ActionListener{
   
      ConfigManager configManager;
      ArrayPais arrayPais;
      ArrayPersona arrayP;
      ArchivoSalva salva;
      Persona persona;
      Pais pais;
      Random r;
      GuardarPersona guardar;
    Principal principal;
      Hashtable tab=new Hashtable();
          
       public ControlPrincipal(){
       configManager=ConfigManager.getInstance();
        configManager.load_config();
        cargar_de_disco();
       }    
       
         private void cargar_de_disco(){
         
           arrayP.setArrayP(salva.obtenerPersona());
            arrayPais.setArrayPais(salva.obtenerPais());
       
         }
       public void actionPerformed (ActionEvent e){
           if(e.getActionCommand().equals("Salir")){
               guardar_en_disco();
               System.exit(0);
           }
           if(e.getActionCommand().equals("Guardar Persona")){
               GuardarPersona persona=new GuardarPersona();
               persona.show();
           }
           if(e.getActionCommand().equals("Crear Pais")){
               CrearPais pais=new CrearPais();
               pais.show();
           }
           if(e.getActionCommand().equals("Xml")){
               guardar_en_disco();
           }
           if(e.getActionCommand().equals("Generador")){
               int contador=0;
            
               int num;
             
              
               pais=new Pais(pais.getNombre(),pais.getCodigo(),pais.getCantidadLimitada(),pais.getRefugiados());
                 persona=new Persona(persona.getProcedencia(),persona.getId(),persona.getDiasEstadia());
                 for(int i=0;i<arrayPais.tamano();i++){
                     
                     for(int j=0;j<arrayP.tamano();j++){
                          tab.put(pais,persona);
                     }
                 }
              
                 num=r.nextInt(arrayP.tamano());
                
                 for(int x=0;x<principal.ObtenerInter();x++){
                     if(pais.cantidadMaxima()==0){
                         JOptionPane.showMessageDialog(null,"Se han agotado los ingresos");
                      }
                       tab.containsKey(num);
                     contador++;
                  }
                  principal.setMensage(tab.get(num));
                  principal.setContador(contador);
              }
           if(e.getActionCommand().equals("Buscar")){
               tab.containsKey(principal.ObtenerId());
               JOptionPane.showMessageDialog(null," La informacion es"+tab.get(principal.ObtenerId()));
           }
       }
       
       public void guardar_en_disco(){
        guardar_en_archivo();
        }
    private void guardar_en_archivo(){
      salva.guardarPersonas(arrayP.getArrayP());
      salva.guardarPais(arrayPais.getArrayPais());
    }

}
