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
public class MetodoDePagoTest {
    
    public MetodoDePagoTest() {
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
     * Test of seleccionarMetodoDePago method, of class MetodoDePago.
     */
    @Test
    public void testSeleccionarMetodoDePago() {
        System.out.println("seleccionarMetodoDePago");
        Scanner input = null;
        Pedido pedido = null;
        MetodoDePago instance = new MetodoDePago();
        instance.seleccionarMetodoDePago(input, pedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
