package varargs;

import baltej.code.Employee;

public class VarArgsDemo {
	public static void main(String[] args) {
		Utility u = new Utility();
		//hw many
		int array[] = new int[2000];
		//initilaize
		u.print(10, 12, 13, 14 ,15);
		System.out.println("second call");
		u.print("Aakash","Aklesh","Rajput");
		System.out.println("second call");
		u.print(12.4f, 12, 14, 16);
		//u.print(); this creates ambiguity
		//varargs; variable arguments
		//varible args are used to get input of our length
	}
}
class Utility{
	public void print(float f, int y,int... x)// varargs 0 to nth
	{	//print(12,12,12,13.6)
		//whenever using parms with varsg alwys use varag at last
		for (int a : x) {
			System.out.println(a);
		}
	}
	public void print(String...s) {
		for(String x : s)
			System.out.println(x);
	}
	public void print(Employee...e) {
		for(Employee emp : e) {
			//all operation to be performed
		}
	}
}
