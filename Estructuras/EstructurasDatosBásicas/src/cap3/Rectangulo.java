
package cap3;

/** 
 * @author Silvia Guardati
 * Ejercicio 2 - Capítulo 3
 */
public class Rectangulo extends Cuadrilátero{

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        super(lado1, lado2, lado1, lado2);
    }

    @Override
    public double calculaÁrea() {
        return lado1 * lado2;
    }

    @Override
    public double calculaPerímetro() {
        return 2 * (lado1 + lado2);
    }
    
    @Override
    public String toString() {
        return "\nLados del rectángulo: " + lado1 + " - " + lado2;
    }
}
