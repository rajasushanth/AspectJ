package com.comcast.aspects;

public aspect Aspects {
	
	pointcut cover() : call(* com.comcast.main.App.printMessage());
	
	before() : cover() {
		System.out.println("Before method invoked");
	}
	
	after() : cover() {
		System.out.println("Before method invoked");
	}

}
