
import br.com.marcelo.dao.ComputadorDao;
import br.com.marcelo.dao.impl.ComputadorDaoImpl;
import br.com.marcelo.entidades.Computador;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
    public static void main(String[] args) throws Exception {

        ComputadorDao computadorDao = new ComputadorDaoImpl();
        Collection<Computador> computadores = computadorDao.findAll();
        for(Computador pc:computadores){
            System.out.println("Nome: ".concat(pc.getNome()));
        }
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Computador computador = computadorDao.findById(Long.valueOf(1));
//            System.out.println("ok " + computador.getNome());
//        } catch (Exception ex) {
//            System.out.println("Erro");
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//



//        System.out.println("findById");
//        Long id = Long.valueOf(1);
//        ComputadorService instance = new ComputadorService();
//        Computador expResult = null;
//        Computador result = null;
//        try {
//            result = instance.findById(id);
//            //System.out.println(result.getNome());
//        } catch (Exception ex) {
//            System.out.println("Erro" + ex.getMessage());
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Computador computador = new Computador();
//        computador.setNome("nome do computador");
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            computadorDao.salvar(computador);
//            System.out.println("Computador salvo com sucesso");
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        Computador computador = new Computador();
//        computador.setNome("ok ok");
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico servico = servicoDao.findById(Long.valueOf(13));
//            System.out.println("Servico ".concat(servico.getNome()));
//            List<Servico> servicos = new ArrayList<Servico>();
//            Servico servico1 = new Servico();
//            servico1.setNome("uia");
//            servicos.add(servico);
//            //servicos.add(servico1);
//            computador.setServicos(servicos);
//            computadorDao.salvar(computador);
//
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Servico servico = new Servico();
//        //servico.setId(Long.valueOf(2));
//        servico.setNome("Nome teste SSH2");
//        servico.setObservacoes("Obs.: Teste");
//        Computador computador = new Computador();
//        //computador.setId(Long.valueOf(1));
//        computador.setNome("Teste3");
//        List<Servico> servicos = new ArrayList<Servico>();
//        //servicos.add(servico);
//       // computador.setServicos(servicos);
//        //Main.persist(computador);
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico setorno = servicoDao.salvar(servico);
//            //Servico ss = new Servico();
//            //ss.setId(Long.valueOf(13));
//            //servicos.add(ss);
//            computador.setServicos(servicos);
//            Computador retorno = computadorDao.salvar(computador);
//          //  Main.persist(servico);
//
//        } catch (Exception ex) {
//                System.out.println("Erroooooooooooooooooooooooooooo " + ex.getMessage() + "\n---> " + ex.getCause());
//        }
//        Servico servico = new Servico();
//        //servico.setId(Long.valueOf(2));
//        servico.setNome("Nome teste SSH2");
//        servico.setObservacoes("Obs.: Teste");
//        Computador computador = new Computador();
//        //computador.setId(Long.valueOf(1));
//        computador.setNome("Teste3");
//        List<Servico> servicos = new ArrayList<Servico>();
//        //servicos.add(servico);
//       // computador.setServicos(servicos);
//        //Main.persist(computador);
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico setorno = servicoDao.salvar(servico);
//            //Servico ss = new Servico();
//            //ss.setId(Long.valueOf(13));
//            //servicos.add(ss);
//            computador.setServicos(servicos);
//            Computador retorno = computadorDao.salvar(computador);
//          //  Main.persist(servico);
//
//        } catch (Exception ex) {
//                System.out.println("Erroooooooooooooooooooooooooooo " + ex.getMessage() + "\n---> " + ex.getCause());
//        }
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        Computador computador = new Computador();
//        computador.setNome("ok ok");
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico servico = servicoDao.findById(Long.valueOf(13));
//            System.out.println("Servico ".concat(servico.getNome()));
//            List<Servico> servicos = new ArrayList<Servico>();
//            Servico servico1 = new Servico();
//            servico1.setNome("uia");
//            servicos.add(servico);
//            //servicos.add(servico1);
//            computador.setServicos(servicos);
//            computadorDao.salvar(computador);
//
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Servico servico = new Servico();
//        //servico.setId(Long.valueOf(2));
//        servico.setNome("Nome teste SSH2");
//        servico.setObservacoes("Obs.: Teste");
//        Computador computador = new Computador();
//        //computador.setId(Long.valueOf(1));
//        computador.setNome("Teste3");
//        List<Servico> servicos = new ArrayList<Servico>();
//        //servicos.add(servico);
//       // computador.setServicos(servicos);
//        //Main.persist(computador);
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico setorno = servicoDao.salvar(servico);
//            //Servico ss = new Servico();
//            //ss.setId(Long.valueOf(13));
//            //servicos.add(ss);
//            computador.setServicos(servicos);
//            Computador retorno = computadorDao.salvar(computador);
//          //  Main.persist(servico);
//
//        } catch (Exception ex) {
//                System.out.println("Erroooooooooooooooooooooooooooo " + ex.getMessage() + "\n---> " + ex.getCause());
//        }
//        Servico servico = new Servico();
//        //servico.setId(Long.valueOf(2));
//        servico.setNome("Nome teste SSH2");
//        servico.setObservacoes("Obs.: Teste");
//        Computador computador = new Computador();
//        //computador.setId(Long.valueOf(1));
//        computador.setNome("Teste3");
//        List<Servico> servicos = new ArrayList<Servico>();
//        //servicos.add(servico);
//       // computador.setServicos(servicos);
//        //Main.persist(computador);
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico setorno = servicoDao.salvar(servico);
//            //Servico ss = new Servico();
//            //ss.setId(Long.valueOf(13));
//            //servicos.add(ss);
//            computador.setServicos(servicos);
//            Computador retorno = computadorDao.salvar(computador);
//          //  Main.persist(servico);
//
//        } catch (Exception ex) {
//                System.out.println("Erroooooooooooooooooooooooooooo " + ex.getMessage() + "\n---> " + ex.getCause());
//        }


//        System.out.println("findById");
//        Long id = Long.valueOf(1);
//        ComputadorService instance = new ComputadorService();
//        Computador expResult = null;
//        Computador result = null;
//        try {
//            result = instance.findById(id);
//            //System.out.println(result.getNome());
//        } catch (Exception ex) {
//            System.out.println("Erro" + ex.getMessage());
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }



