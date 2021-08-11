package com.techment.Strings;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String courseName = "java";
		System.out.println("Course Name: "+courseName);
		
		courseName.concat(" programming");
		System.out.println("After Concat: "+courseName);
		
		courseName = courseName.concat("programming language");//we can assign
		System.out.println(courseName);
	}

}
