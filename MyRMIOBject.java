
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

interface MyRMIOBject extends Remote {
	String getLowerCase(String s) throws RemoteException;

	List<String> getList() throws RemoteException;

	void removeFromList(int index) throws RemoteException;

	void updateList(int index, String msg) throws RemoteException;

	void addToList(String msg) throws RemoteException;
	
	List<Student> getStudentList() throws RemoteException;

	void removeStudent(int index) throws RemoteException;

	void updateStudent(int index, String name, int age, double salary) throws RemoteException;

	void addStudent(String name, int age, double salary) throws RemoteException;
	

}