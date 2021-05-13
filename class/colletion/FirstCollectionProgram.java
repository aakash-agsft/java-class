package colletion;

import java.util.ArrayList;
import java.util.List;

public class FirstCollectionProgram {
	public static void main(String[] args) {
		List<Integer> nos = new ArrayList<Integer>();//int arr[]=new int[10];
		List<Integer> nos1 = new ArrayList<Integer>();
		nos1.add(2);
		nos1.addAll(nos);
		nos.add(1);//0
		nos.add(2);//1
		nos.add(3);//2
		System.out.println(nos);//not possible
		nos.remove(2);
		System.out.println(nos);
		System.out.println(nos.size());
		nos.add(2);
		System.out.println(nos.size());
		
		System.out.println(nos.size());
		nos.contains(3);
		//nos1 = [1,2,3,4,5]
		nos.containsAll(nos1);
		nos.equals(nos1);//equals() 
		System.out.println(nos);
		System.out.println(nos1);
		nos.retainAll(nos1);
		System.out.println(nos);
		
	}
	//int->Integer
	//dou-->Double
	
}
