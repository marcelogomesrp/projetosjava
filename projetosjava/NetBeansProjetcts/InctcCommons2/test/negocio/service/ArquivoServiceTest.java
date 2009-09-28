/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.service;

import negocio.entidade.Arquivo;
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
public class ArquivoServiceTest {

    public ArquivoServiceTest() {
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
     * Test of gravar method, of class ArquivoService.
     */
    @Test
    public void testGravar() {
//        System.out.println("gravar");
        Arquivo arquivo = new Arquivo();
        arquivo.setId(Long.valueOf(2));
        arquivo.setNome("Nome Teste");
        arquivo.setTipo("Tipo Teste");
        ArquivoService instance = new ArquivoService();
        Arquivo expResult = new Arquivo();
        Arquivo result = instance.gravar(arquivo);
        //assertEquals(expResult, result);
        if(assertSame(expResult, result)){

        }
        // TODO review the generated test code and remove the default call to fail.
        

    }

}