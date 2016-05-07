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
       
       public String agregarPais(Pais pais) throws PaisException {

        if (verificarCodigo(pais.getCodigo())) 
            throw new PaisException(
                    "Ya existe un apis con ese numero de codigo",
                    false);
        
        arrayPais.add(pais);
        return "Se agrego con exito";
    }

       
       public Pais buscarPais(String codigo) {

       Pais dev = null;
        if (arrayPais.size() != 0) {

            for (Pais pais:arrayPais) {
                if (pais.getCodigo().equalsIgnoreCase(codigo)) {

                    dev =pais;
                    break;

                }
            }

        }
        return dev;
    }
       
        public boolean verificarCodigo(String codigo) {

        boolean dev = false;
        if (arrayPais.size() != 0) {

            for (int i = 0; i < arrayPais.size(); i++) {
                if (arrayPais.get(i).getCodigo().equalsIgnoreCase(codigo)) {

                    dev = true;

                    break;

                }
            }

        }
        return dev;
    }
        
        public int tamano(){
            return arrayPais.size();
        }

    public ArrayList<Pais> getArrayPais() {
        return arrayPais;
    }

    public void setArrayPais(ArrayList<Pais> arrayPais) {
        this.arrayPais = arrayPais;
    }



}
