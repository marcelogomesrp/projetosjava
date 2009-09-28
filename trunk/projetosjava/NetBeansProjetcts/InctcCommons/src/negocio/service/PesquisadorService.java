/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.service;

import commons.dao.DaoGenerico.MatchMode;
import commons.dao.DataAccessException;
import commons.dao.PesquisadorDao;
import commons.dao.jpa.HibernateUtil;
import commons.dao.jpa.PesquisadorDaoJPA;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.modelo.Pesquisador;

/**
 *
 * @author marcelo
 */
public class PesquisadorService {


    public PesquisadorService() {

    }

    public Pesquisador ListarPorUsuarioSenha(Pesquisador pesquisador) {
        HibernateUtil.openSession();
       // HibernateUtil.currentSession().getTransaction().begin();
        PesquisadorDao pesquisadorDao = new PesquisadorDaoJPA();
        try {
            List<Pesquisador> pesquisadores = pesquisadorDao.listarPorModelo(pesquisador, MatchMode.EXAT, "fone", "email");
            if(pesquisadores.size() > 0 ){
                return pesquisadores.get(0);
            }
        } catch (DataAccessException ex) {
            Logger.getLogger(PesquisadorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        //HibernateUtil.currentSession().getTransaction().commit();
        HibernateUtil.closeCurrentSession();
        return null;
    }

    public Pesquisador salvar(Pesquisador pesquisador) throws DataAccessException{
        HibernateUtil.openSession();
        HibernateUtil.currentSession().getTransaction().begin();
        PesquisadorDao pesquisadorDao = new PesquisadorDaoJPA();
        Pesquisador retorno = null;
        retorno =  pesquisadorDao.salvar(pesquisador);
        HibernateUtil.currentSession().getTransaction().commit();
        HibernateUtil.closeCurrentSession();
        return retorno;
    }

    public List<Pesquisador> listarTodos() throws DataAccessException{
        HibernateUtil.openSession();
        PesquisadorDao pesquisadorDao = new PesquisadorDaoJPA();
        List<Pesquisador> arquivos = pesquisadorDao.listarTodos();
        HibernateUtil.closeCurrentSession();
        return arquivos;
    }


}
