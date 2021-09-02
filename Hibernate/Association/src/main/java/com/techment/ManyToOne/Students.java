package com.techment.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student01")
public class Students {

	@Id
	int id;
	String name;
	@ManyToOne
	Branch branch;
	
	public Students(int id, String name, Branch branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	public Students() {
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

	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}
