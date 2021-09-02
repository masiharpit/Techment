package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Product product = em.find(Product.class, 2);
		
		System.out.println("ID: "+product.getId());
		System.out.println("Name: "+product.getName());
		System.out.println("Price: "+product.getPrice());
		
		em.close();
		emf.close();
	}

}
