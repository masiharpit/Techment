package com.techment.Iterator;

import java.util.ArrayList;

class Employee
{
	int id;
	String name;
	String dept;
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1, "Joe", "Process Executive");
		Employee emp2 = new Employee(2, "Steve", "HR");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee(3, "Karl", "IT Consultant"));
		
		for(Employee emp : employees)
		{
			System.out.println("ID: "+emp.id+"\nName: "+emp.name+"\nDepartment: "+emp.dept);
		}
		
		for(Employee emp: employees)
		{
			if(emp.getId()>2)
			{
				employees.set(2, )
			}
		}
	}

}
