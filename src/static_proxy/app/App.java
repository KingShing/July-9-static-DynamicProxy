package static_proxy.app;

import static_proxy.delegate.DoWorkImpl;
import static_proxy.proxy.ProxyDoWork;

/**
 * 静动代理
 *  代理的好处:
 * 		代理使客户端不需要知道实现类是什么，怎么做的，而客户端只需知道代理即可（解耦合），
 * 		对于如下的客户端代码，new DoWorkImpl()可以应用工厂将它隐藏，下面只是举个例子而已
 *  缺点(相比于动态代理):		
 * 		复用性差:1:一个接口需要一个写一个代理类
 * 				2:委托类实现的接口,代理类要全部再实现一遍
 * 		维护性差:接口中增删改,代理类也需要增删改
 * @author yejincheng
 *
 */
public class App {
	public static void main(String[] args) {
		ProxyDoWork proxyStudent = new ProxyDoWork(new DoWorkImpl());
		proxyStudent.doHomeWork();
	}
}
