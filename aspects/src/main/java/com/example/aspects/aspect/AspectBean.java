package com.example.aspects.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AspectBean {

	@Before("execution(public * com.example.aspects.service.UserServiceImpl+.showUserName())")
	public void beforeFindUser() {
		System.out.println("@Before");
	}
	
	@After("execution(public * com.example.aspects.service.UserServiceImpl+.showUserName())")
	public void afterFindUser() {
		System.out.println("@After");
	}
	
	@AfterReturning("execution(public * com.example.aspects.service.UserServiceImpl+.showUserName())")
	public void afterReturning() {
		System.out.println("@AfterReturning");
	}
	
	/**
	@Around("execution(public void com.example.aspects.service.UserServiceImpl+.forceFindFail())")
	public void aroundFail(ProceedingJoinPoint joinPoint) {
		System.out.println("@Around");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	*/
	
	@AfterThrowing("execution(public void com.example.aspects.service.UserServiceImpl+.forceFindFail())")
	public void throwingException() {
		System.out.println("@AfterThrowing");
	}
}
