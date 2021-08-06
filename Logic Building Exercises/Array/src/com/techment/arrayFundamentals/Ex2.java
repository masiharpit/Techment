package com.techment.arrayFundamentals;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 45, 43, 23, 67, 86, 90, 12};
		Scanner sc = new Scanner(System.in);
		int search_element = sc.nextInt();
		int index = 0;
		for(int i = 0; i<arr.length; i++) {
			if(search_element == arr[i]) {
				index = i;
			}
		}
		if(index > 0) {
			System.out.println("Element found at index: "+index);
		}else {
			System.out.println("Element not found.");
		}
		
		sc.close();
	}

}
