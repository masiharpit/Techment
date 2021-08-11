package com.techment.List;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj = new ArrayList();
		obj.add("Sachin");
		obj.add(24.50);
		obj.add(1);
		System.out.println("Size of the Arrat List: "+obj.size());
		System.out.println("Objects in the List: "+obj);
		obj.add(1, "Hello");
		System.out.println("Object store in the index 1 is:"+obj);
	}

}
