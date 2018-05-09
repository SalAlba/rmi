

import java.rmi.Naming;

public class MyRMIServer {

	public static void main(String[] args) throws Exception {
		MyRMIOBject o = new MyRMIOBjectImpl();
		Naming.rebind("root", o);
	}

}