package inheritance;

public class InheritanceDemo {
public static void main(String[] args) {
	
}
}
class PersonD{
	 int id;
	private String name;
	private int age;
	public void fun1() {
		System.out.println("From Person");
	}
}
class EmployeeD extends PersonD{
	private double salary;
	private String companyName;
	private int id;
	public void fun1() {
		System.out.println("From Employee");
	}
	//some code
	public void abc() {
		//random
		fun1();
		//i want to call super class fun1()
		super.fun1();
		System.out.println(id);
		System.out.println(super.id);
	}
}
