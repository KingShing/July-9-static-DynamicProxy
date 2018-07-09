package jdk_dynamicProxy.delegate;

import jdk_dynamicProxy.Sleep;

public class RealObject implements Sleep{

	@Override
	public void sleep() {
		System.out.println("我要睡觉了");
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

}
