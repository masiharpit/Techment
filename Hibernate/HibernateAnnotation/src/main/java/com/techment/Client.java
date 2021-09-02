package com.techment;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		student.setStudentId(1);
		student.setName("Arpit");
		student.setBranch("Computer Science");
		
		session.persist(student);
		System.out.println("Data Inserted");
		tx.commit();
	}

}
