package com.techment.Test1;

class LessThanThreeCharacterException extends Exception
{
	public LessThanThreeCharacterException()
	{
		System.out.println("Name should not be less than three characters, enter proper name.");
	}
}
class Employees
{
	String firstName;
	String lastname;
	
	public Employees()
	{
		this.firstName = null;
		this.lastname = null;
	}
	public Employees(String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee: \n\tFirstName=" + firstName + "\n\tLast Name=" + lastname;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastname;
	}

	
}
public class Question3 {

	public static void main(String[] args) throws LessThanThreeCharacterException, NullPointerException {
		// TODO Auto-generated method stub
		Employees emp1 = new Employees("Boien", "Chen");
		Employees emp2 = new Employees();
		try 
		{
			if(emp1.getFirstName().length() < 3 || emp1.getLastName().length()<3)
			{
				throw new LessThanThreeCharacterException();
			}
			if(emp2.getFirstName().length() < 3 || emp2.getLastName().length()<3)
			{
				throw new LessThanThreeCharacterException();
			}
			if(emp1.getFirstName() == null || emp1.getFirstName() == null)
			{
				throw new NullPointerException();
			}
			if(emp2.getFirstName() == null || emp2.getLastName() == null)
			{
				throw new NullPointerException();
			}
		}catch(LessThanThreeCharacterException lttce)
		{
			System.err.println(lttce.getMessage());
		}catch(NullPointerException npe)
		{
			System.err.println(npe.getMessage());
		}
		
	}

}
