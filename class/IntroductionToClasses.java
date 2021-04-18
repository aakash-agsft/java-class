import java.util.LinkedList;
import java.util.Stack;

public class IntroductionToClasses{
	public static void main(String[] args) {
		Box box = new Box();
		Box box1 = new Box(12, 12, 12);
		box1.printAllData();
		box.setDepth(123);
		box.setHeight(234);
		box.setWidth(456);
		int x = 10;
		if(x >3) {
			Box b1 = new Box();
			b1.setDepth(12);
		
		}
		box1 = null;
		box.demoMethod(new Box());
		if(true) {
			ForObjectClassDemo demoObj = new ForObjectClassDemo();
		}
		
		System.out.println("Box dimensions are: "+box.getHeight()+" "+box.getDepth()+" "+box.getWidth());
		
	}

}
