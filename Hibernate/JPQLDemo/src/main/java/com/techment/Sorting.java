package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query1 = em.createQuery("Select p from Product p order by p.price desc");
		List<Product> list = query1.getResultList();
		
		System.out.println("ID\t\tName\t\tPrice\t\tcategory");
		
		for(Product p : list)
		{
			System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getPrice()+"\t\t"+p.getCategory());
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
