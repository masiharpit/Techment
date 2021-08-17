package com.techment.NewFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() > o2.getAge())
			return 1;
		
		return -1;
	}
	
}
public class StreamSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Arpit", "Development", 20000, 24));
		employee.add(new Employee(2, "Divya", "Development", 20000, 23));
		employee.add(new Employee(3, "Katyayani", "Development", 20000, 29));
		employee.add(new Employee(4, "Navin", "Development", 20000, 26));
		employee.add(new Employee(5, "Gitika", "Development", 20000, 31));
		
		employee.forEach(System.out::println);
		
		System.out.println("After Sorting by age:");
		employee.stream().sorted(new AgeComparator()).forEach(System.out::println);
		
		System.out.println("Sorting by using ComparingInt:");
		employee.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		
		System.out.println("Sorting by using ComparingInt in Reverse Order:");
		employee.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);
		
		System.out.println("After Sorting by Name:");
		List<Employee> emp = employee.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		emp.forEach(System.out::println);
	}

}
