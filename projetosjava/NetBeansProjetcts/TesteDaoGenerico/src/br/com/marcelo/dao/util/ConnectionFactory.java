/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.dao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author marcelo
 */

public class ConnectionFactory {

    @PersistenceUnit(unitName = "TesteDaoGenericoPU")
    private EntityManagerFactory emf;

    public EntityManager getEntityManager(){
        return Persistence.createEntityManagerFactory("JPAGenericoPU").createEntityManager();

    }

}
