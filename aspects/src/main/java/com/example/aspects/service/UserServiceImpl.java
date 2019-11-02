package com.example.aspects.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aspects.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public void showUserName() {
		System.out.println(userRepository.findUserByPosition(2).getName());
	}
	
	@Override
	public void forceFindFail() {
		userRepository.findUserByPosition(99);
	}

}
