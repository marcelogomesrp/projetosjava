/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.dao;


import br.usp.fmrp.entidades.Trabalho;
import java.util.Collection;

/**
 *
 * @author marcelo
 */
public interface TrabalhoDao  extends DaoGenerico<Trabalho, Long>{
    public Collection<Trabalho> listTrabalhobyMemberId(Integer member_id);
}
