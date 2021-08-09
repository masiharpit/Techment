package com.superDemo;
class Parent{
	int a = 10;
}

class Child extends Parent{
	
	int b=20;
	
	void sum() {
		int a = 5;
		int c = a+a;
		System.out.println(c);
		int d = super.a + a;
		System.out.println(d);
		int e = super.a + super.a;
		System.out.println(e);
		
	}
	
}

public class parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.sum();
	}

}
