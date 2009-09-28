/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package commons.dao.jpa;

import commons.dao.ArquivoDao;
import negocio.modelo.Arquivo;




/**
 *
 * @author marcelo
 */
public class ArquivoDaoJPA  extends DaoGenericoJPA<Arquivo, Long> implements ArquivoDao{

    public ArquivoDaoJPA() {
        super(HibernateUtil.currentSession());
    }



}

