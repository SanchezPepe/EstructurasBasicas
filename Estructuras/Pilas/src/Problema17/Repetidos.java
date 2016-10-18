/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema17;

import Problema14.CuentaElem;
import pilas.PilaA;

/**
 *
 * @author jsanchezagu
 */
public class Repetidos {
    
    public Repetidos(){
        
    }
    
    public static <T> boolean encuentraRep(PilaA <T> p1){
        PilaA <T> aux = new PilaA();
        boolean band = true;
        T auxT;
        while(band && CuentaElem.numElem(p1) > 1){
            aux.push(p1.peek());
            auxT = p1.pop();
            if(auxT.equals(p1.peek()))
                band = false;
        }
        if(!aux.isEmpty())
            while(!aux.isEmpty())
                p1.push(aux.pop());
        
        return band;
    }   
    
    public static <T> void quitaRep(PilaA <T> p){
        PilaA <T> aux = new PilaA();
        T temp = null;
        while(!p.isEmpty()){
            temp = p.pop();
            while(!p.isEmpty() && temp.equals(p.peek()))
                p.pop();
            aux.push(temp);
        }
        while(!aux.isEmpty())
            p.push(aux.pop());
    }
}
