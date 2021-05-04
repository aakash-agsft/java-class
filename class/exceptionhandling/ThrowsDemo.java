package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsDemo {
	public static void main(String[] args) {
		DemoClass d = new DemoClass();
		try {
		d.acceptData();
		}catch(IOException e) {
			System.out.println("Exception Occured");
		}
		System.out.println(d.getData());
		d = null;
		System.out.println(d.getData());
		
	}//NullPointer is unchecked
}
class DemoClass{
	String s;
	
	public void acceptData() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
	}
	public String getData(){
		//null pointer
		//1. Circle c = null;-->>Circle c = new Circle();
		//c.getData()//--->NullPointerExeption
		return s;
	}
}
