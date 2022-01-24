/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculatricejenkins;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tresor
 */
public class CalculatriceJenkinsIT {
    
    public CalculatriceJenkinsIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalculatriceJenkins.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatriceJenkins.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CalculatriceJenkins.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
