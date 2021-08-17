package com.techment.NewFeatures;

import java.util.ArrayList;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		nums.stream().forEach(i -> System.out.println(i));
	}

}
