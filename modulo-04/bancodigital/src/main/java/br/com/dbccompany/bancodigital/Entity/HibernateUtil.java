package br.com.dbccompany.bancodigital.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	private static final Session session;
	
	static {
		
		try {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
		} catch ( Throwable e ) {
			System.err.println("Faiou" + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static Session getSession() {
		return session;
	}
	
	public static boolean beginTransaction() {
		Transaction transaction = session.getTransaction();
		if (transaction == null || !transaction.isActive()) {
			transaction = session.beginTransaction();
			return true;
		}
		return false;
	}
}
