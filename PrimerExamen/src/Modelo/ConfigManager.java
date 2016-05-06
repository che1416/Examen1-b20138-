/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Che
 */
import Utilidades.Ayudante;
import com.sun.media.jfxmedia.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;


/**
 *
 * @author Che
 */
public class ConfigManager {
    
    private static ConfigManager cm=new ConfigManager();//instanceo a ella misma
    
    private Properties props;
    private Ayudante ayudante;
    private ConfigManager(){
        props=new Properties();
        ayudante=new Ayudante();
    }
    
    public static ConfigManager getInstance(){
        return cm;
    }

  public String getProperty(String key){
      return props.getProperty(key,"");
  }
  public void setProperty(String key,String value){
      props.getProperty(key, value);
  }
  private String get_config_file() throws IOException{//me devuelve el archivo de config
      return ayudante.get_config_file("config.properties");
  }
  
  public void load_config() {
      File configFile;
      
      try{
          configFile=new File(this.get_config_file());
          InputStream inputStream=new FileInputStream(configFile);
          props.load(inputStream);
          inputStream.close();
      }catch(Exception ex){
           java.util.logging.Logger.getLogger(ConfigManager.class.getName()).log(Level.SEVERE, null, ex);//OJO
      }
  }//fin
  
  public void save_config() {
      File configFile=null;
      FileWriter writer=null;
      
      try{
          writer=new FileWriter(this.get_config_file());
          props.store(writer, "leearchivos settings");
      }catch(Exception ex){
           java.util.logging.Logger.getLogger(ConfigManager.class.getName()).log(Level.SEVERE, null, ex);
      }finally{
          try{
              if(writer!=null){
                  writer.close();
              }
          }catch(Exception ex){
              java.util.logging.Logger.getLogger(ConfigManager.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
  }
  
    
    
}