package com.test;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Library")
public class Library {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	
	@OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
	Set<Book> book;

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

	
}
