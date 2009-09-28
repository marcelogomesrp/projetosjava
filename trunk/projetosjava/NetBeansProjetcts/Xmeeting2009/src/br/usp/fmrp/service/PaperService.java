/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.service;

import br.usp.fmrp.dao.PaperDao;
import br.usp.fmrp.dao.impl.PaperDaoImpl;
import br.usp.fmrp.entidades.Paper;
import java.util.Collection;

/**
 *
 * @author marcelo
 */
public class PaperService {
    PaperDao paperDao;

    public PaperService() {
        this.paperDao = new PaperDaoImpl();
    }

    public Collection<Paper> findAll() throws Exception{
        return this.paperDao.findAll();
    }

    public Integer getQuantidadeDePaper() throws Exception{
        return this.paperDao.findAll().size();
    }



}
