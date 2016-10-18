/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema16;

import pilas.PilaA;

/**
 *
 * @author hca
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
        p.push("Ld");
        
        
        System.out.println(p.peek());
        InviertePila.invOrden(p);
        System.out.println(p.peek());
        
    }
}
