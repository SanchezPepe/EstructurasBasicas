/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema10;

/**
 *
 * @author hca
 */
public class Camion {
    
    private String marca, numMotor, placas;
    
    public Camion(){
        
    }
    
    public Camion(String marca, String numMotor, String placas){
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
    }
    
    public String getPlacas(){
        return this.placas;
    }
    
    public String toString(){
        return "Camión: " + this.marca + ", Motor: " + this.numMotor + ", Matriculas: " + this.placas;
    }
    
    public boolean equals(Object c){
        boolean resp = false;
        if(c instanceof Camion){
            ((Camion)c).getPlacas().equalsIgnoreCase(this.placas);
            resp = true;
        }
        return resp;           
    }
}
