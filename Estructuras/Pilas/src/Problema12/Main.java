/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema12;

/**
 *
 * @author hca
 */
public class Main {
    
    public static void main(String[] args) {
        RevisorParentesis rev = new RevisorParentesis();
        
        //Caso de éxito
        rev.setExpres("(4+6)*4");
        System.out.println(rev.estaBalanceada());
        
        //Desbalance izq
        rev.setExpres("((65 + 7");
        System.out.println(rev.estaBalanceada());
        
        //Desbalance der
        rev.setExpres("43/23)");
        System.out.println(rev.estaBalanceada());
    }
}
