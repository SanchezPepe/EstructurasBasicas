/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema18;

import ClasesAuxiliares.PilaA;
import colas.ColaA;

/**
 *
 * @author hca
 */
public class InvierteOrden {
    
    
    public static <T> void invCola(ColaA <T> c){
        PilaA <T> aux = new PilaA();
        while(!c.estaVacia())
            aux.push(c.quita());
        while(!aux.isEmpty())
            c.agrega(aux.pop());
    }
}
