package com.techment.ArrayFundamentals;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 32, 45, 65, 45, 56, 87};
		Arrays.parallelSort(arr);
		System.out.println("Smallest 2 numbers: "+ arr[0]+ " and "+arr[1]);
		System.out.println("Largest 2 numbers: "+arr[arr.length - 1]+ " and "+arr[arr.length-2]);
	}

}
