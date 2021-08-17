package com.techment.NewFeatures;

interface A
{
	Student getStudentdetails();
}

class Student
{
	int id;
	String name;
	
	void display()
	{
		System.out.println("This is student info.");
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By using lambda
		A a1 = () -> {
			Student s = new Student();
			return s;
		};
		
		A a = () -> new Student();
		
		a.getStudentdetails().display();
		a1.getStudentdetails().display();
		
		//By using method reference
		A obj = Student::new;
		obj.getStudentdetails().display();
	}

}
