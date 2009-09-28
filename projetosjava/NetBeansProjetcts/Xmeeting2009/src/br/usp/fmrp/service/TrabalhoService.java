/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.service;

import br.usp.fmrp.dao.TrabalhoDao;
import br.usp.fmrp.dao.impl.TrabalhoDaoImpl;
import br.usp.fmrp.entidades.Trabalho;
import java.util.Collection;

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
        return this.trabalhoDao.findAll();
    }

    public Integer getQuantidadeDeInscritos() throws Exception{
        return this.trabalhoDao.findAll().size();
    }


}
