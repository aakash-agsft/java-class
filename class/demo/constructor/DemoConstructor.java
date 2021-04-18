package demo.constructor;

public class DemoConstructor {
	public static void main(String[] args) {
		//default constructor
		Circle circle = new Circle();
		circle.setRadius(100);
		circle.calculateArea();
		System.out.println("Area of circle is : "+circle.getArea());
		circle.calculateCircumference();
		System.out.println("Circumference of circle is: "+circle.getCircumference());
		//parameterized constructor
		Circle circle2 = new Circle(50);
		circle2.calculateArea();
		System.out.println("Area of circle is : "+circle2.getArea());
		circle2.calculateCircumference();
		System.out.println("Circumference of circle is: "+circle2.getCircumference());
		
	}

}
