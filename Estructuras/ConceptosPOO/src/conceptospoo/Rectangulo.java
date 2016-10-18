/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptospoo;

public class Rectangulo {
    private double lado1, lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangulo other = (Rectangulo) obj;
        if (Double.doubleToLongBits(this.lado1) != Double.doubleToLongBits(other.lado1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lado2) != Double.doubleToLongBits(other.lado2)) {
            return false;
        }
        return true;
    }
    
    public double calculaArea (){
        double area = this.lado1 * this.lado2;
        return area;
    }
    
    public double calculaPerimetro(){
        double perimetro = this.lado1*2 + this.lado2*2;
        return perimetro;
    }
    
    public static void main(String[] args) {
        
        Rectangulo r = new Rectangulo(4,6);
        
        System.out.print("Area: " + r.calculaArea());
    }
}