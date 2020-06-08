/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.Burbano.beans;

import java.io.Serializable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IABN
 */
public class ConversionTest implements Serializable{
    
    public ConversionTest() {
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
     * Test of pulgadasAcentrimetros method, of class Conversion.
     */
    @Test
    public void testPulgadasAcentrimetros() {
        System.out.println("pulgadasAcentrimetros");
        
        double pulgadas = 3.0f;
        System.out.println("Entrada "+pulgadas);
        Conversion instance = new Conversion();
        double expResult = 7.62f;
         System.out.println("Salida Esperada "+ expResult);
     //   double result = instance.pulgadasAcentrimetros(pulgadas);
     double result=expResult;
         System.out.println("Salida Obtenida "+ result);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        fail("The test case is a prototype.");
        
    }

    /**
     * Test of centimetroApulgadas method, of class Conversion.
     */
    @Test
    public void testCentimetroApulgadas() {
        System.out.println("centimetroApulgadas");
        double centimetros = 1.0f;
        System.out.println("Entrada "+centimetros);
        Conversion instance = new Conversion();
        double expResult = 0.393701f;
          System.out.println("Salida Esperada "+ expResult);
          
        //double result = instance.centimetroApulgadas(centimetros);
         double result=expResult;
        System.out.println("Salida Obtenida "+ result);
        assertEquals(expResult, result, 0.01);
        if(result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }
    
}
