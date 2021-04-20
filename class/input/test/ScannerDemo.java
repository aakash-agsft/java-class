package input.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	try {
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter you number: ");
//	int n = sc.nextInt();
//	System.out.println("Square of "+n+" is "+ n*n);
	Employee employee = new Employee();
	System.out.println("Enter emp id: ");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter empname: ");
	String name = sc.nextLine();
	System.out.println("Enter emp salary: ");
	double salary = sc.nextDouble();
	employee.setId(id);
	employee.setName(name);
	employee.setSalary(salary);
	System.out.println(employee.getEmp());
	sc.close();
	}catch (InputMismatchException e) {
		System.out.println("Please provide good data");
	}
}
}
