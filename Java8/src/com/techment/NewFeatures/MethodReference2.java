package com.techment.NewFeatures;

@FunctionalInterface
interface Calculate2
{
	int add(int a, int b);
}

class Add
{
	int addition(int a, int b)
	{
		return a+b;
	}
}

class Subtract
{
	int Subtract(int a, int b)
	{
		return a- b;
	}
}

class CalculationUtil 
{
	int addition (int a, int b)
	{
		return a + b;
	}
	
	static int subtract(int a, int b)
	{
		return a - b;
	}
}
public class MethodReference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate2 cal = (a, b) -> a+b;
		System.out.println(cal.add(4, 5));
		
		Calculate2 cal2 = (a,b) -> a-b;
		System.out.println(cal2.add(12, 4));
		
		Add add = new Add();
		Calculate2 c1 = add::addition;
		System.out.println(c1.add(2, 4));
		
		Subtract sub = new Subtract();
//		Calculate2 c2 = sub::subtract;
//		System.out.println(c2.add(5, 4));
		
		CalculationUtil calculationUtil = new CalculationUtil();
		
		Calculate2 calc1 = calculationUtil::addition;
//		Calculate2 calc2 = calculationUtil::subtract;
		
		System.out.println(calc1.add(7, 8));
//		System.out.println(calc2.add(10, 5));
		
		
		Calculate2 calc3 = CalculationUtil::subtract;
		System.out.println(calc3.add(18, 8));
	}

}
