/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Che
 */
public class Ayudante {
 
    public Path get_Config_dir() throws IOException{
        Path path=FileSystems.getDefault().getPath(System.getProperty("user.home",".leeArchivos"));
        if(!Files.isDirectory(path)){
            Files.createDirectories(path);
        }
        return path;
    }
    public Path get_Path_config_file(String name) throws IOException{
        Path path=this.get_Config_dir();
        path=path.getFileSystem().getPath(path.toString(), name);
        return path;
    }
    public String get_config_file(String name) throws IOException{
        return this.get_Path_config_file(name).toString();
    }
}