package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "USER")
@Entity
public class User {

	@Id
	private String id;
	
	private String name;
	
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
		
}
