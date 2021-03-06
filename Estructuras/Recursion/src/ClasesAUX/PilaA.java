/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAUX;

/**
 *
 * @author hca
 */
public class PilaA <T> implements PilaADT <T>{
    
    private T pila[];
    private int tope;
    private final int MAX = 50;
    
    public PilaA(){
        tope = -1; //Indica que la pila está vacía
        pila = (T[])new Object[MAX];
    }
    
    public PilaA(int max){
        tope = -1;
        pila = (T[])new Object[max];
    }
    
    public void push(T dato){
        if(tope == pila.length -1)
            expandCapacity(pila.length*2);
        tope = tope + 1;
        pila[tope] = dato;
    }
    
    private void expandCapacity(int n){
        T nueva[] = (T[]) new Object[n];
        for(int i = 0; i <= tope; i++)
            nueva[i] = pila[i];
        pila = nueva;
    }
    
    public boolean isEmpty(){
        return tope == -1;
    }
    
    public T pop(){
        if(isEmpty())
            throw new EmptyCollectionException("Pila vacía");
        else{
            T resul = pila[tope];
            pila[tope] = null;
            tope = tope-1;
            return resul;
        }
    }
    
    public T popSinExc(){
        T resul = null;
        if(!isEmpty()){
            resul = pila[tope];
            pila[tope] = null;
            tope--;
        }
        return resul;
    }
    
    public T peek(){
        if(isEmpty())
            throw new EmptyCollectionException("Pila vacía");
        else
            return pila[tope];
    }
    
    public T peekSinExc(){
        T resul = null;
        if(!isEmpty())
            resul = pila[tope];
        return resul;
    }
    
    //MÉTODO EQUALS RECURSIVO 17/03/16
    public boolean equals(Object otro){
        boolean resp = false;
        if(otro != null && otro instanceof PilaA){
            PilaA <T> aux = (PilaA)otro;
            if(tope == aux.tope)
                return equals(aux, 0);
        }
        return resp;
    }
    
    private boolean equals(PilaA <T> aux, int i){
        if(i == tope + 1)
            return true;
        else
            if(pila[i].equals(aux.pila[i]))
                return equals(aux, i + 1);
            else
                return false;
    }
        
    
}
