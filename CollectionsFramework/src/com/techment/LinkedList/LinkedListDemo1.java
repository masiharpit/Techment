package com.techment.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.addFirst(100);
		
		ll.addLast(101);
		ll.add(5);
		System.out.println("Linked List: "+ll);
		ll.removeLast();
		System.out.println("After removing last element: "+ll);
	}

}
