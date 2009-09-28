/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package commons.dao.jpa;

import commons.dao.PesquisadorDao;
import negocio.modelo.Pesquisador;

/**
 *
 * @author marcelo
 */
public class PesquisadorDaoJPA  extends DaoGenericoJPA<Pesquisador, Long> implements PesquisadorDao{

    public PesquisadorDaoJPA() {
        super(HibernateUtil.currentSession());
    }

}
