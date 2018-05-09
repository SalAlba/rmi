
import java.io.Serializable;
import java.rmi.RemoteException;

public class Student implements Serializable {

	// Fields ...
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double salary;

	// Constructor ...
	public Student(String name, int age, double salary) throws RemoteException {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// Get/Set ...
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// ...
	@Override
	public String toString() {
		return "Class Student [ " + name + "," + age + "," + salary + " PLN.]";
	}

}
