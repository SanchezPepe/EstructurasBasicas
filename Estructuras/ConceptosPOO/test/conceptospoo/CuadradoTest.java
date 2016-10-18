/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptospoo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hca
 */
public class CuadradoTest {
    
    public CuadradoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testCalculaArea() {
        System.out.println("calculaArea");
        Cuadrado instance = new Cuadrado(2);
        double expResult = 4.0;
        double result = instance.calculaArea();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculaPerimetro method, of class Cuadrado.
     */
    @Test
    public void testCalculaPerimetro() {
        System.out.println("calculaPerimetro");
        Cuadrado instance = new Cuadrado(2);
        double expResult = 8.0;
        double result = instance.calculaPerimetro();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getLado1 method, of class Cuadrado.
     */
    @Test
    public void testGetLado1() {
        System.out.println("getLado1");
        Cuadrado instance = new Cuadrado(5);
        double expResult = 5.0;
        double result = instance.getLado1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setLado1 method, of class Cuadrado.
     */
    @Test
    public void testSetLado1() {
        System.out.println("setLado1");
        double lado1 = 4.0;
        Cuadrado instance = new Cuadrado(5);
        instance.setLado1(lado1);
    }

    /**
     * Test of equals method, of class Cuadrado.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Cuadrado c = new Cuadrado(5);
        Cuadrado instance = new Cuadrado(5);
        boolean expResult = true;
        boolean result = instance.equals(c);
        assertEquals(expResult, result);
    }
    
}
