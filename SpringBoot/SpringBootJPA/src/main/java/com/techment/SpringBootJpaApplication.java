package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner{

	@Autowired
	IProductDao iProductDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello this is my first spring boot application.");
//		
//		Product product1 = new Product("Laptop", "Electronics", 75000);
//		Product product2 = new Product("OnePlus", "Electronics", 54999);
//		
//		iProductDao.save(product1);
//		iProductDao.save(product2);
		
		System.out.println("Inserted.");
		
		List<Product> products = iProductDao.findAll();
		products.forEach(System.out::println);
		
		Optional<Product> product = iProductDao.findById(30);
		if(product.isPresent())
		{
			System.out.println(product.get());
		}else
		{
			System.out.println("No value with the given id.");
		}
		
		Product product3 = iProductDao.findById(2).get();
		System.out.println(product3);
		
		long totalProduct = iProductDao.count();
		System.out.println(totalProduct);
		
//		iProductDao.deleteById(3);
//		System.out.println("Deleted.");
		
		try {
		if(iProductDao.existsById(4))
		{
			System.out.println("ID is present.");
//			iProductDao.deleteById(4);
		}
		}catch(Exception e)
		{
			System.out.println("No value with the given ID.");
		}
		
		List<Product> prod = iProductDao.findByName("OnePlus");
		System.out.println(prod);
		
		List<Product> prod2 = iProductDao.findByCategory("Electronics");
		System.out.println(prod2);
		
		
	}

}
