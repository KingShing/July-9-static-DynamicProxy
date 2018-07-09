package static_proxy.delegate;
import static_proxy.DoWork;

public class DoWorkImpl implements DoWork {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void doHomeWork() {
		System.out.println("student is working..");
		
	}
	
}
