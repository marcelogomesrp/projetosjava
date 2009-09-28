/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marcelo.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author marcelo
 */
public class ConnectionFactory {
    
    public EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("IventarioCommonsPU").createEntityManager();
    }
}
