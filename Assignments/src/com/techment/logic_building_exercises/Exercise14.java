package com.techment.logic_building_exercises;

public class Exercise14 {
	
	static void total_number_of_products(int[] product) {
		int sum = 0;
		for(int i=0; i<product.length; i++) {
			sum += product[i];
		}
		System.out.println("Total number of products: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] products = {24, 54, 67, 87, 23, 45, 98, 67, 85, 34, 65, 78};
		total_number_of_products(products);
	}

}
