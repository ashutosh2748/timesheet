package com.cs544.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAdvice {
	
	private final Logger logger = LoggerFactory.getLogger(ServiceAdvice.class); 

	@After("execution(* com.cs544.controller.LoginController.*(..))")
	public void serviceLogging(JoinPoint joinPoint) {
		logger.info("Starting service: " + joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName());
		System.out.println("AOP working...");
	}
	
}
