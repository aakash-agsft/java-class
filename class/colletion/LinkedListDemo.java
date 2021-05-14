package colletion;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> names = new LinkedList<String>();
	names.add("Aakash");
	names.add("Amar");//Aakash Amar
	names.addFirst("First name");//First name, Aakash, Amar
	names.set(2, "Raghav");//F Aa Ra
	
	System.out.println(names);
	
}
}
