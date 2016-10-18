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
public class DeVolteo extends Camion{
    
    private double capTon;

    public DeVolteo(double capTon) {
        this.capTon = capTon;
    }

    public DeVolteo(double capTon, String marca, String numMotor, String placas) {
        super(marca, numMotor, placas);
        this.capTon = capTon;
    }
    
    public String toString(){
        return super.toString() + ", Capacidad en toneladas: " + this.capTon;
    }
    
}
