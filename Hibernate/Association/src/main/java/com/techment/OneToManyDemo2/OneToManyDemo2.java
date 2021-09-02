package com.techment.OneToManyDemo2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employees employee1 = new Employees("Kim", "Team Leader");
		Employees employee2 = new Employees("Jinping", "Manager");
		
		em.persist(employee1);
		em.persist(employee2);
		
		List<Employees> list = new ArrayList<Employees>();
		list.add(employee1);
		list.add(employee2);
		
		Department department = new Department();
		department.setName("Product & Engineering");
		department.setEmployees(list);
		
		em.persist(department);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
