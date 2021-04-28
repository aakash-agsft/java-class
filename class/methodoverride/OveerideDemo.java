package methodoverride;

public class OveerideDemo {
public static void main(String[] args) {
	Figure f ;
	f = new Cube();
	f.setBreadth(12);
	//f.setDepth(12);
	f.setLength(12);
	System.out.println(f.getArea());
	f = new Triangle();
	f.setBreadth(12);
	f.setLength(10);
	System.out.println(f.getArea());
}
}
class Figure{
	double length;
	double breadth;
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return 0;
	}
}
class Cube extends Figure{
	double depth;
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getArea() {
		return length * breadth * depth;
	}
}
class Triangle extends Figure{
	public double getArea() {
		return 0.5 * length * breadth;
	}
}