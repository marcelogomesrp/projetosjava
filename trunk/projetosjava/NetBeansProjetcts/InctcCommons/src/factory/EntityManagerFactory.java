/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Session;
/**
 *
 * @author marcelo
 */
public class EntityManagerFactory {
	private static final String PERSISTENCE_UNIT = "InctcCommonsPU";

	private static EntityManager entityManager = null;

	public static EntityManager getInstance() {

		if(entityManager == null) {

			entityManager = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT).createEntityManager();
		}

		return entityManager;
	}

	public static Session getSession() {

		return (Session)entityManager.getDelegate();
	}

}
