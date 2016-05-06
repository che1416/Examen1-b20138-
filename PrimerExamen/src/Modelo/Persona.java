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
public class Persona {
     String procedencia,Id,diasEstadia;

    public Persona(String procedencia, String Id, String diasEstadia) {
        this.procedencia = procedencia;
        this.Id = Id;
        this.diasEstadia = diasEstadia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setDiasEstadia(String diasEstadia) {
        this.diasEstadia = diasEstadia;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public String getId() {
        return Id;
    }

    public String getDiasEstadia() {
        return diasEstadia;
    }
    
}
