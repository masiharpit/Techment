package com.techment.NewFeatures;

class Parent
{
	void phone()
	{
		System.out.println("Mi");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.phone();
		
		System.out.println("By using anonymous way");
		
		Parent parent2 = new Parent()
		{
			void phone()
			{
				System.out.println("Samsung");
			}
		};
		
		parent2.phone();
	}

}
