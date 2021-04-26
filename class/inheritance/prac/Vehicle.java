package inheritance.prac;

public class Vehicle {
	int id;
	String name;
	String color;
	public Vehicle(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	public Vehicle() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "Id: "+id+"\nName: "+name.toUpperCase()+"\nColor: "+color.toUpperCase();
	}
}
