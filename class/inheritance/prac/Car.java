package inheritance.prac;

public class Car extends Vehicle{
	double mileage;
	int capacity;
	public Car(int id, String name, String color, double mileage, int capacity) {
		super(id, name, color);
		this.mileage = mileage;
		this.capacity = capacity;
	}
	public Car() {
		
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String toString() {
		String s = super.toString();
		return s + "\nMileage: "+mileage+"\nCapacity: "+capacity+" people(s)";
	}
}
