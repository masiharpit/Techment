package com.techment;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RetrieveDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<Student> query = session.createQuery("Select s.studentId, s.name from stu s");
		List<Student> st= query.list();
		
		for(Student stu: st)
		{
//			Student stu = (Student) s;
//			System.out.println(stu.getStudentId()+ " "+stu.getName());
			System.out.println(stu);
		}
	}

}
