package string;

public class StringTest {
	public static void main(String[] args) {
		String s = "Java is a great programming language";
		String s1 = "Java";
		System.out.println(s.charAt(12));
		//if the index out of range then we get StringIndexOutOfBoundsException
		System.out.println("Length of string: "+s.length());
		System.out.println(s.substring(0, 6));
		//it extracs string from start to end-1
		System.out.println(s.substring(4));
		//it extracts from start to end extreme
		System.out.println(s.contains("Java"));
		//it checks for a given string ispresent or not
		System.out.println(s1.equals("Java"));
		//equals checks for equality
		System.out.println(s1.equalsIgnoreCase("java"));
		//checks if the string is empty
		//s1 = "";
		System.out.println(s1.isEmpty());
		System.out.println(s.concat(s1));//it is same as s+s1
		//it replaces the given char to new char given
		System.out.println(s.replace("Java", "C"));
		System.out.println("Original string: "+s);
		//indexOf of any char or any string
		//if there are multiple letters, it gives the first occurance
		//if not found it gives -1
		System.out.println(s.indexOf("p"));
		System.out.println(s.indexOf("z"));
		System.out.println(s.indexOf("lang"));
		System.out.println(s.indexOf("a", 4));
		//it is same as indexOf but it searches from back
		System.out.println(s.lastIndexOf("a"));
		//uppercase
		System.out.println(s.toUpperCase());
		//lowercase
		System.out.println(s.toLowerCase());
		//trailing and leading spaces
		System.out.println(s.trim());
		//compareTo()
		String x = "uaabc";
		String y = "aaa";
//		if(x.compareTo(y)>0)
//			System.out.println("Not sorted");
//		else {
//			System.out.println("Sorted");
//		}
		System.out.println("Compare to " +x.compareTo(y));
		
		//static functions in String
		int x1 = 10;
		float f= 3.12f;
		String sample = "my string";
		System.out.println(String.format("Int value: %d float value: %f String is %s", x1,f,sample));
	}
}
