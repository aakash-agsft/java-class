package methodoverride;

public class OvverideDemo {
//	public static void main(String[] args) {
//		ABC a = new ABC();
//		a.m1();
//		XYZ x = new XYZ();
//		x.m1();
//		x.m2();
//		
//		//base class reference to derived obj
//		ABC b = new XYZ();//dynamic method dispatch
//		b.m1();
//		//b.m2(); gives error
//		//Steps followed by compiler
//		//1. compiler checks the referene
//		//2. checks the method or data present in the referense
//		//3. If not presnt gives error
//	}
	public static void main(String[] args) {
//		ABC a = new ABC();
//		a.m1();
//		XYZ x = new XYZ();
//		x.m1();
//		ABC b = new XYZ();
//		b.m1();
		Student s = new Student();
		s.setName("Aakash");
		s.setPercentage(82.76);
		System.out.println(s);
		
		Base a;
		a = new Base();
		a.m1();
		a = new Derived();
		a.m1();
		//Steps(During Run) Dynamic method dispatch
		//1. JVM checks the object(not refrence) method call
		//2. Is the mthod or member present in finded class??
		//3. If yes then from finded if no then from refrence
		//Runtime polymorhism
	}
}

class Base{
	public void m1() {
		System.out.println("I am from Base");
	}
}
class Derived extends Base{
	public void m1() {
		System.out.println("I am from Derived");
	}
}
class Student{
	String name;
	double percentage;
	public void setName(String name) {
		this.name = name;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String toString() {
		return "Name: "+name+" Percentage: "+percentage;
	}
}
