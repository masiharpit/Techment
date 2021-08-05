package com.techment.logic_building_exercises;

import java.util.ArrayList;
import java.util.List;

class Product{
	private int id;
	private float price;
	private String name;
	
	Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void details() {
		System.out.println("ID: "+id+"\nName: "+name+"\nPrice: "+price);
	}
	
}

class Products{
	List<Product> productDB = new ArrayList<Product>();
	
	public boolean add(Product p) {
		return productDB.add(p);
	}
	
	public String ProductDetails(int id) {
		String details = null;
		for(Product p : productDB) {
			if(p.getId() == id) {
				details="Details of the Product: "+id+" is: "+p.getName()+" and it's Price is"+p.getPrice(); 
			}
		}
		return details;
	}
	
	public Product[] list() {
		Product[] product = new Product[productDB.size()];
		for(int i=0; i<productDB.size(); i++) {
			product[i] = productDB.get(i);
		}
		return product;
	}
	
}

public class Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "ParleG", 5);
		Product product2 = new Product(2, "Tiger", 5);
		Product product3 = new Product(3, "50-50", 10);
		
		Products products = new Products();
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		
		System.out.println(products.ProductDetails(3));
		for(Product p : products.list()) {
			p.details();
		}
	}

}
