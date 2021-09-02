package com.techment;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee01")
public class Employee {

	@Id
	int id;
	String name;
	String designation;
	
	@OneToOne 
	Address address;
	
	
	public Employee(int id, String name, String designation, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDestination() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
