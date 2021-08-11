package com.techment.relation;

class Car
{
	String name;
	String model;
	Engine engine;
	
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}

	void details()
	{
		System.out.println("Name: "+name+"\nModel: "+model+"\nEngine: \n\tEngine Type: "+engine.id+"\n\tEngine type: "+engine.type);
	}
}

class Engine
{
	int id;
	String type;

	public Engine(int id, String type)
	{
		this.id = id;
		this.type = type;
	}
}

public class CarHasEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine(32567, "V8");
		Car car = new Car("Lamborgini", "Urus", engine);
		
		car.details();
	}

}
