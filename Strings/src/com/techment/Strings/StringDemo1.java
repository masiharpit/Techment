package com.techment.Strings;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
