package exceptionhandling;

import java.io.IOException;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			//file use
			//database connection
			throw new ArithmeticException();
		}catch(NumberFormatException e) {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		finally {
			System.out.println("I am alwys executed");
		}
	}
}
