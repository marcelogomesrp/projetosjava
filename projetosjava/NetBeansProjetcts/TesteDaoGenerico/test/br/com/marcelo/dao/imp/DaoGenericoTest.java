/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.dao.imp;

import br.com.marcelo.dao.PesquisadorDao;
import br.com.marcelo.entities.Pesquisador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author marcelo
 */


public class DaoGenericoTest {
    private PesquisadorDao pesquisadorDao;
    private Integer id = 1;

    public DaoGenericoTest() {
        this.pesquisadorDao = new PesquisadorDaoImp();
    }

    public void setPesquisadorDao(PesquisadorDao pesquisadorDao){
        this.pesquisadorDao = pesquisadorDao;
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testSetEntityManager() {
        
    }

    @Test
    public void testSalvar() {
        Pesquisador pesquisador = null;              
        pesquisador =  pesquisadorDao.salvar(getPesquisador());
    }

    private Pesquisador getPesquisador(){
        Pesquisador pesquisador = new Pesquisador();
        pesquisador.setNome("teste pesquisador");
        pesquisador.setId(Long.valueOf(105));
        return pesquisador;
    }

}