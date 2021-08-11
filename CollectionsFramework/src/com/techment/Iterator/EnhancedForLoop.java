package com.techment.Iterator;

import java.util.ArrayList;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		for(Integer o: al)
		{
			System.out.println(o);
		}
	}

}
