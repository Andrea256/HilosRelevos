/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.mycompany.carrerarelevos.Utilitaria;

/**
 *
 * @author AndreaOrjuela
 */
public class Pruebas {
    
    public Pruebas() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testAleatorio() {
        int pasos = Utilitaria.aleatorio();
        switch (pasos) {
            case 0:
                assertEquals(0, pasos);
                break;
            case 1:
                assertEquals(1, pasos);
                break;
            case 2:
                assertEquals(2, pasos);
                break;
            case 3:
                assertEquals(3, pasos);
                break;
            default:
                fail("El número está fuera del rango 0-3");
                break;
        }
    }
}
