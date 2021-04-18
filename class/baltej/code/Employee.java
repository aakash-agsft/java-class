package baltej.code;

public class Employee {
	private int id;
	private String name;
	private Float basic;
	// Float ta;
	private double ta;
	private double pf;
	// Float pf;
	private double hra;
	// Float hra;
	// Float gross_salary;
	private double gross_salary;

	public Employee() {

		name = "Null";// not needed to initialize , can leave empty this constructor
		basic = 0.0f;
		ta = 0.0f;

	}

	public Employee(int id, String name, Float basic) {
		this.id = id;
		this.name = name;
		this.basic = basic;
	}

	// Function to get employee_id
	public int getemployee_id() {
		return id;
	}

	// Function to get employee_name
	public String getemployee_name() {
		return name;

		// Function to get employee_sal
	}

	public float getemployee_basic() {
		return basic;
	}

	// Function to set employee_id

	public void setemployee_id(int id) {
		this.id = id;
	}
	// Function to set employee_name

	public void setemployee_name(String name) {
		this.name = name;

	}
	// Function to set employee_sal

	public void setemployee_basic(float basic) {
		this.basic = basic;
	}

	public double calculate_sal() {
		// float y; // for testing;
		// y = (15.0/100)*8000 ;
		// System.out.println(y);

		this.ta = 0.15 * getemployee_basic();
		// System.out.println(this.ta);

		this.hra = 0.25 * getemployee_basic();
		// System.out.println("this.hra);
		this.pf = 0.1 * getemployee_basic();
		// System.out.println(this.pf);
		this.gross_salary = (this.ta + this.hra + getemployee_basic()) - this.pf;
		System.out.println(this.gross_salary);
		// testing
		// this.gross_salary =20.9f;

		return this.gross_salary;
	}

}