
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

class MyRMIOBjectImpl extends UnicastRemoteObject implements MyRMIOBject {

	// ...
	private static final long serialVersionUID = 1L;
	 private ArrayList<Student> studentList = new ArrayList<Student>();
	private List<String> list = new ArrayList<String>();

	// ...
	public MyRMIOBjectImpl() throws RemoteException {
		System.out.println("Run sever !!!");
	}

	// ...
	@Override
	public String getLowerCase(String s) throws RemoteException {
		return s.toLowerCase();
	}

	@Override
	public List<String> getList() throws RemoteException {
		System.out.println("LOG : SEVER GET");
		return list;
	}

	@Override
	public void removeFromList(int index) throws RemoteException {
		System.out.println("LOG : SEVER REMOVE");
		list.remove(index);
	}

	@Override
	public void updateList(int index, String msg) throws RemoteException {
		System.out.println("LOG : SEVER UPDATE");
		list.set(index, msg);
	}

	@Override
	public void addToList(String msg) throws RemoteException {
		System.out.println("LOG : SEVER ADD");
		list.add(msg);
	}

	@Override
	public List<Student> getStudentList() throws RemoteException {
		System.out.println("LOG : SEVER GET STUDENTS");
		return studentList;
	}

	@Override
	public void addStudent(String name, int age, double salary) throws RemoteException {
		System.out.println("LOG : SEVER ADD STUDENT");
		studentList.add(new Student(name, age, salary));
	}

	@Override
	public void removeStudent(int index) throws RemoteException {
		System.out.println("LOG : SEVER REMOVE STUDENT");
		studentList.remove(index);
	}

	@Override
	public void updateStudent(int index, String name, int age, double salary) throws RemoteException {
		System.out.println("LOG : SEVER UPDATE STUDENT");
		studentList.set(index, new Student(name, age, salary));		
	}

}