package com.techment;

public class StudentDto {

	int studentId;
	String name;
	String branch;
	
	public StudentDto() {
		super();
	}
	
	public StudentDto(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	
	public StudentDto(int studentId, String name, String branch) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.branch = branch;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
