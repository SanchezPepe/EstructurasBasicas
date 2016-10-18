/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8;

import static java.lang.Math.*;

/**
 *
 * @author hca
 */
public class Triangulo implements Figura {
    
    private double lado1, lado2, lado3;
    
    public Triangulo(){
        
    }
    
    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double calPerim(){
        return lado1 + lado2 + lado3;
    }
    
    //Fórmula de Herón
    public double calArea(){
        double sp = calPerim()/2;
        return sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
    
}
