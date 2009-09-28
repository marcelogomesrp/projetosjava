/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.service;

import br.usp.fmrp.dao.TrabalhoDao;
import br.usp.fmrp.dao.impl.TrabalhoDaoImpl;
import br.usp.fmrp.entidades.Trabalho;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author marcelo
 */
public class TrabalhoService {
    TrabalhoDao trabalhoDao;

    public TrabalhoService() {
        this.trabalhoDao = new TrabalhoDaoImpl();
    }

    public Collection<Trabalho> findAll() throws Exception{
        //return this.trabalhoDao.findAll();
    Trabalho tb = new Trabalho();
    TreeSet<Trabalho> tbs = new TreeSet<Trabalho>();
    for(Trabalho trabalho:this.trabalhoDao.findAll()){
        tbs.add(trabalho);
    }

    List<Trabalho> lista = new ArrayList(tbs);

    return lista;


    }

    public Integer getQuantidadeDeInscritos() throws Exception{
        return this.trabalhoDao.findAll().size();
    }
    public Collection<Trabalho> listTrabalhosbyMemberId(Integer member_id) {
        return this.trabalhoDao.listTrabalhobyMemberId(member_id);
    }

    public Trabalho atualizarTrabalho(Trabalho trabalho) throws Exception{
        Trabalho retorno = this.trabalhoDao.atualizar(trabalho);
        return retorno;
    }


}
