package com.inheritance;

class College{
	protected String course = "Engineering";
	
	void show(){
		System.out.println("College of " + course);
	}
}

class Department extends College{
	String branch = "CSE";
	
	void show(){
		System.out.println(branch+ " branch in "+ super.course + " College.");
		super.show();
	}
	
}
public class SinlgeLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dept = new Department();
		dept.show();
	}

}
