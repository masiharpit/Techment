package com.techment;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectUsingWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query qry = session.createQuery("Select s from Student s where s.branch=:x");
		qry.setParameter("x", "Computer Science");
		
		List<Student> list = qry.getResultList();
		list.forEach(s->System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getBranch()));
		
		session.close();
		
	}

}
