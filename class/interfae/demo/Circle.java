package interfae.demo;

public class Circle implements CircularShape{

	private int radius;
	private double area;
	private double circumference;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(int r) {
	radius = r;
	}
	@Override
	public void setArea() {
	area = PI * radius * radius;	
	}

	@Override
	public void getData() {
		System.out.println("Radius: "+radius);
		System.out.println("Circumference: "+circumference);
		System.out.println("Area: "+area);
	}

	@Override
	public void circumference() {
		circumference = 2 * PI * radius;
	}

}
