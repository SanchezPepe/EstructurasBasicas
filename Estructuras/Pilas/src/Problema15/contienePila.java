/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema15;

import pilas.PilaA;

/**
 *
 * @author hca
 */
public class contienePila {
    
    public contienePila(){   
    }
    
    public static <T> boolean contP(PilaA <T> p1, PilaA <T> p2){
        PilaA <T> p1Aux = new PilaA(20);
        PilaA <T> p2Aux = new PilaA(20);
        T aux;
        boolean resp = true;
        
        while(!p2.isEmpty()){
            aux = p2.pop();
            p2Aux.push(aux);
            while(!p1.isEmpty() && !aux.equals(p1.peek()))
                p1Aux.push(p1.pop());
            if(p1.isEmpty())
                resp = false;
            while(!p1Aux.isEmpty())
                p1Aux.push(p1.pop());
        }
        while(!p2Aux.isEmpty())
            p2.push(p2Aux.pop());
        return resp;
    }
    
    
    
}
