package demo.constructor;

public class TestingObjectAsParam {
	public static void main(String[] args) {
		
	}

}
class Employee{
	int id;
	String name;
	double salary;
	
	public void setEmployeeValues(Employee employee) {
		id = employee.getId();
		name = employee.getName();
		salary = employee.getSalary();
	}

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
	
}
