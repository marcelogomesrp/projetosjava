/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.service;

import br.usp.fmrp.dao.PaperDao;
import br.usp.fmrp.dao.impl.PaperDaoImpl;
import br.usp.fmrp.entidades.Paper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

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
        //return this.paperDao.findAll();

    Paper pp = new Paper();
    TreeSet<Paper> pps = new TreeSet<Paper>();
    for(Paper paper:this.paperDao.findAll()){
        pps.add(paper);
    }

    List<Paper> lista = new ArrayList(pps);

    return lista;


    }

    public Integer getQuantidadeDePaper() throws Exception{
        return this.paperDao.findAll().size();
    }

    public Collection<Paper> listPaperbyMemberId(Integer member_id) {
        return this.paperDao.listPaper(member_id);
    }



}
