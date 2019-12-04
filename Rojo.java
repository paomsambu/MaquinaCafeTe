/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafete;

/**
 *
 * @author paola
 */
public class Rojo extends MaquinaTe {
    
      @Override
    public String getDescripcion() {
        return "Rojo";//Retorno la descripción
    }

    @Override
    public double getPrecio() {
        return 70; //Retorno el precio del te rojo
    }
}
