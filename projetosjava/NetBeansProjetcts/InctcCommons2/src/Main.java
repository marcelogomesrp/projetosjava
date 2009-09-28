
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import negocio.entidade.Arquivo;
import negocio.entidade.Pesquisador;
import negocio.service.ArquivoService;
import persistencia.ArquivoDao;
import persistencia.PesquisadorDao;
import persistencia.jpa.ArquivoDaoJpa;
import persistencia.jpa.PesquisadorDaoJpa;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pesquisador pesquisador = new Pesquisador();
        pesquisador.setId(Long.valueOf(1));
        pesquisador.setNome("marcelo");
        pesquisador.setNome("55");
        ArquivoService arquivoServico = new ArquivoService();
        ArquivoDao arquivoDao = new ArquivoDaoJpa();
//        PesquisadorDao pesquisadorDao = new PesquisadorDaoJpa();
//        pesquisadorDao.salvar(pesquisador);
//        Arquivo arquivo = new Arquivo();
//        arquivo.setId(Long.valueOf(1));
//        arquivo.setNome("ssss");
//        arquivo.setTipo("sss");
//        ArquivoDao arquivoDao = new ArquivoDaoJpa();
//        arquivoDao.salvar(arquivo);
//        Arquivo arquivo2 = new Arquivo();
//        arquivo2.setId(Long.valueOf(6));
//        arquivo2.setNome("marcelo3");
//        arquivo2.setTipo("txt3");
//        arquivoDao.salvar(arquivo2);
//        Arquivo novo = new Arquivo();
//        novo.setId(Long.valueOf(100));
//        novo.setNome("nome");
//        novo.setTipo("tipo");
//        Main main = new Main();
//        main.persist(novo);
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InctcCommons2PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
