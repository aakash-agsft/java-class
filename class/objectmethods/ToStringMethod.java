package objectmethods;

public class ToStringMethod {
	public static void main(String[] args) {
		int x = 20;
		System.out.println(x);
		Integer x1 = 20;
		System.out.println(x1);
		String s = "Java";
		System.out.println(s);
		Employee employee = new Employee();
		employee.setId(12);
		employee.setName("Aakash");
		System.out.println(employee);
		//this will call toString() of the class, if the toString() method
		//is not defined it refers to the Object class implementation
	}
}
class Employee{
	private int id;
	private String name;
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
	@Override
	public String toString() {
		String result = "Employee Id: "+id+" Employee Name: "+name;
		return result;
	}
}
