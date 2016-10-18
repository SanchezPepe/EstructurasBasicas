/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author hca
 */
public class IteradorEE <T> implements Iterator <T>{
    
    private Nodo <T> actual;
    
    public IteradorEE(Nodo<T> dir){
        actual = dir;
    }
    
    public boolean hasNext(){
        return actual != null;
    }
    
    public T next(){
        if(hasNext()){
            T dato = actual.getDato();
            actual = actual.getSig();
            return dato;
        }
        else
            throw new NoSuchElementException();
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }
    
}
