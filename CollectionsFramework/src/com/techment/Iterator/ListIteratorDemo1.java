package com.techment.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		ListIterator<Integer> li = al.listIterator();
		System.out.println("Forward Direction: ");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("Backward Direction: ");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
