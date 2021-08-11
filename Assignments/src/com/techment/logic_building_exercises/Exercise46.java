package com.techment.logic_building_exercises;

public class Exercise46 {

	static int fact(int integer)
	{
		int factorial = 1;
		for(int i=2; i<= integer; i++)
		{
			factorial = factorial * i;
			
		}
		return factorial;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 6, 7, 4, 9};
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + fact(arr[i]);
		}
		System.out.println(sum);
	}

}
