package com.uni.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionalManagement {
	
	@Pointcut("@kannotation(com.uni.annoatations.myTransaction)")
	public void p1() {}
	
	@Around("p1() ")
	public void Transaction(ProceedingJoinPoint pj) {
		System.out.println("Transactional begin");
		
		
		
		try {
			Object object=pj.proceed();
			System.out.println(object+"object data from business logic");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		System.out.println("Transaction ended");
	}
	

}
