package com.gauri.example.HibernateOnetoMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gauri.example.HibernateOnetoMany.model.*;
import com.utility.HibernateUtil;


public class App 
{
    public static void main(String[] args) 
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		try 
		{
		  Department department=new Department();
		  department.setName("CSE");
		  
		  Employee2 employee1=new Employee2();
		  employee1.setName("Gauri");
		  employee1.setDepartment(department);
		  
		  Employee2 employee2=new Employee2();
		  employee2.setName("Unnati");
		  employee2.setDepartment(department);
		 
		  department.getEmployees().add(employee1);
		  department.getEmployees().add(employee2);
		  
		  session.beginTransaction();
		  session.save(department);
		  session.getTransaction().commit();
		}
		finally 
		{
			session.close();
            sessionFactory.close();
		}
	}
}