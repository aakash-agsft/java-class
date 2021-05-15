package setdemo;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetdemo {
public static void main(String[] args) {
	Set<String> sets = new TreeSet<>();
	sets.add("zakir");
	sets.add("anshuman");
	sets.add("hari");
	sets.add("faiz");
	System.out.println(sets);
	SortedSet<Integer> ints = new TreeSet<>();
	ints.first();
	ints.last();
	ints.comparator();
	ints.headSet();
	ints.spliterator();
}
}
