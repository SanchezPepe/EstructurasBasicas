package ClasesAuxiliares;

import java.util.Iterator;

/**
 *
 * @author Carolina Crispina López Cordero
 */
public interface ConjuntoADT<T> extends Iterable <T> {
    public boolean agrega(T dato);
    public boolean contiene(T dato);
    public T quita(T dato);
    public ConjuntoADT<T> union(ConjuntoADT<T> otro);
    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro);
    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro);
    public boolean estaVacio();
    public Iterator<T> iterator();
}
