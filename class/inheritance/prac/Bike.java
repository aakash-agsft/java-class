package inheritance.prac;

public class Bike extends Vehicle{
	String model;
	static int tankCapacity;
	public Bike(int id, String name, String color, String model) {
		super(id, name, color);
		this.model = model;
	}
	public Bike() {
		
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public static int getTankCapacity() {
		return tankCapacity;
	}
	public String toString() {
		String s = super.toString();//s = "Id: 101,..;
		return s + "\nModel: "+model.toUpperCase()+"\n Tank Capacity: "+tankCapacity;//s =...Model =fx
	}
}
