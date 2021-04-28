package abstarct;

public class AbstarctDemo {
public static void main(String[] args) {
    Person p;
    final String name = "Aakash";
	p = new Employee(1, "Aakash", 23000);
	p.printData();
	p = new Student(2, "Amat", 87);
	p.printData();
	//name = "Java" not allowed because name is final now
	String s = name + " Rajput";
	XYZ x = new XYZ();
	System.out.println(x.getClass());
}
}
 // 1. To make overriding compulsory
//2. To skip the base method definition

abstract class Person{
	int id;
	String name;
	public Person() {
		
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public final void impmethod() {
		//imp logic
		//business cals
	}
	public abstract void printData();
}
class Employee extends Person{
	double salary;
	public Employee() {
		
	}
	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	
	public void printData() {
		System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary);
	}
//	public void impmethod() {
//		//imp logic
//		//business cals this is not possibke in presence of final keyword
//	}
}
class Student extends Person{
	double percentage;
	public Student() {
		
	}
	public Student(int id, String name, double percentage) {
		super(id, name);
		this.percentage = percentage;
	}
	@Override //to our info
	public void printData() {
		System.out.println("Id: "+id+" Name: "+name+" Percenetage: "+percentage);
	}
}
class XYZ{
	
}
