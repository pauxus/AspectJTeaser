package com.blackbuild.training.aspectj;


import com.blackbuild.training.aspectj.aspects.Trace;

public interface IGreeter {

	public abstract void sayHello(String name);

	@Trace
	public abstract void sayBye();

	@Trace
	public abstract String getValue();

}