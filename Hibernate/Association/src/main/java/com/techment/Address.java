package com.techment;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

	@Id
	int doorNo;
	String streetName;
	String city;
	public Address(int doorNo, String streetName, String city) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
	}
	public Address() {
		super();
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