//        Computador computador = new Computador();
//        computador.setNome("nome do computador");
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            computadorDao.salvar(computador);
//            System.out.println("Computador salvo com sucesso");
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }



//        ServicoDao servicoDao = new ServicoDaoImpl();
//        Computador computador = new Computador();
//        computador.setNome("ok ok");
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico servico = servicoDao.findById(Long.valueOf(13));
//            System.out.println("Servico ".concat(servico.getNome()));
//            List<Servico> servicos = new ArrayList<Servico>();
//            Servico servico1 = new Servico();
//            servico1.setNome("uia");
//            servicos.add(servico);
//            //servicos.add(servico1);
//            computador.setServicos(servicos);
//            computadorDao.salvar(computador);
//
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Servico servico = new Servico();
//        //servico.setId(Long.valueOf(2));
//        servico.setNome("Nome teste SSH2");
//        servico.setObservacoes("Obs.: Teste");
//        Computador computador = new Computador();
//        //computador.setId(Long.valueOf(1));
//        computador.setNome("Teste3");
//        List<Servico> servicos = new ArrayList<Servico>();
//        //servicos.add(servico);
//       // computador.setServicos(servicos);
//        //Main.persist(computador);
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico setorno = servicoDao.salvar(servico);
//            //Servico ss = new Servico();
//            //ss.setId(Long.valueOf(13));
//            //servicos.add(ss);
//            computador.setServicos(servicos);
//            Computador retorno = computadorDao.salvar(computador);
//          //  Main.persist(servico);
//
//        } catch (Exception ex) {
//                System.out.println("Erroooooooooooooooooooooooooooo " + ex.getMessage() + "\n---> " + ex.getCause());
//        }
//        Servico servico = new Servico();
//        //servico.setId(Long.valueOf(2));
//        servico.setNome("Nome teste SSH2");
//        servico.setObservacoes("Obs.: Teste");
//        Computador computador = new Computador();
//        //computador.setId(Long.valueOf(1));
//        computador.setNome("Teste3");
//        List<Servico> servicos = new ArrayList<Servico>();
//        //servicos.add(servico);
//       // computador.setServicos(servicos);
//        //Main.persist(computador);
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico setorno = servicoDao.salvar(servico);
//            //Servico ss = new Servico();
//            //ss.setId(Long.valueOf(13));
//            //servicos.add(ss);
//            computador.setServicos(servicos);
//            Computador retorno = computadorDao.salvar(computador);
//          //  Main.persist(servico);
//
//        } catch (Exception ex) {
//                System.out.println("Erroooooooooooooooooooooooooooo " + ex.getMessage() + "\n---> " + ex.getCause());
//        }




