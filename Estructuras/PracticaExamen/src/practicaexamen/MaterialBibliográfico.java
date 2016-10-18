




package primerparcialedfebrero2015;

import java.util.Objects;

/**
 *
 * @author Silvia Guardati
 */
public abstract class MaterialBibliográfico {
    private int clave;
    private String nombre;
    private double precio;

    public MaterialBibliográfico() {
    }
    
    public MaterialBibliográfico(int clave) {
        this.clave = clave;
    }

    public MaterialBibliográfico(int clave, String nombre, double precio) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Material Bibliográfico: \n" + "Clave: " + clave + "\nNombre: " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaterialBibliográfico other = (MaterialBibliográfico) obj;
        if (this.clave != other.clave) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public int getClave() {
        return clave;
    }
    
    

}
