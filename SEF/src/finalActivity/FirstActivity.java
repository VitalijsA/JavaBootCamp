package finalActivity;
import java.io.FileWriter;
import java.util.Arrays;

public class FirstActivity {
	final String filepath="C:\\Users\\Vitalijs\\Desktop\\obj";
	public static void main(String[] args) throws CustomException {
		//Creating new Employee objects.
		Employee[] employeeList = new Employee[5];
		try {
			Employee a = new Employee("Raivis32131", 43, "Accenture", "Software tester", 51000); //Throws exception
		}
		catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		Employee a = new Employee("Janis Berzins", 43, "Accenture", "Software tester", 5000);
		Employee b = new Employee("Kristaps Upe", 26, "Accenture", "Software tester", 6000);
		Employee c = new Employee("Arturs Koks", 48, "Accenture", "Software tester", 7000);
		Employee d = new Employee("Zane Liepina", 24, "Accenture", "Software tester", 12000);
		Employee e = new Employee("Vitalijs Anisimovs", 21, "Accenture", "Software tester", 8000);
		employeeList[0] = a;
		employeeList[1] = b;
		employeeList[2] = c;
		employeeList[3] = d;
		employeeList[4] = e;
		System.out.println("List before sorting: ");
		printArray(employeeList);
		//Using override function which will sort employees by their salary in descending order
		Arrays.sort(employeeList);
		System.out.println("List after sorting by salary: ");
		printArray(employeeList);
		Arrays.sort(employeeList, Employee.EmpNameComparator);
		System.out.println("List after sorting by first name and second name: ");
		printArray(employeeList);
		WriteToTxtFile(employeeList);
	}
	public static void printArray(Employee[] a) { // Function to print all the array elements.
		for(Employee temp: a){
		   System.out.println(temp.introduce());
		}
	}
	public static void WriteToTxtFile(Employee[] employeeList) {
        try {
        	FileWriter myFile = new FileWriter("EmployeeList.txt"); 
			for(Employee temp: employeeList){
     		   myFile.write(temp.getName()+" "+temp.getAge()+" " + temp.getJobtitle()+ " " +temp.getCompany()+ " "+temp.getSalary()+ "\n");
     		}
			myFile.close();
        } catch (Exception e) {
        	System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
