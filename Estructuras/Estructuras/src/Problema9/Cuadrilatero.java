/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema9;

import Problema8.*;

/**
 *
 * @author hca
 */
public abstract class Cuadrilatero implements Figura{
    
    private double lado1, lado2;
    
    public Cuadrilatero(){    
    }
    
    public Cuadrilatero(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double calArea(){
        return lado1 * lado2;
    }
    
    public double calPerim(){
        return 2 * (lado1 + lado2);
    }
    
    public String toString(){
        return "\nRectangulo de lado: " + super.toString();
    }
}
