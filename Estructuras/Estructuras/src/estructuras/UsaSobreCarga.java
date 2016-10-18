/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author jsanchezagu
 */
public class UsaSobreCarga {
    
    public static int suma1(int n1, int n2) { 
        return n1 + n2;
    }
    
    public static double suma2(double n1, double n2) {
        return n1 + n2;
    }
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        
        System.out.print("Enteros: " + suma1(3,15));
        System.out.println("\nReales: " + suma2(2.5,7.3));
    }
}
