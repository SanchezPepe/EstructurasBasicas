package primerparcialedfebrero2015;

/**
 * Clase para manejo de excepciones. Se usará en las clases que
 * implementen colecciones.
 * @author Silvia Guardati 
 */
public class EmptyCollectionException extends RuntimeException{

    public EmptyCollectionException(){
        super("Colección vacía");
    }

    public EmptyCollectionException(String mensaje){
        super(mensaje);
    }

}
