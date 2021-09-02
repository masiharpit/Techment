package com.techment.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Course java = new Course(181, "Java", 4);
		Course python = new Course(346, "Python", 2);
		Course golang = new Course(899, "Golang", 3);
		
		em.persist(java);
		em.persist(python);
		em.persist(golang);
		
		List<Course> list = new ArrayList<Course>();
		list.add(java);
		list.add(python);
		list.add(golang);
		
		Student student = new Student();
		student.setId(111);
		student.setName("Brian");
		student.setCourse(list);
		
		em.persist(student);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
