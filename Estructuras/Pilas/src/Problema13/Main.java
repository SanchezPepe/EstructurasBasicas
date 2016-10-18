/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema13;

/**
 *
 * @author José Sánchez
 */
public class Main {
    
    public static void main(String[] args) {
        
        String cad = "Jose de Jesus Sanchez";
        
        InvierteCad ic = new InvierteCad(cad);
        ic.setCadena(cad);
        ic.invierte();
        System.out.println(ic.getCadenaInv());
    }
    
}
