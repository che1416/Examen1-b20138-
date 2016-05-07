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
public class VerficacionProcedencia {
  private final static String ciudadanoPattern = "[Ci]\\d{1}"; 
   private final static String indigenaPattern = "[Ind]\\d{2}"; 
    private final static String migrantePattern = "[Mi]\\d{3}";  
     private final static String refugiadoPattern = "[Re]\\d{4}"; 
    public boolean validaCiudadano(String ciudadano){
        Pattern pat = Pattern.compile(ciudadanoPattern, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(ciudadano);
        return mat.find();
    }
     public boolean validaIndigena(String indigena){
        Pattern pat = Pattern.compile(indigenaPattern, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(indigena);
        return mat.find();
    }
      public boolean validaMigrante(String migrante){
        Pattern pat = Pattern.compile(migrantePattern, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(migrante);
        return mat.find();
    }
       public boolean validaRefugiado(String refugiado){
        Pattern pat = Pattern.compile(refugiadoPattern, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(refugiado);
        return mat.find();
    }
    
   
}