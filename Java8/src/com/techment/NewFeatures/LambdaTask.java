package com.techment.NewFeatures;

@FunctionalInterface
interface Largest
{
	String largestOfThreeNumbers(int a, int b, int c);
}
public class LambdaTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest largest = (a, b, c) ->
		{
			if(a>b && a>c)
				return a+" is largest";
			else if(b>a && b>c)
				return b+" is largest";
			
			else
				return c+" is largest";
		};
		System.out.println(largest.largestOfThreeNumbers(4, 6,2));
	}

}
