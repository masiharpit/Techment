package com.techment.polymorphism;

class Hello{
	public void write(int i) {
		System.out.println("You have written numbers and number is "+ i);
	}
	
	public void write(String s) {
		System.out.println("You have written string and string is "+s);
	}
	
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
}
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello = new Hello();
		hello.write(3);
		hello.write("Welcome");
		hello.addition(3, 5);
		hello.addition(3, 5, 8);
	}

}
