package com.techment.Test1;

class Employee
{
	private String firstName;
	private String lastname;
	
	public Employee(String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee: \n\tFirstName=" + firstName + "\n\tLast Name=" + lastname;
	}


}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Mark", "Zuckerberg");
		Employee emp2 = new Employee("Elon", "Musk");
		Employee emp3 = new Employee("Sunder", "Pichayi");
		Employee emp4 = new Employee("Bill", "Gates");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		
	}

}
