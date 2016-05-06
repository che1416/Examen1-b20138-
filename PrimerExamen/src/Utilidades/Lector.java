/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Che
 */
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Che
 */
public class Lector <T>{
    BufferedReader br;
    
    private String read_file_with_thwros(String Filepath) throws FileNotFoundException, IOException{
        br=new BufferedReader(new FileReader(Filepath));
        StringBuilder sb=new StringBuilder();
        String line=br.readLine();
        while(line!=null){
            sb.append(line);
            sb.append(System.lineSeparator());
            line=br.readLine();
        }
        return br.toString();
    }
    
    public String read_file(String Filepath) throws IOException{
        String devolver=null;
        
        try{
            read_file_with_thwros(Filepath);
        }catch(IOException ex){
             Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                br.close();
            }catch(IOException ex){
                 Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return devolver;
    }
    public T read_xml(String Filepath) {
        XMLDecoder d;
        T objs =null;
        try{
            d=new XMLDecoder(new BufferedInputStream(new FileInputStream(Filepath)));
            objs=(T) d.readObject();
            d.close();
        }catch(FileNotFoundException ex){
             Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objs;
    }
}