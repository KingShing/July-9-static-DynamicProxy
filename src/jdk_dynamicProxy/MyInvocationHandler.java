package jdk_dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author yejincheng
 * 	调用处理程序
 * 	注意:
 * 	① 实现 java.lang.reflect.InvocationHandler 接口
 * 	② 存有被代理对象的引用
 * 	③ 
 */

public class MyInvocationHandler implements InvocationHandler{
	
	//被代理对象(需要增强的对象)
	private Object object;
	
	public MyInvocationHandler(Object object) {
		this.object = object;
	}
	
	//getProxy() 方法不是调用该类必须的方法,可以在客户端写
	
	@SuppressWarnings("unchecked")
	public <T> T getProxy() {
		/**
		 *  Proxy.newProxyInstance(classloader,interfaces,InvocationHandler)的参数解释
		 *  ① classloader 类加载器 ,一般使用被代理对象的类加载器
		 *  ② 接口数组 ,被代理对象所实现的接口数组
		 *  ③ 调用处理程序的实例
		 */
		return (T)Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxyObj, Method method, Object[] args) throws Throwable {
		/**
		 *  如果底层方法是静态的，那么可以忽略指定的 obj 参数。该参数可以为 null。
			如果底层方法所需的形参数为 0，则所提供的 args 数组长度可以为 0 或 null。 
			如果底层方法是静态的，并且尚未初始化声明此方法的类，则会将其初始化。
		 */
		//System.out.println(proxy.getClass());  //class com.sun.proxy.$Proxy0
		//System.out.println(method.getName());  //sleep
        
		System.out.println("before method");
        System.out.println("Method:" + method);
        
        Object res = method.invoke(object, args);	//invoke方法的object参数要从外部引入,否则陷入死循环
        
        System.out.println("after method");
       
        
        /**
         * 	return  res
         * 如果方法正常完成，则将该方法返回的值返回给调用者；如果该值为基本类型，则首先适当地将其包装在对象中。
			但是，如果该值的类型为一组基本类型，则数组元素不 被包装在对象中；换句话说，将返回基本类型的数组。
			如果底层方法返回类型为 void，则该调用返回 null
         */
        return res;  
	}


}
