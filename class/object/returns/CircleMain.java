package object.returns;

public class CircleMain {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(100);
		Circle c1 = new Circle();
		c1.setCircleParams(c);
		Circle c2 = new Circle(1200);
		Circle c3 = c2.getCircleObject();
		System.out.println(c3.getRadius());
	}
}
