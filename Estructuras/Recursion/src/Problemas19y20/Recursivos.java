/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problemas19y20;

/**
 *
 * @author hca
 */
public class Recursivos {
    
    //Metodos auxiliares
    private static <T> void quitaRep(ColaADT <T> cola, ColaADT <T> aux, T temp){
        if(!cola.estaVacia()){
            if(cola.primero().equals(temp)){
                cola.quita();
                quitaRep(cola, aux, temp);
            }
            else{
                aux.agrega(temp);
                temp = cola.quita();
                quitaRep(cola, aux, temp);
            }
        }
        else
            aux.agrega(temp);
    }
    
    
    
    //Problema 19
    
    public static <T> void quitaRep(ColaADT <T> cola){
        if(!cola.estaVacia()){
            ColaADT <T> aux = new ColaA();
            quitaRep(cola, aux, cola.quita());
            //copiaCola(aux, cola)
        }
    }
    
    //Problema con recursión y ordenacion por seleccion directa
    public static <T> void eliminaOc(ColaADT <T> cola, T dato){
        if(!cola.estaVacia()){
           ColaADT <T> aux = new ColaA();
           eliminaOc(cola, dato, aux);
           //copiaCola(aux, cola);
        }
   }
   
    private static <T> void eliminaOc(ColaADT <T> cola, T dato, ColaADT <T> aux){
        if(!cola.estaVacia()){
            T temp = cola.quita();
            if(!temp.equals(dato))
               aux.agrega(temp);
            eliminaOc(cola, dato, aux);
       }
   }
   
   
    
}
