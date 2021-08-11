package com.techment.Test1;

abstract class Animal{
	
	abstract void shout();
	
}

class Dog extends Animal{

	@Override
	void shout() {
		System.out.println("Bhow-bhow-bhow...");
	}
	
	
}

class Horse extends Animal{

	@Override
	void shout() {
		System.out.println("Neeeigghhhh.....");
	}
	
	
}


class Cat extends Animal{
	
	@Override
	void shout() {
		System.out.println("Meow....");
	}
}

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Cat();
		animal.shout();
	}

}
