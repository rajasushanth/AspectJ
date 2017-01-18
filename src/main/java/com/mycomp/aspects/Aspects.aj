package com.mycomp.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

public aspect Aspects {
	
	//This poincut advises all the classes which implements the interface ending with DAO
	pointcut cover() : execution(* *.*.*.*DAO+.*(..));
	
	/*@Around("cover()")
	public Object aroundMethod(ProceedingJoinPoint jp){
		Object o = null;
		try{
			System.out.println("Before method invoked");
			System.out.println(jp.getSignature());
			o = jp.proceed();
			System.out.println("After method invoked");
		}catch(Throwable ex){
			System.out.println("Exception method invoked");
		}
		return o;
	}*/
	
	before() : cover() {
		System.out.println("In Before method");
		System.out.println(thisJoinPoint.getSignature().getDeclaringType()+ "::" + thisJoinPoint.getSignature().getName());
	}
	
	after() returning() : cover() {
		System.out.println(thisJoinPoint.getSignature());
		System.out.println("In After method");
	}
	
	after() throwing() : cover() {
		System.out.println(thisJoinPoint.getSignature());
		System.out.println("In Exception method");
		
	}

}
