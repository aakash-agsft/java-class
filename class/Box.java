
public class Box {
	private double height;
	private double width;
	private long depth;
	
	public Box() {
		
	}
	public Box(double height, double width, long depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public Box(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public long getDepth() {
		return depth;
	}

	public void setDepth(long depth) {
		this.depth = depth;
	}
	public void printAllData() {
		System.out.println("Dimensions are: "+this.height+" "+this.depth);
	}
	public void demoMethod(Box b) {
		
	}
}
