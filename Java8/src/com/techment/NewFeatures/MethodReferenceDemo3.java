package com.techment.NewFeatures;

@FunctionalInterface
interface LargeNumber
{
	int largest(int a, int b, int c);
}

class CalculationUtil1
{
	int largest(int a, int b, int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else 
			return c;
	}
}
public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargeNumber largeNumber = (a, b, c) -> 
		{
			if(a>b && a>c)
				return a;
			else if(b>c && b>a)
				return b;
			else
				return c;
		};
		System.out.println(largeNumber.largest(10, 30, 20));
		
		CalculationUtil1 calculationUtil = new CalculationUtil1();
		LargeNumber largenumber = calculationUtil::largest;
		System.out.println(largenumber.largest(14, 28,  7));
	}

}
