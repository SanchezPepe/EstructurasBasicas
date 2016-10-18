/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptospoo;

/**
 * <pre>
 * Definición de la clase cuadrado. Cada cuadrado se 
 * se caracteriza por tener un lado
 * </pre>
 * @author Jose
 * @version 1.0
 */
public class Cuadrado {
    
    private double lado1;
    
    /**
     * Constructor por omisión
     */
    public Cuadrado() {
    }

    /**
     * Constructor con parámetro
     * @param lado1: double - Se usa para inicializar el lado
     */
    public Cuadrado(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public String toString() {
        return "Cuadrado{" + "lado1=" + lado1 + '}';
    }
    
    /**
     * Compara si dos cuadrados son iguales comparando sus lados
     * @param otro: Object. Se espera que llegue un cuadrado
     * @return 
     */
    
    public boolean equals(Object otro){
        Cuadrado c = (Cuadrado) otro;
        return lado1 == c.lado1;
    }

    /**
     * Calcula y regresa el area del cuadrado
     * @return double (área)
     */
    public double calculaArea(){
         double res = this.lado1 * this.lado1;
         return res;
    }
    
    /**
     * Calcula y regresa el perímetro del cuadrado
     * @return double (perímetro)
     */
    public double calculaPerimetro(){
         double res = this.lado1 * 4;
         return res;
    }
    
}
