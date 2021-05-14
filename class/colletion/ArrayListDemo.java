package colletion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> ints = getList();
		List<Student> students = new ArrayList<Student>();
		Student s = new Student();
		s.setId(123);
		s.setName("Amar");
		students.add(s);
		Student s1 = new Student();
		s1.setId(234);
		s1.setName("Akshay");
		students.add(s1);
		Student s2 = new Student();
		s2.setId(456);
		s2.setName("Gita");
		students.add(s2);
		System.out.println(students);
		//for loop
		for(int i = 0 ; i < students.size(); i++) {
			Student std = students.get(i);
			
		}
		//array
		int array[] = {1, 2, 3,4,5};
		//for each int array
		for(int x : array) {
			
		}
		//foreach loop
		for(Student stdnt : students) {
			
		}
		//Collection's way
		
		
		//same as Student s[] = new Student[10];
		//s[i] = new Student();
		//s[i].setAge..
	}
	
	public static List<Integer> getList(){
		//
		//
		//
		if(true)
			return new ArrayList<Integer>();
		else
			return new LinkedList<Integer>();
	}

}
class Student{
	int id;
	String name;
	public Student(int i, String n) {
		id  = i;
		name = n;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Id: "+id+" Name: "+name;
	}
}