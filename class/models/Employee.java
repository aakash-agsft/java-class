package models;

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
