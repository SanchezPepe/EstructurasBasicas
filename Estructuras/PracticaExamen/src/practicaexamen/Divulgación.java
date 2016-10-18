
package primerparcialedfebrero2015;

/**
 *
 * @author Silvia Guardati
 */
public class Divulgación extends Revista{
    private int tiraje;

    public Divulgación() {
        super();
    }

    public int getTiraje() {
        return tiraje;
    }
    
    public Divulgación(int clave) {
        super(clave);
    }

    public void setTiraje(int tiraje) {
        this.tiraje = tiraje;
    }

    public Divulgación(int tiraje, String periodicidad, int añoFundación, int clave, String nombre, double precio) {
        super(periodicidad, añoFundación, clave, nombre, precio);
        this.tiraje = tiraje;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTIRAJE: " + tiraje;
    }
    
    
    
}
