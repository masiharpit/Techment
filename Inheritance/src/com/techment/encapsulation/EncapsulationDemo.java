package com.techment.encapsulation;

class Employee{
	int id;
	String name;
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
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.id = 1;
		emp.name = "Sachin";
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		
		emp.setId(2);
		emp.setName("Virat");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
	}

}
