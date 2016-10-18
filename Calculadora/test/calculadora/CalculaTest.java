/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Pilas.PilaA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aile
 */
public class CalculaTest {
    
    public CalculaTest() {
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
    
    /**
     * Test of revisaParentesis method, of class Calculadora.
     */
    @Test
    public void testRevisaParentesis() {
        System.out.println("revisaParentesis");
        String exp = ("(4+2");
        boolean expResult = false;
        boolean result = Calcula.revisaParentesis(exp);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaExp method, of class Calculadora.
     */
    @Test
    public void testValidaExp() {
        System.out.println("validaExp");
        String exp = "4+5";
        boolean expResult = true;
        boolean result = Calcula.validaExp(exp);
        assertEquals(expResult, result);

    }

    /**
     * Test of inPost method, of class Calculadora.
     */
    @Test
    public void testInPost() {
        System.out.println("inPost");
        String exp = "4+5";
        String expResult = "4 5+";
        String result = Calcula.inPost(exp);
        assertEquals(expResult, result);
    }

    /**
     * Test of realizaOp method, of class Calculadora.
     */
    @Test
    public void testRealizaOp() {
        System.out.println("realizaOp");
        String post = "4 5+";
        double expResult = 9.0;
        double result = Calcula.realizaOp(post);
        assertEquals(expResult, result, 9.0);
    }

    /**
     * Test of filtroFinal method, of class Calculadora.
     */
    @Test
    public void testFiltroFinal() {
        System.out.println("filtroFinal");
        String exp = "5+6";
        String expResult = "11.0";
        String result = Calcula.filtroFinal(exp);
        assertEquals(expResult, result);
    }

    /**
     * Test of esOperador method, of class Calculadora.
     */
    @Test
    public void testEsOperador() {
        System.out.println("esOperador");
        char c = '4';
        boolean expResult = false;
        boolean result = Calcula.esOperador(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of esNumero method, of class Calculadora.
     */
    @Test
    public void testEsNumero() {
        System.out.println("esNumero");
        char c = '4';
        boolean expResult = true;
        boolean result = Calcula.esNumero(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of esParentesis method, of class Calculadora.
     */
    @Test
    public void testEsParentesis() {
        System.out.println("esParentesis");
        char c = '/';
        boolean expResult = false;
        boolean result = Calcula.esParentesis(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of pInf method, of class Calculadora.
     */
    @Test
    public void testPInf() {
        System.out.println("pInf");
        char c = '*';
        int expResult = 2;
        int result = Calcula.pInf(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of pPila method, of class Calculadora.
     */
    @Test
    public void testPPila() {
        System.out.println("pPila");
        char c = '/';
        int expResult = 2;
        int result = Calcula.pPila(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of opSigno method, of class Calculadora.
     */
    @Test
    public void testOpSigno() {
        System.out.println("opSigno");
        double n1 = 5.0;
        double n2 = 3.0;
        char c = '+';
        double expResult = 8.0;
        double result = Calcula.opSigno(n1, n2, c);
        assertEquals(expResult, result, 8.0);
    }

    /**
     * Test of llenaPilas method, of class Calculadora.
     */
    @Test
    public void testLlenaPilas() {
        System.out.println("llenaPilas");
        PilaA<Double> num = null;
        PilaA<Character> op = null;
        String expPos = "";
        Calcula.llenaPilas(num, op, expPos);
    }


    
}   
    