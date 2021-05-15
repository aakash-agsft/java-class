package setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCustomClassDemo {
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		Employee e = new Employee();
		e.setId(12);
		e.setName("Amar");
		employees.add(e);
		Employee e2 = new Employee();
		e2.setId(13);
		e2.setName("Raghav");
		employees.add(e2);
		Employee e3 = new Employee();
		e3.setId(12);
		e3.setName("Amar");
		employees.add(e3);
		System.out.println(employees);
		
		Set<Employee> emps = new LinkedHashSet<Employee>();
		Employee e4 = new Employee();
		e4.setId(12);
		e4.setName("Amar");
		emps.add(e4);
		Employee e12 = new Employee();
		e12.setId(13);
		e12.setName("Raghav");
		emps.add(e12);
		Employee e13 = new Employee();
		e13.setId(12);
		e13.setName("Amar");
		emps.add(e13);
		System.out.println(emps);
	}
}
class Employee{
	int id;
	String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Id: "+id+" Name: "+name;
	}//pending ??
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		//e2.equals(e3);
		if(this.id == e.id && this.name.equals(e.name))
			return true;
		else
			return false;
	}
}