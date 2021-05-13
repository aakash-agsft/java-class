package colletion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Shape interface
//Shape s = new Square();
public class ListMethodsDemp {
public static void main(String[] args) {
	List<Integer> nos = new ArrayList<Integer>();
	nos.add(12);
	nos.add(13);
	//String a = "aabaca"
	//a.indexOf('a')-->0
	//a.indexof('z')-->-1
	nos.add(14);
	//List works on indexes
	nos.add(1, 34);//addAll(index, Colection);
	System.out.println(nos.get(2));
	nos.set(2, 21);
	System.out.println(nos.indexOf(212));
	System.out.println(nos);
}
}
