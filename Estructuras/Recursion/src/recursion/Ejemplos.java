/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author hca
 */
public class Ejemplos {
    
    public static double calcPot(double base, int expo){
        if(expo == 0)
            return 1;
        else
            return base * calcPot(base, expo-1);
    }
    
    public static void main(String[] args) {
        int arre[] = {2,9,1,0};
        int tam = arre.length;
        
        System.out.println(calcPot(8,2));
    }
    
}
