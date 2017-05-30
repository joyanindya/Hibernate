package com.anindya.hibernetexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersistEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SessionFactory sessionFactory = null;
		try
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		
		}catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("failed to create the Configuration and session factory");
		}*/

		Transaction trans = null;
		Session session  = null;
		SessionFactory sessionFactory = null;
		
		try
		{
			sessionFactory = HibernateSessionFactory.createSessionFactory();
			session = sessionFactory.openSession();
			trans = session.beginTransaction();
		
		Employee em1 = new Employee();
			em1.setEmployeeName("Anindya");
			em1.setEmployeeSalary(3000);

			Employee em2 = new Employee();
			em2.setEmployeeName("Rajarshi");
			em2.setEmployeeSalary(4000);
		
		session.save(em1);
			session.save(em2);
		
		System.out.println("Student got succesfully created..with id"+em1.getEmployeeID()+em2.getEmployeeID());
		
		trans.commit();
		}catch(Exception ex)
		{
			trans.rollback();
			ex.printStackTrace();
		}finally{

			session.close();
			sessionFactory.close();
		}
		
	}

}
