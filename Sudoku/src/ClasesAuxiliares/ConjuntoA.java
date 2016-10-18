package ClasesAuxiliares;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Carolina Crispina López Cordero
 */
public class ConjuntoA<T> implements ConjuntoADT<T> {
    private T conjunto[];
    private int cardinalidad;
    private final int MAX = 100;

    public ConjuntoA() {
        conjunto = (T[]) new Object[MAX];
        cardinalidad = 0;
    }

    public ConjuntoA(int max) {
        conjunto = (T[]) new Object[max];
        cardinalidad = 0;
    }
    
    public int getCardinalidad() {
        return cardinalidad;
    }
    
    public boolean estaVacio() {
        return cardinalidad == 0;
    }
    
    public boolean contiene(T dato) {
        boolean res = false;
        Iterator<T> it = iterator();
        
        while(it.hasNext() && !res) {
            res = it.next().equals(dato);
        }
        return res;
    }
    
    public boolean agrega(T dato) {
        boolean res = false;
        
        if(!contiene(dato)){
            res = true;
            if (cardinalidad == conjunto.length-1)
                expande(conjunto.length*2);
            conjunto[cardinalidad] = dato;
            cardinalidad++;
        }
        return res;
    }
    
    private void expande(int tamaño) {
        T nuevo[] = (T[]) new Object [tamaño];
        
        for(int i=0; i<cardinalidad; i++)
            nuevo[i] = conjunto [i];
        conjunto = nuevo;
    }
    
    public T quita(T dato) {
        T res = null;
        int i = 0;
        
        while(i < cardinalidad && !conjunto[i].equals(dato))
            i++;
        if(i < cardinalidad){
            res = conjunto[i];
            conjunto[i] = conjunto[cardinalidad - 1];
            conjunto[cardinalidad - 1] = null;
            cardinalidad--;
        }
        return res;
    }

    private void copia(ConjuntoADT<T> original, ConjuntoADT<T> copia){
        Iterator<T> it = original.iterator();
        while(it.hasNext())
            copia.agrega(it.next());
    }
    
    public ConjuntoADT<T> union(ConjuntoADT<T> otro) {
        ConjuntoADT<T> union = new ConjuntoA();
        
        if(otro != null) {
            copia(this, union);
            copia(otro, union);
        }
        else
            union = this;
        return union;
    }

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro) {
        ConjuntoADT<T> interseccion = new ConjuntoA();
        Iterator it = this.iterator();
        T dato;
        
        if(otro != null)
            while(it.hasNext()){
                dato = (T)it.next();
                if(otro.contiene(dato))
                    interseccion.agrega(dato);
            }
        return interseccion;
    }

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro) {
        ConjuntoADT<T> diferencia = new ConjuntoA();
        Iterator it = this.iterator();
        T dato;
        
        if(otro != null)
            while(it.hasNext()){
                dato = (T)it.next();
                if(!otro.contiene(dato))
                    diferencia.agrega(dato);
            }
        return diferencia;
    }

    public Iterator<T> iterator() {
        return new IteradorArreglo(conjunto, cardinalidad);
    }
    
    /*public String toString() {
        StringBuilder cad = new StringBuilder();
        
        cad.append("\nConjunto:");
        for(int i=0; i<cardinalidad; i++)
            cad.append("    " + conjunto[i]);
        return cad.toString();
    }*/
    
    public String toString() {
        StringBuilder cad = new StringBuilder();
        Iterator it = iterator();
        
        while(it.hasNext())
            cad.append("\n" + it.next());
        return cad.toString();
    }
    
    /*public boolean equals(Object otro) {
        boolean res = false;
    
        if(otro != null && otro instanceof ConjuntoA) 
            if(i == cardinalidad){
                ConjuntoA<T> another = (ConjuntoA<T>) otro;
                res = equals(another, 0);
            }
        return res;
    }
    
    private boolean equals(ConjuntoA<T> another, int i) {
        if(i == cardinalidad)
            return true;
        else if(another.contiene(conjunto[i]))
            return equals(another, i+1);
        else
            return false;
    }*/
    
    public boolean equals(Object otro) {
        boolean res = false;
        
        if(otro != null && otro instanceof ConjuntoA) {
            ConjuntoA c = (ConjuntoA) otro;
            if(cardinalidad == c.cardinalidad)
                res = equals(this.iterator(), c);
        }
        return res;
    }
    
    private boolean equals(Iterator<T> it, ConjuntoA<T> c) {
        if(!it.hasNext())
            return true;
        else if(c.contiene(it.next()))
            return equals(it, c);
        else
            return false;
    }
}