/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.service;

import commons.dao.ArquivoDao;
import commons.dao.DataAccessException;
import commons.dao.jpa.ArquivoDaoJPA;
import commons.dao.jpa.HibernateUtil;
import java.util.List;
import negocio.modelo.Arquivo;

/**
 *
 * @author marcelo
 */
public class ArquivoService {
    private ArquivoDao arquivoDao;

    public ArquivoService() {
        HibernateUtil.openSession();
        this.arquivoDao = new ArquivoDaoJPA();
    }

    public String salvar(Arquivo arquivo) throws DataAccessException{
        //HibernateUtil.openSession();
        HibernateUtil.currentSession().getTransaction().begin();
        this.arquivoDao.salvar(arquivo);
        HibernateUtil.currentSession().getTransaction().commit();
        //HibernateUtil.closeCurrentSession();
        return "sucesso";

    }

    public List<Arquivo> listarTodos() throws DataAccessException{
        //HibernateUtil.openSession();
        List<Arquivo> arquivos = this.arquivoDao.listarTodos();
        //HibernateUtil.closeCurrentSession();
        return arquivos;
    }



}
