package demo.constructor;

//defaut cons
//param cons
//this keyword
//finalize
//array
public class Circle {
	private double radius;
	private double area;
	private double circumference;
	//private String name;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public void calculateArea() {
		this.area = 3.142 * this.radius * this.radius;
	}
	public void calculateCircumference() {
		this.circumference = 2 * 3.142 * this.radius;
	}
}
