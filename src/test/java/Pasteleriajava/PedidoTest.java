/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Pasteleriajava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of agregarPrecio method, of class Pedido.
     */
    @Test
    public void testAgregarPrecio() {
        System.out.println("agregarPrecio");
        double precio = 0.0;
        Pedido instance = null;
        instance.agregarPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarResumen method, of class Pedido.
     */
    @Test
    public void testAgregarResumen() {
        System.out.println("agregarResumen");
        String resumen = "";
        Pedido instance = null;
        instance.agregarResumen(resumen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pedido.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pedido instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
