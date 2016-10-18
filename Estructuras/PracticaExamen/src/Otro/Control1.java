/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otro;

/**
 *
 * @author José Sánchez
 */
public class Control1 {
    
    public static void prueba(Rectangulo r){
        Rectangulo r1 = new Rectangulo(2,2);
        r = r1;
    }
    
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(6,6);
        System.out.println("Primera impresión - Lado 1: " + r.getL1() + " - Lado 2: " + r.getL2());
        prueba(r);
        System.out.println("Primera impresión - Lado 1: " + r.getL1() + " - Lado 2: " + r.getL2());
        
    }
    
}
