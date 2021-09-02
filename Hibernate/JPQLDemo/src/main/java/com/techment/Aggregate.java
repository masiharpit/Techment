package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Aggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query1 = em.createQuery("Select count(p) from Product p");
		System.out.println("Total Count of Products:" +query1.getSingleResult());
		
		Query query2 = em.createQuery("Select max(p.price) from Product p");
		System.out.println("Highest Price Product: "+query2.getSingleResult());
		
		Query query3 = em.createQuery("Select min(p.price) from Product p");
		System.out.println("Lowest Price Product: "+query3.getSingleResult());
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
