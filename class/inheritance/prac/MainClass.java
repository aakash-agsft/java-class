package inheritance.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
	public static void main(String[] args) throws IOException {
		// First ask user what he wants? car or bike
		// then ask how many??
		// Accept all info
		// print all info
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			System.out.print("What do you want?(car/bike): ");
			String choice = br.readLine();// car or bike
			// whenever we are comparing strings always use equals()
			if (choice.equalsIgnoreCase("bike") || choice.equalsIgnoreCase("car")) {
				System.out.print("How many " + choice + " you want?");
				int size = Integer.parseInt(br.readLine());
				Vehicle v[];
				//Explanation: base b = new Drived();
				//b.execute();
				//b = new Derived2();
				//b.execute();
				//base b[] = new Derived[size];
				//base b[] = new Dervd2[size];
				//base b[];
				//b = new Bike[10];
				//b = new Car[10];
				if (choice.equalsIgnoreCase("bike")) {
					v = new Bike[size];
					System.out.print("Enter bike capacity: ");
					int tankCapacity = Integer.parseInt(br.readLine());
					Bike.tankCapacity = tankCapacity;
					for (int i = 0; i < v.length; i++) {
						System.out.print("Enter id: ");
						int id = Integer.parseInt(br.readLine());
						System.out.print("Enter name: ");
						String name = br.readLine();
						System.out.print("Enter color: ");
						String color = br.readLine();
						System.out.print("Enter model: ");
						String model = br.readLine();
						v[i] = new Bike(id, name, color, model);
					}
				} else {
					v = new Car[size];
					for (int i = 0; i < v.length; i++) {
						System.out.print("Enter id: ");
						int id = Integer.parseInt(br.readLine());
						System.out.print("Enter name: ");
						String name = br.readLine();
						System.out.print("Enter color: ");
						String color = br.readLine();
						System.out.print("Enter mileage: ");
						double mileage = Double.parseDouble(br.readLine());
						System.out.print("Enter capacity: ");
						int capacity = Integer.parseInt(br.readLine());
						v[i] = new Car(id, name, color, mileage, capacity);
					}
				}
				System.out.println("Your vehicle data");
				for (int i = 0; i < v.length; i++) {
					System.out.println(v[i]);
				}
			} else {
				System.out.println("Please provide proper choice");
				return;//this terminates the program
			}
		} catch (NumberFormatException e) {
			System.out.println("bad data");
		}
	}
}
