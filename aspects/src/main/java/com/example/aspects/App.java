package com.example.aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aspects.service.UserService;
import com.example.aspects.service.UserServiceImpl;

public class App {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service = context.getBean(UserServiceImpl.class);
		service.showUserName();
		service.forceFindFail();
	}
}
