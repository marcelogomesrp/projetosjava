
import commons.dao.ArquivoDao;
import commons.dao.DaoGenerico.MatchMode;
import commons.dao.DataAccessException;
import commons.dao.PesquisadorDao;
import commons.dao.jpa.ArquivoDaoJPA;
import commons.dao.jpa.HibernateUtil;
import commons.dao.jpa.PesquisadorDaoJPA;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.modelo.Arquivo;
import negocio.modelo.Pesquisador;
import negocio.service.ArquivoService;
import negocio.service.PesquisadorService;

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
        pesquisador.setNome("marcelo");
        pesquisador.setSenha("senha");
        PesquisadorService pesquisadorService = new PesquisadorService();
        Pesquisador retorno = pesquisadorService.ListarPorUsuarioSenha(pesquisador);
        if(retorno == null){
            System.out.println("Usuario invalido");
        } else {
            System.out.println("Usuario valido");
        }
//        try {
//            Pesquisador pesquisador = new Pesquisador();
//            pesquisador.setNome("marcelo");
//            pesquisador.setSenha("senha");
//            PesquisadorService pesquisadorService = new PesquisadorService();
//            pesquisadorService.salvar(pesquisador);
//        } catch (DataAccessException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
           System.out.println("Fim  Teste Persistir Arquivo");
//        try {
//            ArquivoService arquivoService = new ArquivoService();
//            Arquivo arquivo = new Arquivo();
//            arquivo.setNome("via service");
//            arquivo.setTipo("tipo service");
//            arquivoService.salvar(arquivo);
//
//            for(Arquivo arq:arquivoService.listarTodos()){
//                System.out.println("Nome: " + arq.getNome());
//            }
//        } catch (DataAccessException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//////        try {
//////            System.out.println("Inicio Teste Persistir Arquivo");
//////            ArquivoService arquivoService = new ArquivoService();
//////            Arquivo arquivo = new Arquivo();
//////            arquivo.setId(Long.valueOf(1));
//////            arquivo.setNome("nome do arquivo");
//////            arquivo.setTipo("tipo do arquivo ");
//////            arquivo.setDescricao("Descrição do arquivo");
//////            arquivoService.salvar(arquivo);
//////        } catch (DataAccessException ex) {
//////            System.out.println("Erro........................................ \n" + ex.getMessage() );
//////            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//////        }
////        PesquisadorService pesquisadorService = new PesquisadorService();
////        Pesquisador pesquisador = new Pesquisador();
////        pesquisador.setNome("marcelo");
////        pesquisador.setSenha("senha");
////        System.out.println("Login: " + pesquisadorService.LoginValido(pesquisador));
//        HibernateUtil.openSession();
//        HibernateUtil.currentSession().getTransaction().begin();
////        System.out.println("Inicio Teste Persistir Arquivo");
////        PesquisadorService pesquisadorService = new PesquisadorService();
////        Pesquisador pesquisador = new Pesquisador();
////        pesquisador.setNome("marcelo");
////        pesquisador.setSenha("senha");
////        pesquisador.setId(Long.valueOf(10));
////        pesquisador.setFone("ffffff");
////
////        System.out.println("Login: " + pesquisadorService.LoginValido(pesquisador));
//        PesquisadorDao pesquisadorDao = new PesquisadorDaoJPA();
//try {
//
//            pesquisadorDao.salvar(pesquisador);
//        } catch (DataAccessException ex) {
//            System.out.println(ex.getCause() + "Erro ao salvar.................................");
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
////       HibernateUtil.openSession();
////        Arquivo arquivo = new Arquivo();
////        //arquivo.setId(Long.valueOf(2));
////        arquivo.setNome("marcelo4 gomes");
////        arquivo.setTipo("txt");
////        ArquivoDao arquivoDao = new ArquivoDaoJPA();
////
////        HibernateUtil.currentSession().getTransaction().begin();
////        try {
////            arquivoDao.salvar(arquivo);
////        } catch (DataAccessException ex) {
////            System.out.println("Erro ao salvar.................................");
////            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
////        }
//        try {
//            org.hibernate.criterion.MatchMode hibernateMatchMode = org.hibernate.criterion.MatchMode.ANYWHERE;
//            List<Arquivo> arquivos = arquivoDao.listarPorModelo(arquivo, MatchMode.ANYWHERE, "nome", "tipo");
//            for(Arquivo arq:arquivos){
//                System.out.println("Nome: " + arq.getNome() );
//            }
//        } catch (DataAccessException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
////
////        HibernateUtil.currentSession().getTransaction().commit();
////        HibernateUtil.closeCurrentSession();



    }

}
