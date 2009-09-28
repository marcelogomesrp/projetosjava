/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.service;

import br.usp.fmrp.dao.ParticipanteDao;
import br.usp.fmrp.dao.impl.ParticipanteDaoImpl;
import br.usp.fmrp.entidades.Participante;
import java.util.Collection;

/**
 *
 * @author marcelo
 */
public class ParticipanteService {
    ParticipanteDao participanteDao;

    public ParticipanteService() {
        this.participanteDao = new  ParticipanteDaoImpl();
    }

    public Collection<Participante> findAll() throws Exception{
        return this.participanteDao.findAll();
    }

    public Integer getQuantidadeDeInscritos() throws Exception{
        return this.participanteDao.findAll().size();
    }



}
