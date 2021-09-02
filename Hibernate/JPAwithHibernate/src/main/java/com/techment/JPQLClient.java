package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class JPQLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("Select p from Product p");
		
		List<Product> products = query.getResultList();
		
		for(Product p: products)
		{
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
		}
		
		Query query2 = em.createQuery("select p.id from Product p");
		List<Integer> ids = query2.getResultList();
		
		for(Integer i: ids)
		{
			System.out.println(i);
		}
		
		em.close();
		emf.close();
	}

}
