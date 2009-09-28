/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package commons.dao.jpa;

import factory.EntityManagerFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author marcelo
 */
public class HibernateUtil {
	private static Logger logger = Logger.getLogger(HibernateUtil.class.getName());

	private static SessionFactory sessionFactory;

	private static ThreadLocal<Session> sessions = new ThreadLocal<Session>();

	static {

		sessionFactory = ((Session)EntityManagerFactory.getInstance().getDelegate()).getSessionFactory();
	}

	public static Session openSession() {

		if(sessions.get() != null) {

			logger.log(Level.SEVERE, "Já há alguma session para essa thread aberta!");
		}

		sessions.set(sessionFactory.openSession());

		return sessions.get();
	}

	public static void closeCurrentSession() {

		if(sessions.get() != null) {

			sessions.get().close();
			sessions.set(null);
		}
	}

	public static Session currentSession() {

		return sessions.get();
	}

	public static void roolbackCurrentSession() {

		if(currentSession() != null && currentSession().getTransaction() != null && currentSession().getTransaction().isActive()) {

			currentSession().getTransaction().rollback();
		}
	}
}