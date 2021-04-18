package staticdemo;

public class StaticDemo {
	int id;
	String name;
 public static void main(String[] args) {
//	int x = Employee.employeeCount;
//	//int y = Employee.name;
//	//not allowed
//	
//	Employee.getCompanyName(); 
//	Employee e = new Employee();
//	//e.getId(), e.getName(), e.getEmployeeCount();
	Employee e = new Employee();
	Employee.employeeCount++;
	Employee e1 = new Employee();
	Employee.employeeCount++;
	Employee e2 = new Employee();
	Employee.employeeCount++;
	System.out.println(Employee.employeeCount);
	Employee.setEmployeeCount(5);
	System.out.println(Employee.employeeCount);
}
 public void show() {
	 
 }
}
class Employee{
	private int id;
	private String name;
    static int employeeCount;
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
	public static int getEmployeeCount() {
		return employeeCount;
	}
	public static void setEmployeeCount(int employeeCount) {
		Employee.employeeCount = employeeCount;
	}
	public static void getCompanyName() {
		System.out.println("TCS");
	}
}
