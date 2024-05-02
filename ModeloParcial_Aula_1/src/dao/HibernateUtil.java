package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		try {
			if(sessionFactory == null) {
				StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("mapeos/Hibernate.cfg.xml").build();
				Metadata metadata = new MetadataSources().buildMetadata(serviceRegistry);
				sessionFactory = metadata.buildSessionFactory();
			}
		} catch (HibernateException he) {
			throw he;
		}
		return sessionFactory;
	}
}
