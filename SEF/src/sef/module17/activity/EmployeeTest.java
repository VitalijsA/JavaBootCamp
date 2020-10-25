package sef.module17.activity;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeJDBC emp = new EmployeeJDBC();
		Employee emptest = new Employee();
		ArrayList<Employee> listByName = new ArrayList<Employee>();
		ArrayList<Employee> listBySalary = new ArrayList<Employee>();
		
		//Employees by name
		
		System.out.println("Employees by name: \n");
		listByName = emp.findEmployeesByName("Aron");
		for (Employee a : listByName) {
		System.out.println(a.id+ " " + a.firstName + " " +a.lastName);
		}
		System.out.println();
		
		//Employees by salary
		
		System.out.println("Employees by salary: \n");
		listBySalary = emp.findEmployeesBySalary("60177");
		for (Employee a : listBySalary) {
			System.out.println(a.id+ " " + a.getSalary() + " " + a.getDateFrom() + " " + a.getDateUntil());
		}
		System.out.println();
		
		//Employees by ID
		
		System.out.println("Employees by ID: \n");
		emptest = emp.findEmployeeById("10001");
		System.out.println(emptest.getId() + " " +emptest.getFirstName() +" " +emptest.getLastName() + " ");
		
		//Insert employee
		
		Employee vitalijs = new Employee();
		vitalijs.setFirstName("Vitalijs");
		vitalijs.setLastName("Anisimovs");
		vitalijs.setId("122132345");
		vitalijs.setDateFrom("1998-09-23");
		vitalijs.setGender("M");
		vitalijs.setSalary(10000);
		
		emp.insertEmployee(vitalijs);
	}

}
