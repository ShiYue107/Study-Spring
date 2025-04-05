package com.mhys.demo.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CaremaAdvice {
	
	@Pointcut("execution(* com.mhys.demo..*Service.*(..))")
	public void pc() {}
	@Before("pc()")
	public void beforeAdvice() {
		System.out.println("摄像头监控中！");
	}
	@AfterReturning("pc()")
	public void afterReturningAdvice() {
		System.out.println("摄像头已经记录用户行为！");
	}
}
