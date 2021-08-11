package com.techment.Map;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int age;
	
	
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.age == o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
		else 
			return -1;
	}
	
	
}
public class UserdefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Bob", "IT", 32));
		employee.add(new Employee(1, "Catre", "Operations", 26));
		employee.add(new Employee(1, "Steve", "Product and Engineering", 34));
		employee.add(new Employee(1, "Hasley", "HR", 25));
		
		System.out.println("Before Sorting: ");
		for(Employee emp : employee)
		{
			System.out.println(emp.toString());
		}
		
		Collections.sort(employee);
		System.out.println("After Sorting: ");
		for(Employee emp: employee)
		{
			System.out.println(emp.toString());
		}
	}
	

}
