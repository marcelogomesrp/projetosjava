/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.dao;


import br.usp.fmrp.entidades.Paper;
import java.util.List;

/**
 *
 * @author marcelo
 */
public interface PaperDao  extends DaoGenerico<Paper, Integer>{
    public List<Paper> listPaper(Integer member_id);

}
