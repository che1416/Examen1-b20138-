/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArrayPais;
import Modelo.Pais;
import Modelo.PaisException;
import Vista.CrearPais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Che
 */
public class ControlPais implements ActionListener {
    ArrayPais arrayPais;
    CrearPais crear;
    Pais pais;
    public ControlPais(ArrayPais pais,CrearPais mCrear){
        arrayPais=pais;
        crear=mCrear;
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Guardar")){
                         
             if(crear.verificarCodigo()){
                 if(crear.obtenerNombre().equals("")||crear.obtenerCodigo().equals("")||crear.obtenerCapacidad()==0||crear.obtenerR()==0){
                     crear.setMensaje("debe llenar todos los campos");
                 }else{
                     pais=new Pais(crear.obtenerNombre(),crear.obtenerCodigo(),crear.obtenerCapacidad(),crear.obtenerR());
                     try {
                         arrayPais.agregarPais(pais);
                     } catch (PaisException ex) {
                         Logger.getLogger(ControlPais.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     crear.setMensaje("Guardado");
                 }
             }
                
            }//fn 
            
            
        }//action
    
    
}
