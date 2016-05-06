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
public class ArrayPersona {
    
    ArrayList<Persona>arrayP;
       
       public ArrayPersona(){
           arrayP=new ArrayList<Persona>();
       }
       
       public String agregarPersona(Persona persona) throws IdException {

        if (verificarId(persona.getId())) 
            throw new IdException(
                    "Ya existe un apis con ese numero de codigo",
                    false);
        
        arrayP.add(persona);
        return "Se agrego con exito";
    }

       
       public Persona buscarPersona(String Id) {

       Persona dev = null;
        if (arrayP.size() != 0) {

            for (Persona persona:arrayP) {
                if (persona.getId().equalsIgnoreCase(Id)) {

                    dev =persona;
                    break;

                }
            }

        }
        return dev;
    }
       
        public boolean verificarId(String Id) {

        boolean dev = false;
        if (arrayP.size() != 0) {

            for (int i = 0; i < arrayP.size(); i++) {
                if (arrayP.get(i).getId().equalsIgnoreCase(Id)) {

                    dev = true;

                    break;

                }
            }

        }
        return dev;
    }
        
        public int tamano(){
            return arrayP.size();
        }
}
