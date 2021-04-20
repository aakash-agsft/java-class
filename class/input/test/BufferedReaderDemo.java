package input.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
public static void main(String[] args) throws IOException {
	try {
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
	String s = br.readLine();
	System.out.println(s);
	//Parsing
	int n = Integer.parseInt(br.readLine());
	double d = Double.parseDouble(br.readLine());
//	Float.parseFloat(s);
//	Long.parseLong(s;
//	Short.parseShort(s);
//	Boolean.parseBoolean(s);
	System.out.println("Int is : "+n+" Double is : "+d);
	}catch (NumberFormatException e) {
		System.out.println("Please enter valid data");
	}
}
}
