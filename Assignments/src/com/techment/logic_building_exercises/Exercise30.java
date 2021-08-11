package com.techment.logic_building_exercises;

import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s = sc.nextLine();
		System.out.println("Number of characters in the String: "+s.length());
		System.out.println("First and Last character of the String and the position: "+s.charAt(0)+"->"+s.indexOf(s.charAt(0))+ s.charAt(s.length()-1) +"->"+s.indexOf(s.charAt(s.length()-1)));
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		s= s.toLowerCase();
		int count = 0;
		for(int j=0; j<s.length(); j++) {
			if(s.charAt(j) == 'a') {
				count++;
			}
		}
		System.out.println("A exists: "+count+" times.");
		sc.close();
	}

}
