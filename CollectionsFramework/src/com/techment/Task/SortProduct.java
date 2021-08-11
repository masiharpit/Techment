package com.techment.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product
{
	int id;
	String name;
	int price;
	int quantity;
	
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
}

class ProductQuantity implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.quantity==o2.quantity)
				return 0;
			else if(o1.quantity<o2.quantity)
				return 1;
			else
				return -1;
	}
	
}

class PriceSorting implements Comparator<Product>
{

	public int compare(Product o1, Product o2) {
		if(o1.price==o2.price)
			return 0;
		else if(o1.price>o2.price)
			return 1;
		else
			return -1;
	}
	
}

public class SortProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(new Product(1789, "ParleG", 10, 50));
		product.add(new Product(4789, "Vicco Tumeric", 48, 25));
		product.add(new Product(8756, "MDH Masale", 55, 45));
		product.add(new Product(4574, "Kismi", 1, 105));
		
		for(Product p : product)
		{
			System.out.println(p.toString());
		}
		
		System.out.println("");
		System.out.println("---------------Price of Products above 50:-------------------");
		for(Product p : product)
		{
			if(p.price > 50)
				System.out.println(p.toString());
		}
		System.out.println("");
		Collections.sort(product, new ProductQuantity());
		System.out.println("------------------Quantity of the Products from High to Low:---------------------------");
		for(Product p : product)
		{
			System.out.println(p.toString());
		}
		System.out.println("");
		Collections.sort(product, new PriceSorting());
		System.out.println("----------------------Price of the Products from Low to High:------------------------");
		for(Product p: product)
		{
			System.out.println(p.toString());
		}
	}

}
