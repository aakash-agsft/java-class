package interfae;

import java.sql.Statement;

public class InterfaceDemoFirst {
	public static void main(String[] args) {
		Shape s;
		s = new Circle(20);
		s.getArea();
		s.getData();
		s = new Square(25);
		s.getArea();
		s.getData();
	}
}
interface Shape{
	void getArea();
	void getData();
	double PI = 3.142;
}
interface CircularShape extends Shape{
	double circumference();
}//structure opertions

class DemoCircle implements CircularShape{

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 0;
	}
	
} 
class Circle implements Shape{
	private int radius;
	private double area;
	public Circle(int r) {
		radius = r;
	}
	public Circle() {
	
	}
	@Override
	public void getArea() {
		area =  PI*radius*radius;
	}

	@Override
	public void getData() {
		System.out.println("Radius: "+radius+ " Area: "+area);
	}
	
}
class Square implements Shape{
	private int side;
	private int area;
	public Square() {
		
	}
public Square(int side) {
		this.side = side;
	}
	@Override
	public void getArea() {
		area = side * side;
	}

	@Override
	public void getData() {
		System.out.println("Side: "+side+ " Area: "+area);
		
	}
}