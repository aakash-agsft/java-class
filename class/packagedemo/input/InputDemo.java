package input;

import java.util.Scanner;

public class InputDemo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Employee e[] = new Employee[5];
	for(int i=0; i<e.length; i++) {
		e[i] = new Employee();
		System.out.print("Enter employee id: ");
		int empId = scanner.nextInt();
		System.out.print("Enter employee name: ");
		String empName = scanner.next();
		System.out.print("Enter emoployee salary: ");
		double empSalary = scanner.nextDouble();
		e[i].setId(empId);
		e[i].setName(empName);
		e[i].setSalary(empSalary);
	}
	for(Employee emp : e){
		System.out.println(emp);
	}
	scanner.close();
}
}
class Employee{
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmp() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public void printEmployee() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee saalary: "+salary);
	}
	
}
