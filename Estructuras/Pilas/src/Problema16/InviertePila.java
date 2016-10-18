/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema16;

import java.util.ArrayList;
import pilas.PilaA;

/**
 *
 * @author hca
 */
public class InviertePila {
    
    public InviertePila(){
        
    }
  
    public static <T> void invOrden(PilaA <T> pila){
        int cont = 0;
        ArrayList <T> aux = new ArrayList();
        if(!pila.isEmpty()){
            while(!pila.isEmpty()){
                aux.add(pila.peek());
                pila.pop();
                cont++;
            }
            int i = 0;
            while(i != cont){
                pila.push(aux.get(i));
                i++;
            }        
        }
    }
}
