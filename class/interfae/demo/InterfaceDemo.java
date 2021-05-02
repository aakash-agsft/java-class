package interfae.demo;

//interface Shape--> void area(); void getData();
//interface CorneredShape// void perimeter();
//interface CircularShape-->> PI , void circ(); also above methods
//class Square{}
//Class Circle{}
public class InterfaceDemo {
	public static void main(String[] args) {
		//levels:::
		//		<Shape(area(), getData())>	<CorneredShape(perimter())>
		//			<CircularShape(from shape, circum())>
		//		[Circle]---> <CircularShape>
		//		[Sqauare]---><Shape>,<CorneredShape>
		CircularShape cshape;
		cshape = new Circle(20);
		cshape.setArea();
		cshape.circumference();
		cshape.getData();
		
		CorneredShape corneredShape;
		corneredShape = new Square(20);
		corneredShape.setPerimeter();
		corneredShape.setArea();
		corneredShape.getData();
		//Assignment:
		//HRA=12% for hr, 15% for Manag, PF=0.10, TA, DA=0.20
		//<Employee> setSalary(), getData(), 
		//[Manager] setSalary()
		//[HR]    	setSalary()
	}
}