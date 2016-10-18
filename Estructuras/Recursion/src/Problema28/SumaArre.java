/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema28;

/**
 *
 * @author José Sánchez
 */
public class SumaArre {
    
    public static int sumaArre(int arre[], int tam){
        if(tam == 0)
            return 0;
        else
            return arre[tam-1] + sumaArre(arre, tam-1); 
    }
    
    public static void main(String[] args) {
        
        int arre[] = {2,9,1,0};
        int tam = arre.length;
        
        System.out.println(sumaArre(arre, tam));
    }
    
}
