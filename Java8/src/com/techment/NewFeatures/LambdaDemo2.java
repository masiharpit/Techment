package com.techment.NewFeatures;

interface Calculation
{
//	void add(int a, int b);
	int add(int a, int b);
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculation calculation = (a, b) -> System.out.println("Result: "+ (a+b));
//		calculation.add(2, 3);
//		calculation.add(4, 5);
		
		Calculation calculation = (a, b) -> a+b;
		System.out.println(calculation.add(2, 3));
		
		Calculation calculation2 = (a, b) -> 
		{
			if(a>b)
				return a;
			return b;
		};
		
		System.out.println(calculation2.add(10, 20));
	}

}
