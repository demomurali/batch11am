package com.hibernatedemo.simpleHibernateProject;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	
	private static SessionFactory sessionFactory;
	
	static {
			try {
			
				StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
						.configure().build();
				sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
			} catch (Throwable ex) {
						throw new ExceptionInInitializerError(ex);
				}
			}

		public static SessionFactory getSessionFactory() {
					// Alternatively, you could look up in JNDI here
				return sessionFactory;
		}

			public static void shutdown() {
					// Close caches and connection pools
				getSessionFactory().close();
			}
}