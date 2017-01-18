package com.mycomp.aspects;

public aspect Aspects {
	
	//This poincut advises all the classes which implements the interface ending with DAO
	pointcut cover() : execution(* *.*.*.*DAO+.*(..));
	
	before() : cover() {
		System.out.println(thisJoinPoint.getSignature().getDeclaringTypeName()+ "::" + thisJoinPoint.getSignature().getName()+" - Enters");
	}
	
	after() returning() : cover() {
		System.out.println(thisJoinPoint.getSignature().getDeclaringTypeName()+ "::" + thisJoinPoint.getSignature().getName()+" -Exists");
	}
	
	after() throwing() : cover() {
		System.out.println(thisJoinPoint.getSignature().getDeclaringTypeName()+ "::" + thisJoinPoint.getSignature().getName()+" -Exists with exception");
	}
	
	
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
}
