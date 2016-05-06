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
import com.sun.istack.internal.logging.Logger;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

/**
 *
 * @author Che
 */
public class Escritor {
    
    FileWriter writer;
    
    private void writer_with_throws(String Filepath,String texto) throws IOException{
        File file=new File(Filepath);
        if(!file.exists()){
            file.createNewFile();
        }
        writer=new FileWriter(file);
        writer.write(texto);
        writer.flush();
    }
    public void writer_file(String Filepath,String texto){
        
        try{
            this.writer_with_throws(Filepath, texto);
        }catch(IOException ex){
           java.util.logging.Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void with_obj_fileXml(String Filepath,Object obj) {
        XMLEncoder e;
        try{
            e=new XMLEncoder( new BufferedOutputStream(new FileOutputStream(Filepath)));
        }catch(FileNotFoundException ex){
             java.util.logging.Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//fin clase

