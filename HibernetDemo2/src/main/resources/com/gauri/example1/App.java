package com.gauri.example1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gauri.example1.Car1;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	Configuration configuration=new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory factory=configuration.buildSessionFactory();
   	    Session session =factory.openSession();
   	    Transaction tx=session.beginTransaction();
   	
 	Car1 obj=new Car1();
			obj.setId(3);
			obj.setCarName("Toyota");
			obj.setCost(97546.5);
			
			session.save(obj);
			tx.commit();
			session.close();
			
    }	
}