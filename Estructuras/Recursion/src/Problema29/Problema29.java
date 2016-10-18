/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema29;

/**
 *
 * @author José Sánchez
 */
public class Problema29 {
    
    public static String impArreDI(int arre[], int tam){
        if(tam == 0)
            return "";
        else
            return arre[tam-1] + impArreDI(arre, tam-1);
    }
    
    public static String impArreID(int arre[], int tam){
        if(tam == 0)
            return "";
        else
            return impArreID(arre, tam-1) + arre[tam-1];
    }
    
    public static void main(String[] args) {
        int arre[] = {2,9,1,0};
        int tam = arre.length;
     
        System.out.println(impArreID(arre, tam));
        
        System.out.println(impArreDI(arre, tam));
    }
}
