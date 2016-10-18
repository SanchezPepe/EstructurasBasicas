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
public class EmptyCollectionException2 extends RuntimeException {
    
    public EmptyCollectionException2(){
        super("Colección Vacía");
    }
    
    public EmptyCollectionException2(String mensaje){
        super(mensaje);
    }
    
}
