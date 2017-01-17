package com.mycomp.aspects;

public aspect Aspects {
	
	pointcut cover() : call(* com.mycomp.*.*.*(..));
	
	before() : cover() {
		System.out.println("Before method invoked");
	}
	
	after() : cover() {
		System.out.println("Before method invoked");
	}

}
