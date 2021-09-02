package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataInBulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select p from Product p");
		
		List<Product> list = (List<Product>) query.getResultList();
		
		System.out.println("Name\t\tPrice\t\tCategory");
		
		for(Product p : list)
		{
			System.out.println(p.getName()+"\t\t"+p.getPrice()+"\t\t"+p.getCategory());
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
