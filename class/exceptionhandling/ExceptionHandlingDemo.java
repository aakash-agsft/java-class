package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number: ");
	try {
	int x = Integer.parseInt(br.readLine());
	if(x>10) {
		ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
		throw e;//manualy through the exception
		//it is used to throw custom exceptions
	}
	int arr[] = {1, 2, 3, 4, 5};//arr[0] to arr[4]
	System.out.println(arr[5]);
	//1. First creates ArrayIndexOut.. Object
	//2. Fill the exception details
	//3. Throws it by skipping all the further lines.
	//4. It seaches the exception in the catch blocks
	//5. If found it excutes the catch block
	//if not it terminates the program by giving exception msg
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number: ");
	int x1 = sc.nextInt();
	}catch (InputMismatchException e) {
		System.out.println("Catched in Input Mistacch");
	}catch(IOException e) {
		System.out.println("Catched in IOException");
	}catch(NumberFormatException e) {
		System.out.println("Catched in Number format");
	}
}
}
