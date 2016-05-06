/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

/**
 *
 * @author Che
 */
import Modelo.Pais;
import Modelo.Persona;
import Utilidades.Ayudante;
import Utilidades.Escritor;
import Utilidades.Lector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Che
 */
public class Xml implements ArchivoSalva {
    
    private Ayudante ayudaos;
    private Escritor escritor;
    
    public Xml()
    {
        ayudaos=new Ayudante();
        escritor=new Escritor();
    }
    
    public void guardarPersonas(ArrayList<Persona>persona){
        
        try{
            escritor.with_obj_fileXml(ayudaos.get_config_file("persona.xml"),persona);
        }catch(IOException ex){
             Logger.getLogger(Xml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Persona> obtenerPersona(){
        Lector<ArrayList<Persona>>lector=new Lector<>();
        String Filepath=null;
        try{
            Filepath=ayudaos.get_config_file("persona.xml");
        }catch(IOException ex){
            Logger.getLogger(Xml.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lector.read_xml(Filepath);
    
    }
    
    
    public void guardarPais(ArrayList<Pais>pais){
        
        try{
            escritor.with_obj_fileXml(ayudaos.get_config_file("pais.xml"),pais);
        }catch(IOException ex){
             Logger.getLogger(Xml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Pais> obtenerPais(){
        Lector<ArrayList<Pais>>lector=new Lector<>();
        String Filepath=null;
        try{
            Filepath=ayudaos.get_config_file("pais.xml");
        }catch(IOException ex){
            Logger.getLogger(Xml.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lector.read_xml(Filepath);
    }
    
    
}