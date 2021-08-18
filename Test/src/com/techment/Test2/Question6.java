package com.techment.Test2;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
		System.out.println("Age should be above 15");
	}
}

@SuppressWarnings("serial")
class InvalidNameException extends Exception
{
	public InvalidNameException()
	{
		System.out.println("Name should not be less than 3 characters.");
	}
}

class Person
{
	private int id;
	private String name;
	private int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class Question6 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Person's ID: ");
			int id = scanner.nextInt();
			System.out.print("Enter the Person's Name: ");
			String name = scanner.next();
			if(name.length() <= 3)
				throw new InvalidNameException();
			System.out.println("Enter the Person's Age: ");
			int age = scanner.nextInt();
			if(age <= 15)
			{
				throw new InvalidAgeException();
			}
				
			Person person = new Person(id, name, age);
		
			System.out.println(person.toString());
			scanner.close();
		}catch(InvalidAgeException iae)
		{
			iae.getMessage();
		}catch(InvalidNameException ine)
		{
			ine.getMessage();
		}
		
		
		
	}

}
