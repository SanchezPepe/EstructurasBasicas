/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema20;

import colas.ColaA;

/**
 *
 * @author hca
 */
public class EliminaOcurrencias {
    
    public static <T> void elimO(ColaA <T> c, T dato){
        ColaA <T> aux = new ColaA();
        while(!c.estaVacia())
            if(c.primero() == dato)
                c.quita();
            else
                aux.agrega(c.quita());
        while(!aux.estaVacia())
            c.agrega(aux.quita());  
    }
}
