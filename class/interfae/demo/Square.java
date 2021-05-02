package interfae.demo;

public class Square implements CorneredShape{
	private int side;
	private int perimeter;
	private int area;
	public Square() {
	}
	public Square(int s) {
		side = s;
	}

	@Override
	public void setPerimeter() {
	perimeter = 4*side;	
	}

	@Override
	public void setArea() {
		area = side * side;
	}

	@Override
	public void getData() {
		System.out.println("Side: "+side);
		System.out.println("Perimeter: "+perimeter);
		System.out.println("Area: "+area);
	}
	
}
