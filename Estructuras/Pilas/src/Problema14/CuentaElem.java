/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema14;

import java.util.ArrayList;
import pilas.PilaA;

/**
 *
 * @author José Sánchez
 */
public class CuentaElem {
    
    
    public CuentaElem(){
        
    }
       
    public static <T> int numElem(PilaA <T> pila){
        int cont = 0;
        ArrayList <T> aux = new ArrayList();
        while(!pila.isEmpty()){
            aux.add(pila.peek());
            pila.pop();
            cont++;
        }
        int i = cont;
        while(i > 0){
            pila.push(aux.get(i-1));
            i--;
        }
        return cont;
    }
}
