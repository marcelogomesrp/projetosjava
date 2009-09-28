/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import dominio.Pesquisador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class PesquisadorDAOTest {

    public PesquisadorDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testGetEm() {
    }

    @Test
    public void testSetEm() {
    }

    @Test
    public void testSalvar() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pesquisador pesquisador = new Pesquisador();
//        pesquisador.setId(Long.valueOf(20));
//        pesquisador.setNome("ufa");
//        PesquisadorDAO pesquisadorDAO = (PesquisadorDAO) context.getBean("pesquisadorDAO");
//        Pesquisador resultado = pesquisadorDAO.salvar(pesquisador);
    }

}