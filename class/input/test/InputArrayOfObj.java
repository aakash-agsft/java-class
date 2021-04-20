package input.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputArrayOfObj {
	public static void main(String[] args) throws IOException {
		try {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.print("How many employess you want?: ");
		int size = Integer.parseInt(br.readLine().trim());
		Employee emps[] = new Employee[size];
		for (int i = 0; i < emps.length; i++) {
			emps[i] = new Employee();
			System.out.print("Enter employee id: ");
			int employeeId = Integer.parseInt(br.readLine());
			System.out.print("Enter employee name: ");
			String employeeName = br.readLine();
			System.out.print("Enter employee salary: ");
			double employeeSalary = Double.parseDouble(br.readLine());
			emps[i].setId(employeeId);
			emps[i].setName(employeeName);
			emps[i].setSalary(employeeSalary);
		}
		System.out.println("Employee Details: ");
		for (int i = 0; i < emps.length; i++) {
			emps[i].printEmployee();
		}
		}catch(NumberFormatException e) {
			System.out.println("Please enter good data");
		}
	}
}
