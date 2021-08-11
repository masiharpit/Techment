package com.techment.logic_building_exercises;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

class Product1
{
	int id;
	String name;
	float price;
	
	public Product1(int id, String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println(id + " " +name+" "+price);
	}
}
public class Exercise47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int id;
		String name;
		float price;
		int count = 0;
		ArrayList<Product1> products = new ArrayList<Product1>();
		do
		{
			System.out.println("Enter the Product ID: ");
			id = scanner.nextInt();
			System.out.println("Enter the Product Name: ");
			name = scanner.next();
			System.out.println("Enter the Product Price: ");
			price = scanner.nextFloat();
			
			products.add(new Product1(id, name, price));
			count++;
		}while(count<2);
		
		Iterator<Product1> itr = products.iterator();
		while(itr.hasNext())
		{
			itr.next().display();
		}
		scanner.close();
	}

}
