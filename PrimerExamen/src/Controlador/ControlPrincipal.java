/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.ConfigManager;
/**
 *
 * @author Che
 */
public class ControlPrincipal {
    
    ConfigManager  configManager;
     public void guardar_en_disco(){
        guardar_en_archivo(this.configManager.getProperty("formato"));
    }
    private void guardar_en_archivo(String formato){
       
        SalvadorArchivos salvador=getSalvador(formato);
       salvador.guardarReservaciones();
    }
     private void cargar_de_disco(){
         SalvadorFactory factory = new SalvadorFactory();
        String formato = configManager.getProperty("formato");
        SalvadorArchivos salvador = factory.getSalvador(formato);
        if(salvador!= null){
          
           reserva.setArrayR(salvador.obtenerReserva());
            
        }else{
           configManager.setProperty("formato","XmL");
        }
    }
}
