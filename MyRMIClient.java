import java.rmi.Naming;

public class MyRMIClient {

	public static void main(String[] args) throws Exception {
		System.setProperty("java.security.policy", "client.policy");
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		String url = "rmi://localhost/";
		MyRMIOBject o = (MyRMIOBject) Naming.lookup(url + "root");
		System.out.println(o.getLowerCase("AbCdEfG"));

//		o.addToList("Salem");
//		o.addToList("Marek");
//		o.addToList("Adam");
//		System.out.println(o.getList());

		// ADD ...
		o.addStudent("Salem", 25, 5000);
		o.addStudent("Karol", 25, 1100);
		o.addStudent("Ada", 22, 1400);
		System.out.println(o.getStudentList());
		
		// REMOVE ...
		o.removeStudent(1);
		System.out.println(o.getStudentList());
		
		// UPDATE ...
		o.updateStudent(1, "Ada", 23, 2500);
		System.out.println(o.getStudentList());
	}
}