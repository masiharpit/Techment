package com.techment.relation;

class Employee
{
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void displayEmployeeInfo() {
		System.out.println("ID"+id);
		System.out.println("Name"+name);
		System.out.println("Address"+address.doorNo);
		System.out.println("Address"+address.streetName);
		System.out.println("Address"+address.city);
		System.out.println("Address"+address.pincode);
		
	}
	
}

class Address
{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	
	public Address(int d, String s, String c, int p) 
	{
		this.doorNo = d;
		this.streetName = s;
		this.city = c;
		this.pincode = p;
	}
	
}
public class HasArelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address(12, "54", "Bhilai", 490009);
		Employee emp = new Employee(1, "Arpit", addr);
		
		emp.displayEmployeeInfo();
	}

}
