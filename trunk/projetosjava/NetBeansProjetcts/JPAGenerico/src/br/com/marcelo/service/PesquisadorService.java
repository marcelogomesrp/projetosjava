/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.service;

import br.com.marcelo.dao.PesquisadorDao;
import br.com.marcelo.dao.imp.PesquisadorDaoImp;
import br.com.marcelo.entities.Pesquisador;

/**
 *
 * @author marcelo
 */
public class PesquisadorService {
    private PesquisadorDao pesquisadorDao = null;

    public PesquisadorDao getPesquisadorDao() {
        if(this.pesquisadorDao == null){
            this.pesquisadorDao = new PesquisadorDaoImp();
        }
        return pesquisadorDao;
    }

    public Pesquisador salvar (Pesquisador pesquisador) throws Exception{
        this.pesquisadorDao = new PesquisadorDaoImp();
        return this.pesquisadorDao.salvar(pesquisador);
    }



}
