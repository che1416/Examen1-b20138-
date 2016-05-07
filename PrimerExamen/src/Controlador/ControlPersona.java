/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArrayPersona;
import Modelo.IdException;
import Modelo.Persona;
import Vista.GuardarPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Che
 */
public class ControlPersona implements ActionListener{
    ArrayPersona arrayP;
    GuardarPersona guardar;
    Persona persona;
    public ControlPersona(ArrayPersona array,GuardarPersona persona){
        arrayP=array;
        guardar=persona;
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Agregar")){
            if(guardar.obtenerProcedencia().equals("")||guardar.obtenerId().equals("")||guardar.obtenerDias().equals("")){
                guardar.setMensaje("deben estar todos los campos llenos");
            }else{
                persona=new Persona(guardar.asignarProcedencia(),guardar.obtenerId(),guardar.obtenerDias());
                try {
                    arrayP.agregarPersona(persona);
                } catch (IdException ex) {
                    Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
