/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee;

/**
 *
 * @author hca
 */
public class PilaE<T> implements PilaADT <T>{
    
    private EE <T> pila;
    
    public PilaE(){
        pila = new EE();
    }
    
    public void push(T dato){
        pila.agregaInicio(dato);
    }
    
    public T pop(){
        return pila.quitaPrimero();
    }
    
    public T peek(){
        return pila.getDato(1);
    }
    
    public boolean isEmpty(){
        return pila.estaVacia();
    }
    
}
