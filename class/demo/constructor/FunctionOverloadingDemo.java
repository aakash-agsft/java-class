package demo.constructor;

public class FunctionOverloadingDemo {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.printData(112);
		demo.printData(new Circle());
		demo.printData(3.12);
		demo.printData(12, 32.23);
		demo.printData(32.12, 23);
		//this creates ambiguity
		//demo.printData(12, 13);
	}
}
class Demo{
	public void printData(int x) {
		System.out.println(x);
	}
	public void printData(long x) {
		System.out.println(x);
	}
	public void printData(double d) {
		System.out.println(d);
	}
	public void printData(int x, double y) {
		
	}
	public void printData(double x, int y) {
		
	}
	public void printData(Circle circle) {
		System.out.println(circle.getRadius());
	}//reliablity
}
