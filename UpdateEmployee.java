package com.anindya.hibernetexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by jcon928 on 5/30/2017.
 */
public class UpdateEmployee {

    public static void main(String[] args) {

        Transaction trans = null;
        Session session  = null;
        SessionFactory sessionFactory = null;
        try
        {
            sessionFactory = HibernateSessionFactory.createSessionFactory();
            session = sessionFactory.openSession();
            trans = session.beginTransaction();

            Employee employee = (Employee) session.load(Employee.class, 2);
            employee.setEmployeeName("Sayan");
            employee.setEmployeeSalary(5000);

            //session.update(st);

            System.out.println("Student updated succesfully ");

            trans.commit();
        }catch(Exception ex)
        {
            trans.rollback();
            ex.printStackTrace();
        }
        finally{

            session.close();
            sessionFactory.close();
        }


    }
}
