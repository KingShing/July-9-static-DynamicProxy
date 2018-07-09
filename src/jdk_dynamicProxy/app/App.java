package jdk_dynamicProxy.app;

import jdk_dynamicProxy.MyInvocationHandler;
import jdk_dynamicProxy.Sleep;
import jdk_dynamicProxy.Walk;
import jdk_dynamicProxy.delegate.RealObj2;
import jdk_dynamicProxy.delegate.RealObject;

public class App {
	/**
	 * 	注意: 
	 * 	①InvocationHandler调用处理程序和委托类(需要增强类)必须实现同一接口
	 *  ②返回的代理对象用上述接口接收 :  interfaceType obj = getProxyObj();
	 *  静态代理的缺点:
	 *     代理类和委托类实现了相同的接口，代理类通过委托类实现了相同的方法。
	 *     这样就出现了大量的代码重复。如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。
	 *     增加了代码维护的复杂度。
	 * 	动态代理的好处:
	 * 	   一个调用处理器可以做到一对多,而静态代理是多对多,动态代理提高代码复用性
	 * 	   即静态代理类只能为特定的接口服务
	 */
	public static void main(String[] args) {
		
		//真实对象
		RealObject object  = new RealObject();
		RealObj2 obj2 = new RealObj2();
		
		//注入真实对象,获得调用处理程序
		MyInvocationHandler myproxy = new MyInvocationHandler(object);
		MyInvocationHandler myproxy2 = new MyInvocationHandler(obj2);
		
		//获得代理对象,用接口接收
		Sleep s = myproxy.getProxy();
		Walk w1 = myproxy2.getProxy();
		
		//用代理对象调用接口方法
		s.sleep();
		int sum = s.sum(2, 3);
		System.out.println(sum);
		w1.walk();
	}
}
