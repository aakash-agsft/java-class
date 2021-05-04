package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionThrowsDemo {
	public static void main(String[] args){//caller
		BufferedReader br = new BufferedReader(null);
		//throw new Exception();
		
		try {
			myDemoFunction();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void myDemoFunction() throws IOException{//calling
		//Some logic...
		///
		///
		//
		//
		//Exception is thrown(1. Checked)
		//throw new IOException();
		//
		
		someAnother();
		//throw new SQLException();
		BufferedReader br = new BufferedReader(null);
		String s = br.readLine();
		throw new NumberFormatException();
			//uncheckedd
	}
	public static void someAnother() throws IOException {

		BufferedReader br = new BufferedReader(null);
		String s = br.readLine();
		
	}
		//1. If the callig method is throwing checked exception, 
		//it must be handled. OR the caller method must handle
		//by adding to throws clause
	}
