/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.service;

import br.usp.fmrp.dao.Member1Dao;
import br.usp.fmrp.dao.impl.Member1DaoImpl;
import br.usp.fmrp.entidades.Member1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author marcelo
 */
public class Member1Service {
    Member1Dao participanteDao;

    public Member1Service() {
        this.participanteDao = new  Member1DaoImpl();
    }

    public Collection<Member1> findAll() throws Exception{

    Member1 mb = new Member1();
    TreeSet<Member1> mbs = new TreeSet<Member1>();
    for(Member1 member1:this.participanteDao.findAll()){
        mbs.add(member1);
    }

    List<Member1> lista = new ArrayList(mbs);

    return lista;



    //    return  this.participanteDao.findAll();
        
    }

    public Integer getQuantidadeDeInscritos() throws Exception{
        return this.participanteDao.findAll().size();
    }

    public Member1 findById(Integer id) throws Exception{
        return this.participanteDao.findById(id);
    }


    public Member1 atualiza(Member1 member1) throws Exception{
        return this.participanteDao.atualizar(member1);
    }



}