//        ServicoDao servicoDao = new ServicoDaoImpl();
//        Computador computador = new Computador();
//        computador.setNome("ok ok");
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico servico = servicoDao.findById(Long.valueOf(13));
//            System.out.println("Servico ".concat(servico.getNome()));
//            List<Servico> servicos = new ArrayList<Servico>();
//            Servico servico1 = new Servico();
//            servico1.setNome("uia");
//            servicos.add(servico);
//            //servicos.add(servico1);
//            computador.setServicos(servicos);
//            computadorDao.salvar(computador);
//
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }


//        Servico servico = new Servico();
//        //servico.setId(Long.valueOf(2));
//        servico.setNome("Nome teste SSH2");
//        servico.setObservacoes("Obs.: Teste");
//        Computador computador = new Computador();
//        //computador.setId(Long.valueOf(1));
//        computador.setNome("Teste3");
//        List<Servico> servicos = new ArrayList<Servico>();
//        //servicos.add(servico);
//       // computador.setServicos(servicos);
//        //Main.persist(computador);
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico setorno = servicoDao.salvar(servico);
//            //Servico ss = new Servico();
//            //ss.setId(Long.valueOf(13));
//            //servicos.add(ss);
//            computador.setServicos(servicos);
//            Computador retorno = computadorDao.salvar(computador);
//          //  Main.persist(servico);
//
//        } catch (Exception ex) {
//                System.out.println("Erroooooooooooooooooooooooooooo " + ex.getMessage() + "\n---> " + ex.getCause());
//        }



//        Servico servico = new Servico();
//        //servico.setId(Long.valueOf(2));
//        servico.setNome("Nome teste SSH2");
//        servico.setObservacoes("Obs.: Teste");
//        Computador computador = new Computador();
//        //computador.setId(Long.valueOf(1));
//        computador.setNome("Teste3");
//        List<Servico> servicos = new ArrayList<Servico>();
//        //servicos.add(servico);
//       // computador.setServicos(servicos);
//        //Main.persist(computador);
//        ServicoDao servicoDao = new ServicoDaoImpl();
//        ComputadorDao computadorDao = new ComputadorDaoImpl();
//        try {
//            Servico setorno = servicoDao.salvar(servico);
//            //Servico ss = new Servico();
//            //ss.setId(Long.valueOf(13));
//            //servicos.add(ss);
//            computador.setServicos(servicos);
//            Computador retorno = computadorDao.salvar(computador);
//          //  Main.persist(servico);
//
//        } catch (Exception ex) {
//                System.out.println("Erroooooooooooooooooooooooooooo " + ex.getMessage() + "\n---> " + ex.getCause());
//        }

    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("IventarioCommonsPU");
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
