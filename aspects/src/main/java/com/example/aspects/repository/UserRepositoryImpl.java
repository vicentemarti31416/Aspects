package com.example.aspects.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.aspects.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	private User user;
	
	@Autowired
	public UserRepositoryImpl(User user) {
		super();
		this.user = user;
	}


	@Override
	public User findUserByPosition(int position) {
		return user.getUsers().get(position);
	}

}
