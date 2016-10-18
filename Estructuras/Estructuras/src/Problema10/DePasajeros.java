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
public class DePasajeros extends Camion{
    
    private int totalP;
    
    public DePasajeros(){
        super();
    }
    
    public DePasajeros(String marca, String numMotor, String placas, int totalPas){
        super(marca, numMotor, placas);
        this.totalP = totalPas;
    }
    
    public String toString(){
        return super.toString() + ", Capacidad: " + this.totalP;
    }
}
