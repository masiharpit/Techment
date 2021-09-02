package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Product product = em.find(Product.class, 1);
		System.out.println("ID: "+product.getId());
		System.out.println("Name: "+product.getName());
		System.out.println("Price: "+product.getPrice());
		
		product.setPrice(175000);
		
		System.out.println("ID: "+product.getId());
		System.out.println("Name: "+product.getName());
		System.out.println("Price: "+product.getPrice());
		
		em.persist(product);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
