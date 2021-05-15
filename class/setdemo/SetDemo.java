package setdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	set.add(12);
	set.add(13);
	set.add(14);
	set.add(15);
	set.add(9);
	set.add(7);
	set.add(9);
	set.add(0);
	set.add(345);
	System.out.println(set);
	
	Set<String> setS = new HashSet<String>();
	setS.add("xyz");
	System.out.println(setS.add("abc"));
	System.out.println(setS.add("aadn"));//equals()
	System.out.println(setS);
	}
}
