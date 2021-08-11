package com.techment.ArrayFundamentals;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,5,8,9};
		int [] arr2 = {15, 3, 7, 12};
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		int length = arr1Length + arr2Length;
		int[] arr3 = new int[length];
		int pos=0;
		for(int element: arr1) {
			arr3[pos] = element; 
			pos++;
		}
		for(int element: arr2) {
			arr3[pos] = element;
			pos++;
		}
		System.out.println("New Array: "+ Arrays.toString(arr3));
		
	}

}
