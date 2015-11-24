package com.blackbuild.training.aspectj.aspects;



import java.util.ArrayList;
import java.util.List;

public aspect Logger {

	List<String> hellos = new ArrayList<String>();
	
	// pointcut log() : execution(* *.*(..));
	
	pointcut one() : call(@Trace * *.*(..));
	
	pointcut say(String name) : execution(void *.sayHello(String)) && args(name);
	
	after(String name) : say(name) {
		System.out.println("in say: " + name);
	}

//	before() : log() {
//		System.out.println("Before " + thisJoinPointStaticPart);
//	}
	
	after() : one() {
		System.out.println("After");
	}
}
