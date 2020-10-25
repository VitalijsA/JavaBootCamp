package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {

	public Connection createConnection()
	{
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/employees?characterEncoding=latin1&useConfigs=maxPerformance";
		String user = "root";
		String pass = "123ikonas";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public Employee findEmployeeById(String id)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
		// 1 - Create a PreparedStatement with a query
		PreparedStatement pst = con.prepareStatement("Select emp_no,first_name,last_name from employees where emp_no = ?");

		// 2 - Search for the given id
		pst.setString(1,id);

		// 3 - Execute this query
		ResultSet rs = pst.executeQuery();
		
		// 4 - If result set is not null, then initialize emp object with data 
		if (rs.next()) {
			emp = new Employee();
			emp.setId(rs.getString(1));
			emp.setFirstName(rs.getString(2));
			emp.setLastName(rs.getString(3));
		}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	public ArrayList<Employee> findEmployeesByName(String name)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();		try {
		// 1 - Create a PreparedStatement with a query
			PreparedStatement pst = con.prepareStatement("Select emp_no,first_name,last_name from employees where first_name = ?");

		// 2 - Search for the given name
			pst.setString(1,name);
		// 3 - Execute this query
			ResultSet rs = pst.executeQuery();
		
		// 4 - While there are some records, continue 
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getString(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				list.add(emp);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<Employee> findEmployeesBySalary(String salary)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
		// 1 - Create a PreparedStatement with a query
			PreparedStatement pst = con.prepareStatement("Select emp_no,from_date,to_date,salary from salaries where salary = ?");
		// 2 - Search for the given salary
			pst.setString(1,salary);
		// 3 - Execute this query
			ResultSet rs = pst.executeQuery();
		// 4 - While there are records, continue 
		while (rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getString(1));
			emp.setDateFrom(rs.getString(2));
			emp.setDateUntil(rs.getString(3));
			emp.setSalary(Integer.parseInt(rs.getString(4)));
			list.add(emp);
		}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public void insertEmployee(Employee emp)
	{
		Connection con = createConnection();
		try {
		//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
		PreparedStatement pst = con.prepareStatement("insert into employees values(?,?,?,?,?,?)");
		con.setAutoCommit(false);

		//	Substitute the ? now.
		pst.setString(1,emp.getId());
		pst.setString(2, emp.getDateFrom());
		pst.setString(3, emp.getFirstName());
		pst.setString(4, emp.getLastName());
		pst.setString(5, emp.getGender());
		pst.setString(6, emp.getDateFrom());
		//2 - Execute this query using executeUpdate()
		pst.executeUpdate();
		con.commit();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
