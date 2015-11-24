package com.blackbuild.training.aspectj;




public class Greeter implements IGreeter {

	/* (non-Javadoc)
	 * @see com.blackbuild.demos.aspectj.IGreeter#sayHello(java.lang.String)
	 */
	@Override
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
	
	
	/* (non-Javadoc)
	 * @see com.blackbuild.demos.aspectj.IGreeter#sayBye()
	 */
	@Override
	public void sayBye() {
		System.out.println("bye");
	}
	
	
	/* (non-Javadoc)
	 * @see com.blackbuild.demos.aspectj.IGreeter#getValue()
	 */
	@Override
	public String getValue() {
		return "x";
	}
	
}
