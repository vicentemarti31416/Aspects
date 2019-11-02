package com.example.aspects.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String name;
	private List<User> users;

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<User> getUsers() {
		users = new ArrayList<>();
		User juan = new User();
		User perico = new User();
		User andres = new User();
		juan.setName("juan");
		perico.setName("perico");
		andres.setName("andrés");
		users.add(juan);
		users.add(perico);
		users.add(andres);
		return users;
	}
}
