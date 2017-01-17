package com.mycomp.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public aspect Aspects {
	
	pointcut cover() : execution(* com.mycomp.main.App.printMessage(..));
	
	@Around("cover()")
	public Object aroundMethod(ProceedingJoinPoint jp){
		Object o = null;
		try{
			System.out.println("Before method invoked");
			System.out.println(jp.getSignature());
			jp.proceed();
			System.out.println("After method invoked");
		}catch(Throwable ex){
			System.out.println("Exception method invoked");
		}
		return o;
	}

}
