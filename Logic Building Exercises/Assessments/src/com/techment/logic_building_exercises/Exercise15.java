package com.techment.logic_building_exercises;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {10, 20, 30, 50, 50, 60, 70, 80, 90};
		int [] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int flag = 0;
		if(arr1.length == arr2.length) {
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<arr2.length; j++) {
					if(arr1[i] == arr2[j]) {
						flag = 1;
					}else {
						flag = 0;
					}
				}
			}
		}else {
			flag = 0;
		}
		if(flag ==1 ) {
			System.out.println("The two arrays are same.");
		}else {
			System.out.println("The two arrays are not same.");
		}
	}

}
