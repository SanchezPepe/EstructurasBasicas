
package cap3;

import cap2.Rectángulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Silvia Guardati
 * Programa 3.16 (modificado)
 * Clase de prueba correspondiente a la clase Rectángulo, programa 2.2
 * El código generado por JUnit se modificó para probar los métodos calculaArea() y
 * calculaPerímetro().
 */
public class RectánguloTest {
    
    public RectánguloTest() {
    }
    
    /**
     * Test of calculaArea method, of class Rectángulo.
     */
    @Test
    public void testCalculaArea() {
        System.out.println("calculaArea");
        Rectángulo instance = new Rectángulo(4.0, 2.0);
        double expResult = 8.0;  // Resultado esperado para un rectángulo de 4 x 2
        double result = instance.calculaArea();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculaPerímetro method, of class Rectángulo.
     */
    @Test
    public void testCalculaPerímetro() {
        System.out.println("calculaPerímetro");
        Rectángulo instance = new Rectángulo(4.0, 2.0);
        double expResult = 12.0; // Resultado esperado para un rectángulo de 4 x 2
        double result = instance.calculaPerímetro();
        assertEquals(expResult, result, 0.0);
    }
}
