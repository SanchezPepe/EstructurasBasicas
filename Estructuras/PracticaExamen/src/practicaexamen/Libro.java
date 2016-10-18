
package primerparcialedfebrero2015;

/**
 *
 * @author Silvia Guardati
 */
public class Libro extends MaterialBibliográfico {
    private String autor;

    public Libro() {
        super();
    }

    public Libro(String autor, int clave, String nombre, double precio) {
        super(clave, nombre, precio);
        this.autor = autor;
    }
    
    
    
    
    
}
