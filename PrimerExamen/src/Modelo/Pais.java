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
public class Pais {
    
    String nombre,codigo,cantidadLimitada;

    public Pais(String nombre, String codigo, String cantidadLimitada) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadLimitada = cantidadLimitada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCantidadLimitada(String cantidadLimitada) {
        this.cantidadLimitada = cantidadLimitada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCantidadLimitada() {
        return cantidadLimitada;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", codigo=" + codigo + ", cantidadLimitada=" + cantidadLimitada + '}';
    }
    
}
