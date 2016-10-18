/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8;

/**
 *
 * @author hca
 */
public class Circulo implements Figura{
    
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    //Métodos que obligan la implementación de la interfaz
    public double calArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double calPerim(){
        return Math.PI * 2 * radio;
    }
}
