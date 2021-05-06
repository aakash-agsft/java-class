package custom.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Date;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Student s = new Student();
		try {
		s.acceptDetails();//Per   Exception e = new Perc...();
		System.out.println(s);
		}catch(PhoneNumberImproperException ex) {
			ex.printStackTrace();
		}
		catch(PercentageInAppropriateException e){
			//System.out.println(e.getMessage());
			//1-12--->0-11
			e.printStackTrace();
		}catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}
	}
}
class Student{
	int id;
	String name;
	double percentage;
	String hobby;
	String phoneNo;
	String gender;
	Date dateOfBirth;
	
	public void acceptDetails() throws IOException, PercentageInAppropriateException, PhoneNumberImproperException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter id: ");
		id = Integer.parseInt(br.readLine());
		System.out.print("Enter name: ");
		name  = br.readLine();//Mr. Miss. Ms.
		if(!(name.startsWith("Mr.") || name.startsWith("Miss.") || name.startsWith("Ms.")))
			throw new NameNotProperException("Name is not containing preffix");
		System.out.print("Enter percentage: ");
		percentage = Double.parseDouble(br.readLine());
		if(percentage < 0 || percentage > 100)
			throw new PercentageInAppropriateException("Percentage should be within 0 to 100 only");
		System.out.print("Enter hobby: ");
		hobby = br.readLine();
		System.out.print("Enter phone: ");
		phoneNo = br.readLine();
		//"8830134387"
		if (phoneNo.length() != 10)
			throw new PhoneNumberImproperException("Phone number consists of 10 digits");
		System.out.print("Enter gender(M,m,F,f): ");
		gender = br.readLine();
		System.out.print("Enter dd mm yyyy: ");
		int dd = Integer.parseInt(br.readLine());
		int mm = Integer.parseInt(br.readLine());
		int yyyy = Integer.parseInt(br.readLine());
		dateOfBirth = new Date(yyyy, mm, dd);
		System.out.println("Data Accepted");
	}
	public String toString() {
		String s = "Id: "+id+"\nName: "+name+" Percentage: "+percentage;
		s = s + "\nHobby: "+hobby+"\nPhone No: "+phoneNo+"\nGender: "+gender+"\nDate of birth: "+dateOfBirth;
		return s; 
	}
}
//1. try: wereever exception can arise{}
//2. catch: is used to catch the thrown exception
//3. finally: its alwys excuted. whether exception occurs or not
//4. throw: it is used to throw any exeption manually
//e.g: throw new IOExeption();
//5. throws: method info: the method might throw the folowoing exception,
//So yiu have to manage/ handle the exception.(checked Excption) 
//Only RuntimeExeption and it's family(unchecked) rest all are checked


//1. Exception: - Checked
//2. RuntimeException: Unchecked
class PhoneNumberImproperException extends Exception{
	public PhoneNumberImproperException(String msg) {
		super(msg);
	}
}

class PercentageInAppropriateException extends Exception{
	public PercentageInAppropriateException(String msg) {
		super(msg);
	}
}

class NameNotProperException extends RuntimeException{
	public NameNotProperException(String msg) {
		super(msg);
	}
}
//Steps
//1. create a class for exception and extend it as per functimality
//2. 



//1 1 1 1 1
//2 2 2 2
//3 3 3
//4 4
//5


//Gender: 

//int accept
//-ve throw 
//2 nos try a/b;
//String (search *) if presesnt if not then print