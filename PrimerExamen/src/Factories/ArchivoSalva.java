/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Modelo.Pais;
import Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author Che
 */
public interface ArchivoSalva {
    void guardarPersonas( ArrayList<Persona>persona);
    ArrayList<Persona> obtenerPersona();
    void guardarPais( ArrayList<Pais>pais);
    ArrayList<Pais> obtenerPais();
}

