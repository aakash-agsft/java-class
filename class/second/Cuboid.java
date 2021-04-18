package second;

import first.Box;

public class Cuboid {
	public static void main(String[] args) {
		Box b = new Box();
		double d = b.width;
		// only public member can be accessed as it is outside package and non subclass
	}

}
