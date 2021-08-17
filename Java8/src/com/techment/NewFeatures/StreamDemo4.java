package com.techment.NewFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(8);
		arrayList.add(15);
		arrayList.add(12);
		
		System.out.println(arrayList);
		arrayList.forEach(num -> System.out.println(num));
		arrayList.forEach(System.out::println);
		
		System.out.println("After sorting:");
		arrayList.stream().sorted().forEach(System.out::println);
	
		List<Integer> mySorted = arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println(mySorted);
		
		List<Integer> reverseSorted = arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSorted);
		
		
	}

}
