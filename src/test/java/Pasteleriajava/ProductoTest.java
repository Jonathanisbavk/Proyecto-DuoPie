/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Pasteleriajava;

import java.util.Scanner;
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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of seleccionarPastel method, of class Producto.
     */
    @Test
    public void testSeleccionarPastel() {
        System.out.println("seleccionarPastel");
        Scanner input = null;
        Cliente cliente = null;
        Pedido pedido = null;
        Producto instance = new ProductoImpl();
        instance.seleccionarPastel(input, cliente, pedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPrecioBase method, of class Producto.
     */
    @Test
    public void testObtenerPrecioBase() {
        System.out.println("obtenerPrecioBase");
        Producto instance = new ProductoImpl();
        double expResult = 0.0;
        double result = instance.obtenerPrecioBase();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ProductoImpl implements Producto {

        public void seleccionarPastel(Scanner input, Cliente cliente, Pedido pedido) {
        }

        public double obtenerPrecioBase() {
            return 0.0;
        }
    }
    
}
