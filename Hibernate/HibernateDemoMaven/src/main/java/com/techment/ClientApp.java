package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Jeff");
		employee.setDept("CEO");
		
		session.persist(employee);
		System.out.println("Data Inserted");
		tx.commit();
	}

}
