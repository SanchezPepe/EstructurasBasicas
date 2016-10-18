/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema14;

import pilas.PilaA;

/**
 *
 * @author José Sánchez
 */
public class Main {
    
    public static void main(String[] args) {
        PilaA <String> p = new PilaA(20);
        p.push("dsf");
        p.push("d3sf");
        p.push("ds342f");
        p.push("dsfdsf");
        p.push("dsarjuf");
        p.push("huehuehuehue");
        p.push("LOL");
        
        System.out.println(CuentaElem.numElem(p));
        System.out.println(p.peek());
        p.pop();
        System.out.println(p.peek());
        
        
        
    }
    
}
