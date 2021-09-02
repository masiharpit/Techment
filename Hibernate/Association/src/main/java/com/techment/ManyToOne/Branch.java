package com.techment.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Branch")
public class Branch {

	@Id
	int id;
	String branchName;
	
	public Branch(int id, String branchName) {
		super();
		this.id = id;
		this.branchName = branchName;
	}
	public Branch() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
}
