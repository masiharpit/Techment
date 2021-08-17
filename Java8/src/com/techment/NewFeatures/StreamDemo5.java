package com.techment.NewFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Arpit", "Development", 20000, 24));
		employee.add(new Employee(2, "Divya", "Engineering", 20000, 23));
		employee.add(new Employee(3, "Katyayani", "Development", 20000, 29));
		employee.add(new Employee(4, "Navin", "Production and Management", 20000, 26));
		employee.add(new Employee(5, "Gitika", "HR", 20000, 31));
		employee.add(new Employee(5, "Rajshri", "HR", 20000, 31));
		
		employee.stream().map(e->"Name: "+e.getName()+" Salary: "+e.getSalary()+"Salary increase by 20%: "+ (e.getSalary() + e.getSalary() * 0.20)).collect(Collectors.toList());
		List<String> li = employee.stream().map(e->"Name: "+e.getName()+" Salary: "+e.getSalary()+"Salary increase by 20%: "+ (e.getSalary() + e.getSalary() * 0.20)).collect(Collectors.toList());
		li.forEach(e->e.toString());
		StreamDemo5 streamDemo5 = new StreamDemo5();
		Long hrSumSalary = streamDemo5.deptWiseSumSalary(employee, "Development");
		System.out.println("Total salary of developers: "+ hrSumSalary);
		
		System.out.println("Details of Employees Department Wise: ");
		List<Employee> deptWiseDetails = employee.stream().sorted(Comparator.comparing(Employee::getDept)).collect(Collectors.toList());
		deptWiseDetails.forEach(System.out::println);
		
		System.out.println("");
	}
	
	
	
	
	Long deptWiseSumSalary(ArrayList<Employee> employees, String dept)
	{
		Long sumSal = employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		return sumSal;
	}
}
