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
public class MetodoDeEntregaTest {
    
    public MetodoDeEntregaTest() {
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
     * Test of seleccionarMetodoDeEntrega method, of class MetodoDeEntrega.
     */
    @Test
    public void testSeleccionarMetodoDeEntrega() {
        System.out.println("seleccionarMetodoDeEntrega");
        Scanner input = null;
        Pedido pedido = null;
        MetodoDeEntrega instance = new MetodoDeEntrega();
        instance.seleccionarMetodoDeEntrega(input, pedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
