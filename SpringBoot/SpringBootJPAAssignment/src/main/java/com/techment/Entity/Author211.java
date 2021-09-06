package com.techment.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Author211")
public class Author211 {

	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	Set<Book211> book;

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
