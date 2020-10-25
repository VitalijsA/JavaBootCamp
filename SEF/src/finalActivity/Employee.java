package finalActivity;

import java.util.Comparator;

public class Employee extends Person implements Comparable<Employee>,Humanity { // Overriding compareTo method.
	
	private String company;
	private String jobtitle;
	private double salary;

	public Employee(String name, int age, String company, String jobtitle, double salary) throws CustomException {
		super.setName(name);
		super.setAge(age);
		this.company = company;
		this.jobtitle = jobtitle;
		this.salary = salary;
	}
	// write getter for company
	public String getCompany(){
		return company;
	}
	
	// write setter for company
	public void setSalary (String company) {
		this.company = company;
	}
	
	// write getter for  title
	public String getJobtitle() {
		return jobtitle;
	}
	
	// write setter for  title
	public void setTitle (String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public double getSalary(){
		return salary;
	}
	
	// write setter for company
	public void setSalary (double salary) {
		this.salary = salary;
	}
	public String introduce() {
		return "My name is " +super.getName()+", I am "+super.getAge()+" years old and I am working as a "+jobtitle+ " in "+company+".My salary is: "+salary;
	}
	@Override
	public int compareTo(Employee salary) {
		double compareSalary = ((Employee) salary).getSalary();
		return (int) (compareSalary - this.salary);
	}
	public static Comparator<Employee> EmpNameComparator = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {
		   String EmployeeName1 = e1.getName().toUpperCase();
		   String EmployeeName2 = e2.getName().toUpperCase();
		   //ascending order
		   return EmployeeName1.compareTo(EmployeeName2);
	    }};
}
