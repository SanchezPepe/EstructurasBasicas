/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema19;

import ClasesAuxiliares.PilaA;
import colas.ColaA;

/**
 *
 * @author hca
 */
public class EliminaRepetidos {
    
    public static <T> void elimRep(ColaA <T> c){
        ColaA <T> aux = new ColaA();
        T temp = null;
        while(!c.estaVacia()){
            temp = c.quita();
            aux.agrega(temp);
            while(!c.estaVacia() && c.primero().equals(temp))
                c.quita();
        }
        while(!aux.estaVacia())
            c.agrega(aux.quita());
    }    
    
    public static void main(String[] args) {
        
        ColaA <Integer> c = new ColaA();
        c.agrega(6);
        c.agrega(9);
        c.agrega(2);
        c.agrega(0);
        c.agrega(2);
        c.agrega(2);
        elimRep(c);
        
        System.out.println(c.toString());
    }
}
