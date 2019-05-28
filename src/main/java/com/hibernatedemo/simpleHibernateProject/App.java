package com.hibernatedemo.simpleHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	private static User getUser(int userId){
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		User user=session.get(User.class, 1001);
		return user;
	}
	
	
	private static void insertUser(User user){
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
	
	private static void updateUser(User user){
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.update(user);
		tx.commit();
		session.close();
	}
	
	
	private static void deleteUser(User user){
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.delete(user);
		tx.commit();
		session.close();
	}
	
    public static void main( String[] args )
    {
    	 User user=new User();
    	    user.setUserId(1001);
    	    user.setName("ramesh");
    	    user.setAddresss("cheenai");
    	
    	    //insertUser(user);
    	    
    	    user.setName("suresh");
    	    //updateUser(user);
    	    deleteUser(user);
    	    
    	    
    	    //eate a StandardServiceRegistry, 
    //Build a Metadata object and 
    //Instantiate a SessionFactory.
    
    // bootstrap the application
    // configuration
    // singleton
    // sessionFactory ---> Database
    // connection pooling
    
    // session ---> Connection
    
    
    }
}
