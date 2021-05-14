package colletion;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		//legacy Class
		//1. Vector--> elements store
		//2. Hashtable --> table
		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(12);//add()
		vector.removeElement(23);//remove()
		vector.capacity();//size()
		vector.firstElement();//vector class
		//Vector is thread safe(synchronized)
		//-->Thread1 
		//				vector,ArrayList
		//-->Thread2 
	}
}
