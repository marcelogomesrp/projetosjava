package br.com.guaraba.wally.core.factories;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Session;

public class EntityManagerFactory {

	private static final String PERSISTENCE_UNIT = "guaraba-wally-persistence-unit";
	
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