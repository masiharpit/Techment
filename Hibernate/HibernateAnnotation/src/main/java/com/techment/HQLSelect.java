package com.techment;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class HQLSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration  = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<Student> query = session.createQuery("Select s from Student s");
		List<Student> studentList = query.list();
		
		studentList.forEach(System.out::println);
		System.out.println("===========================================================================");
		studentList.forEach(s-> System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getBranch()));
		
		System.out.println(" ============================================ ");
		System.out.println("Select only specific column");
		
		Query<Student> query2 = session.createQuery("select s.studentId, s.name from Student s");
		List<Student> students = query2.list();
		
//		students.forEach(System.out::println);
		
//		students.forEach(s->System.out.println(s.getStudentId()+" "+s.getName()));
		Iterator itr = students.iterator();

		while(itr.hasNext())
		{
			Object o[] = (Object[])itr.next();
			System.out.println(o[0] + " "+ o[1]);
		}		
		session.close();
		sessionFactory.close();
	}

}
