package com.techment.logic_building_exercises;

import java.util.ArrayList;

import java.util.List;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

class People{
	List<Person> peopleDB = new ArrayList<>();
	
	public boolean add(Person name) {
		return peopleDB.add(name);
	}
	
	public Person[] list() {
		Person[] person = new Person[peopleDB.size()];
		for(int i=0; i<peopleDB.size(); i++) {
			person[i] = peopleDB.get(i);
		}
		return person;
	}
}

public class Exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Joe");
		Person p2 = new Person("Steve");
		Person p3 = new Person("Smith");
		Person p4 = new Person("Bob");
		
		People people = new People();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		for(Person person : people.list()) {
			System.out.println(person.toString());
		}
	}

}
