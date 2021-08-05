package com.inheritance;

class Company{
	final String name = " M/STechment Technology Pvt. Ltd.";
	protected String location;
	
	public void details() {
		System.out.println(name + " in "+ location);
	}
}

class Department1 extends Company{
	private String dept;
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}

class Designation extends Department1{
	private int empID;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department1 dept = new Department1();
		dept.setDept("Engineering");
		dept.details();
		System.out.println(dept.getDept());
		
		Designation designation = new Designation();
		designation.setEmpID(123);
		System.out.println(designation.getEmpID());
		designation.setName("Bob Marley");
		System.out.println(designation.getName());
		designation.setDept("Operations");
		System.out.println(designation.getDept());
	}

}
