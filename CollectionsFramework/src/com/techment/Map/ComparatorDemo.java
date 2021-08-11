package com.techment.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

class AgeSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age == o2.age)
			return 0;
		else if(o1.age > o2.age)
			return 1;
		return -1;
	}
	
}

class NameSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(154, "Raju", 5));
		studentList.add(new Student(178, "Chutki", 9));
		studentList.add(new Student(10, "Chota Bheem", 12));
		studentList.add(new Student(14, "Kaliya", 14));
		
		System.out.println("Before Name Sorting: ");
		for(Student s : studentList)
		{
			System.out.println(s.toString());
		}
		
		Collections.sort(studentList, new NameSorting());
		System.out.println("After Name Sorting: ");
		for(Student s : studentList)
		{
			System.out.println(s.toString());
		}
		
		System.out.println("Before Age Sorting: ");
		for(Student s: studentList)
		{
			System.out.println(s.toString());
		}
		Collections.sort(studentList, new AgeSorting());
		System.out.println("After Age Sorting: ");
		for(Student s : studentList)
		{
			System.out.println(s.toString());
		}
	}

}
