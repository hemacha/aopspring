package com.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect {
	@Pointcut("execution(public * *(..))")
	public void point1(){}
	@Before("point1()")
	public void welcome(){
		System.out.println("welcome to before advice");
	}
	@After("point1()")
	public void bye(){
		System.out.println("bye from after advice");
	}
	@Pointcut("execution(public * *w*())")
	public void point2(){}
	@Around("point2()")
	public void aroundadvice(ProceedingJoinPoint jt) throws Throwable{
		System.out.println("welcome to around advice");
		String m=(String) jt.proceed();
		System.out.println("bye from around advice "+m);
	}
	@Pointcut("execution(public * getS*(..))")
	public void point3(){}
	@AfterReturning(pointcut="point3()",returning="ob")
	public void success(Object ob){
		System.out.println("welcome to after returning advice "+ob);
	}
	@AfterThrowing(pointcut="point3()",throwing="ob")
	public void failure(Throwable ob){
		System.out.println("welcome to after returning advice "+ob);
	}
	
}
