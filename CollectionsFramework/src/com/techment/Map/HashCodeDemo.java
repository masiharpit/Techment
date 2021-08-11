package com.techment.Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(198, "Shin Chan", 5);
		Student student2 = new Student(199, "Kazama", 5);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		HashMap<Student, String> hm = new HashMap<Student, String>();
		hm.put(new Student(200, "Nobita", 13), "Standard-Xth");
		hm.put(new Student(201, "Shizuka", 13), "Standard-Xth");
		
		for(Entry<Student, String> student: hm.entrySet())
		{
			System.out.println(student);
		}
		
	}

}
