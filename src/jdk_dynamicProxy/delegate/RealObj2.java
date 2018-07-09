package jdk_dynamicProxy.delegate;

import jdk_dynamicProxy.Walk;

public class RealObj2 implements Walk{

	@Override
	public void walk() {
		
		System.out.println("walk...");
	}

}
