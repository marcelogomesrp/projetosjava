/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.dao.impl;

import br.usp.fmrp.dao.PaperDao;
import br.usp.fmrp.entidades.Paper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marcelo
 */
public class PaperDaoImpl  extends DaoGenericoImpl<Paper, Integer> implements PaperDao{

    public List<Paper> listPaper(Integer member_id) {
        List<Paper> papers = null;
         Map<String, Object> params = new HashMap<String, Object>();
         params.put("memberId", member_id);
         papers = (List<Paper>) this.pesqParam("SELECT p FROM Paper p WHERE p.memberId = :memberId ORDER BY p.filename", params);
        return papers;
    }

}
