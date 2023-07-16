package com.Assesment3;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		
		transaction = session.beginTransaction();
		String name="Kritidha";
		int salary=9000;
		int id=1;
		String hql = String.format("insert into Employee(ID,NAME,SALARY)values(1,'Kritidha',9000)");
		Query query = session.createSQLQuery(hql);
		//String hql2=String.format("alter table employee add Emp_JoiningDate date ");
		//Query alter=session.createQuery(hql2);
		if(salary>5000) {
		query.executeUpdate();
		System.out.println("Data Inserted Successfully...");
		//alter.executeUpdate();
		}
		else {
		System.out.println("Salary less than 5000...");
		}
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		}
	}

    

