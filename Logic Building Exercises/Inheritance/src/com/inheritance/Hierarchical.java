package com.inheritance;

class Car{
	void details() {
		System.out.println("Car.");
	}
}

class Petrol extends Car{
	void details() {
		System.out.println("Petrol Variant");
		super.details();
	}
}

class Diesel extends Car{
	void details() {
		System.out.println("Diesel Variant");
		super.details();
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.details();
		System.out.println("---------------------------------------------------");
		
		Petrol petrol = new Petrol();
		petrol.details();
		System.out.println("---------------------------------------------------");
		
		Diesel diesel = new Diesel();
		diesel.details();
	}

}
