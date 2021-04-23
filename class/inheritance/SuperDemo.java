package inheritance;

public class SuperDemo {
	public static void main(String[] args) {
		//PersonS p = new PersonS();
		//EmployeeS e = new EmployeeS();
		//ManagerS m = new ManagerS(10, 12, 14);
		//System.out.println(m.printIds());
		ManagerS s = new ManagerS(10, 12, 14);
		
	}
}
class PersonS{
	int personid;
	public PersonS() {
		System.out.println("person object created");
	}
	public PersonS(int p) {
		personid = p;
	}
}
class EmployeeS extends PersonS{
	int employeeid;
	public EmployeeS() {
		super();
		System.out.println("Employee object created");
	}
	public EmployeeS(int e, int personid) {
		super(personid);
		employeeid = e;
	}
}
class ManagerS extends EmployeeS{
	int managerid;
	public ManagerS() {
		super();
		Systezm.out.println("Manager obj created");
	}
	public ManagerS(int managerid, int personid, int employeeid) {
		super(employeeid, personid);
		this.managerid = managerid;
	}
	public String printIds() {
		return personid+ " "+employeeid+" "+managerid;
	}
}
