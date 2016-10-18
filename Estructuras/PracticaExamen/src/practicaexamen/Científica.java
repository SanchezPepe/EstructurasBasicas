
package primerparcialedfebrero2015;

/**
 *
 * @author Silvia Guardati
 */
public class Científica extends Revista {
    private String editor;

    public Científica() {
        super();
    }

    public Científica(String editor, String periodicidad, int añoFundación, int clave, String nombre, double precio) {
        super(periodicidad, añoFundación, clave, nombre, precio);
        this.editor = editor;
    }

    
    
}
