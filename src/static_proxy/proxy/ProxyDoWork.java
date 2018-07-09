package static_proxy.proxy;

import static_proxy.DoWork;

public class ProxyDoWork implements DoWork{
	
	private  DoWork dowork;
	
	public ProxyDoWork(DoWork dowork) {
		super();
		this.dowork = dowork;
	}



	@Override
	public void doHomeWork() {
		System.out.println("before do ...");
		dowork.doHomeWork();
		System.out.println("after do ...");
	}

}
