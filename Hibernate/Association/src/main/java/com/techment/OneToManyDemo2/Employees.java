package com.techment.OneToManyDemo2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee02")
public class Employees {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int empId;
	String empName;
	String empDesignation;
	
	public Employees(int empId, String empName, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	
	public Employees(String empName, String empDesignation) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
	}

	public Employees() {
		super();
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	
}
