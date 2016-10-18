
package primerparcialedfebrero2015;

/**
 *
 * @author sILVIA gUARDATI
 */
public class Revista extends MaterialBibliográfico {
    private String periodicidad;
    private int añoFundación;

    public Revista() {
        super();
    }
    
    public Revista(int clave) {
        super(clave);
    }

    public Revista(String periodicidad, int añoFundación, int clave, String nombre, double precio) {
        super(clave, nombre, precio);
        this.periodicidad = periodicidad;
        this.añoFundación = añoFundación;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nPeriodicidad: " + periodicidad + "\nAño de fundación: " + añoFundación;
    }
}
