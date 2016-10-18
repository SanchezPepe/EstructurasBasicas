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
public class ColaE <T> implements ColaADT <T>{
    
    private EE <T> cola;
    
    public ColaE(){
        cola = new EE();
    }
    
    public void agrega(T dato){
        cola.agregaFinal(dato);
    }
    
    public T quita(){
        return cola.quitaPrimero();
    }
    
    public boolean estaVacia(){
        return cola.estaVacia();
    }
    
    public boolean estaLlena(){
        return false;
    }
    
    public T primero(){
        return cola.getDato(1);
    }
   
}
