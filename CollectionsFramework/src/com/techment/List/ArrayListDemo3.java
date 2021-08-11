package com.techment.List;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("Elements of ArrayList: "+al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		al1.add(101);
		al1.add(103);
		al1.add(3);
		al.add(4);
		al1.addAll(al);
		System.out.println("Elements of Arrayist1: "+al1);
		al1.retainAll(al);
		System.out.println("Elements of ArrayList: "+al1);
		al1.removeAll(al);
		System.out.println("Elements of ArrayList"+al1);
		
	}

}
