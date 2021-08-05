package com.superDemo;
class Parent{
	int a = 10;
}

class Child extends Parent{
	super(a);
	int b=20;
	
	void sum() {
		int a = 5;
		int c = a+a;
		System.out.println(c);
	}
	
}

public class parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
