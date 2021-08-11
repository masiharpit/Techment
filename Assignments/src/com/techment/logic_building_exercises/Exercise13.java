package com.techment.logic_building_exercises;

public class Exercise13 {
	
	static void max(int[] value) {
		int max = 0;
		for(int i=0; i<value.length; i++) {
			if(value[i] > max) {
				max = value[i];
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {45, 69, 24, 90, 81, 10, 5, 75, 98, 56, 34, 36};
		max(values);
	}

}
