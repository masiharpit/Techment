package com.techment.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Branch branch = new Branch(555, "CSE");
		em.persist(branch);
		
		Students student1 = new Students(101, "Arpit", branch);
		Students student2 = new Students(102, "Jeffin", branch);
		Students student3 = new Students(103, "Aniketh", branch);
		Students student4 = new Students(104, "Ayush", branch);
		
		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		em.persist(student4);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
