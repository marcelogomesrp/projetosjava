/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.service;

import br.com.marcelo.entidades.Computador;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class ComputadorServiceTest {
    Long id = null;

    public ComputadorServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class ComputadorService.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Computador computador = new Computador();
        computador.setNome("computador teste");
        ComputadorService instance = new ComputadorService();
        Computador expResult = null;
        Computador result = instance.salvar(computador);
        assertNotSame(expResult, result);
        this.id = result.getId();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class ComputadorService.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        //Long id = Long.valueOf(3);
        this.id = Long.valueOf(3);
        ComputadorService instance = new ComputadorService();
        Computador expResult = null;
        Computador result = instance.findById(this.id);
        assertEquals("computador teste", result.getNome());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remover method, of class ComputadorService.
     */
    @Test
    public void testRemover() throws Exception {
        Computador computador = new  Computador();
        ComputadorService instance = new ComputadorService();
        computador.setNome("remover");
        Computador remover = instance.salvar(computador);
        instance.remover(remover);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
     public void testFindAll() throws Exception {
        ComputadorService instance = new ComputadorService();
        Collection<Computador> computadores = instance.findAll();
        if(computadores.size() < 1){
            fail("A lista esta vazia");
        }
    }

}