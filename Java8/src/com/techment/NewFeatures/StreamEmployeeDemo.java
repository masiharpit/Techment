package com.techment.NewFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee 
{
	private int id;
	private String name;
	private String dept;
	private int salary;
	private int age;
	
	public Employee(int id, String name, String dept, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
}
public class StreamEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Arpit", "Development", 20000, 24));
		employee.add(new Employee(2, "Divya", "Development", 20000, 24));
		employee.add(new Employee(3, "Katyayani", "Development", 20000, 24));
		employee.add(new Employee(4, "Navin", "Development", 20000, 24));
		employee.add(new Employee(5, "Gitika", "Development", 20000, 24));
		
		employee.stream().forEach(s->System.out.println(s));
		// Count number of Employees
		Long empcount = employee.stream().count();
		System.out.println("Total number of employee are: "+empcount);
		
		
		// Count number of employees in Development Department 
		Long devCount = employee.stream().filter(e->e.getDept().equals("Development")).count();
		System.out.println("Developer count: "+devCount);
		
		
		// Show the Employees of Development Department only
		employee.stream().filter(e->e.getDept().equals("Development")).forEach(s->System.out.println("Name of Developer: "+s.getName()));
		
		
		//Show the Employees of Development Department only using Collectors.toList()
		List<Employee> emp= employee.stream().filter(e->e.getDept().equals("Development")).collect(Collectors.toList());
		System.out.println(emp);
		
		
		//
		StreamEmployeeDemo obj = new StreamEmployeeDemo();
		List<Employee> empDept = obj.filterByDept(employee, "Development");
		System.out.println(empDept);
		
		
		
		
	}
	
	List filterByDept(ArrayList<Employee> empList, String dept)	
	{
		return empList.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		
	}

	

}
