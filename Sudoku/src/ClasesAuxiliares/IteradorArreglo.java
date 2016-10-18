package ClasesAuxiliares;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Carolina Crispina López Cordero
 */
public class IteradorArreglo <T> implements Iterator<T> {
    private T coleccion[];
    private int total;
    private int actual;

    public IteradorArreglo(T arreglo[], int tamaño) {
        coleccion = arreglo;
        total = tamaño;
        actual = 0;
    }
    
    public boolean hasNext() {
        return actual < total;
    }

    public T next() {
        if(!hasNext())
            throw new NoSuchElementException("-");
        else{
            T res = coleccion[actual];
            actual++;
            return res;
        }
    }
    
    public void remove() {
        throw new UnsupportedOperationException();
    } 
}