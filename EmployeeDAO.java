package com.anindya.hibernetexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by jcon928 on 5/31/2017.
 */
public class EmployeeDAO {
    private static Transaction trans = null;
    private static Session session  = null;
    private static SessionFactory sessionFactory = null;

    public void addEmployee(Employee employee){

        try
        {
            sessionFactory = HibernateSessionFactory.createSessionFactory();
            session = sessionFactory.openSession();
            trans = session.beginTransaction();

            session.save(employee);

            System.out.println("Student got succesfully created..with id"+employee.getEmployeeID()+employee.getEmployeeID());

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

    public void deleteEmployee(int empId){
        try
        {
            sessionFactory = HibernateSessionFactory.createSessionFactory();
            session = sessionFactory.openSession();
            trans = session.beginTransaction();

            Employee employee = (Employee) session.load(Employee.class, new Integer(empId));

            session.delete(employee);

            System.out.println("Student Deleted succesfully ");

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

    public void updateEmployee(Employee employee){
        try
        {
            sessionFactory = HibernateSessionFactory.createSessionFactory();
            session = sessionFactory.openSession();
            trans = session.beginTransaction();

            session.update(employee);

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
