package objectarray;

import object.returns.Circle;

import object.returns.Circle;

public class ObjectArrayDemo {
	public static void main(String[] args) {
//		Circle circle = new Circle();
//		//int arrayName[] = new int[SIZE];
//		Circle circleArray[] = new Circle[10];
//		circleArray[0] = new Circle();
//		circleArray[1] = new Circle();
//		int x [] = new int[10];
//		Circle circle2;
		Circle circleArray[] = new Circle[10];
		for(int i=0; i<circleArray.length ; i++) {
			circleArray[i] = new Circle();
			circleArray[i].setRadius(i);
			System.out.println(circleArray[i].getRadius());
		}
	}
}
