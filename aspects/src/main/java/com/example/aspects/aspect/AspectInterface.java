package com.example.aspects.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;

public interface AspectInterface {

	void beforeFindUser();

	void afterFindUser();

	void afterReturning();

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

	void throwingException();

}