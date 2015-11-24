package com.blackbuild.training.aspectj;



public class Main {

	public static void main(String[] args) {
		IGreeter greeter = new Greeter();
		greeter.sayHello("Dieter");
		greeter.sayBye();
	}

}
