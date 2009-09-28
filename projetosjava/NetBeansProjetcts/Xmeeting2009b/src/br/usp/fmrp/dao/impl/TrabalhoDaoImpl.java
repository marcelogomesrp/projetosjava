/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.dao.impl;

import br.usp.fmrp.dao.TrabalhoDao;
import br.usp.fmrp.entidades.Trabalho;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marcelo
 */
public class TrabalhoDaoImpl  extends DaoGenericoImpl<Trabalho, Long> implements TrabalhoDao{

    public Collection<Trabalho> listTrabalhobyMemberId(Integer member_id) {
        List<Trabalho> trabalhos = null;
         Map<String, Object> params = new HashMap<String, Object>();
         params.put("memberId", member_id);
         trabalhos = (List<Trabalho>) this.pesqParam("SELECT t FROM Trabalho t WHERE t.memberId = :memberId", params);
        return trabalhos;
    }

}
