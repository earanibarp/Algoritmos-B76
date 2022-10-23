/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Formulario;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class formulario_sumaTest {
    
    public formulario_sumaTest() {
    }

    /**
     * Test of Sumar method, of class formulario_suma.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int num1 = 5;
        int num2 = 3;
        formulario_suma instance = new formulario_suma();
        int expResult = 10;
        int result = instance.Sumar(num1, num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of Restar method, of class formulario_suma.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int num1 = 8;
        int num2 = 4;
        formulario_suma instance = new formulario_suma();
        int expResult = 4;
        int result = instance.Restar(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Multiplicar method, of class formulario_suma.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int num1 = 4;
        int num2 = 2;
        formulario_suma instance = new formulario_suma();
        int result = instance.Multiplicar(num1, num2);
        assertTrue(result == (num1 * num2));
    }

    /**
     * Test of Dividir method, of class formulario_suma.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        int num1 = 4;
        int num2 = 2;
        formulario_suma instance = new formulario_suma();
        int expResult = 2;
        int result = instance.Dividir(num1, num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class formulario_suma.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        formulario_suma.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
