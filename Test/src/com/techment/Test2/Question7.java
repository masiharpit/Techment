package com.techment.Test2;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(19);
		arrayList.add(24);
		arrayList.add(36);
		arrayList.add(89);
		arrayList.add(92);
		arrayList.add(75);
		arrayList.add(1);
		arrayList.add(56);
		arrayList.add(69);
//		arrayList.add(100);
		
		if(arrayList.size()==10)
		{
			List<Integer> arr1=arrayList.subList(0, 5);
			List<Integer> arr2=arrayList.subList(5, 10);
			System.out.println(arr1);
			System.out.println(arr2);
		}else if(arrayList.size()==11)
		{
			List<Integer> arr3=arrayList.subList(0, 6);
			List<Integer> arr4=arrayList.subList(6, 11);
			System.out.println(arr3);
			System.out.println(arr4);
		}
	}
}
