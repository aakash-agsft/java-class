class FirstClassDemo{
	public static void main(String args[]){
	Student student = new Student();
	student.setValue(1, "Ram", 80.50);
	student.printStudent();

	Student student2 = new Student();
	student2.setValue(2, "Shyaam", 80.50);
	student2.printStudent();


	}
}
class Student{
	int id;
	String name;
	double percentage;

	public void setValue(int i, String n, double p){
	id = i;
	name = n;
	percentage = p;
	}

	public void printStudent(){
	System.out.println("Id: "+id);
	System.out.println("Name: "+name);
	System.out.println("Percentage: "+percentage);
	}
}
