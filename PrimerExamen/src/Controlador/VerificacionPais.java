/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Che
 */
public class VerificacionPais {
  private final static String codigoPattern = "[P]\\d{4}"; 
    
    public boolean validaCodigo(String codigoP){
        Pattern pat = Pattern.compile(codigoPattern, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(codigoP);
        return mat.find();
    }
    
   
}
