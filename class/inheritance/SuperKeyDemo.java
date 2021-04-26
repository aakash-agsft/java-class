package inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SuperKeyDemo {
	public static void main(String[] args) throws IOException{
		try {
		Manager manager = new Manager();
		System.out.println(manager.getResponsibility());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name: ");
		String name = br.readLine();
		System.out.print("Enter age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("Enter employeeid: ");
		int employeeId = Integer.parseInt(br.readLine());
		System.out.print("Enter companyName: ");
		String companyname = br.readLine();
		System.out.print("Enter salary: ");
		double salary = Double.parseDouble(br.readLine());
		System.out.print("Enter department: ");
		String department  = br.readLine();
		Manager m = new Manager(department, employeeId, salary, companyname, age, name);
		m.printData();
		}catch(NumberFormatException e) {
			System.out.println("Wrong data");
		}
	}
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		
	}
	public void printData() {
		System.out.println("Name: "+name+"\nAge: "+age);
	}
}
class Employee extends Person{
	int employeeid;
	double salary;
	String companyname;
	public Employee(int employeeid, double salary, String companyname,String name, int age) {
		super(name, age);
		this.employeeid = employeeid;
		this.salary = salary;
		this.companyname = companyname;
	}
	public Employee() {
		
	}
	public String getResponsibility() {
		return "To work";
	}
	public void printData() {
		super.printData();
		System.out.println("Employee Id: "+employeeid+"\nSalary: "+salary+"\nCompany Name: "+companyname);
	}
}
class Manager extends Employee{
	String department;

	public Manager(String department, int employeeid, double salary, String companyName, int age, String name) {
		super(employeeid, salary, companyName, name, age);
		this.department = department;
	}
	public String toString() {
		return department;
	}
	public Manager() {
		
	}
	public void printData() {
		super.printData();
		System.out.println("Department: "+department);
	}
	public String getResponsibility() {
		return "To work, to manage";
	}
}
