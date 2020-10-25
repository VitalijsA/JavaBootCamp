package finalActivity;

public class Student extends Person implements Humanity {
	
	private String schoolName;

	public Student(String name, int age, String schoolName) throws CustomException {
		super.setName(name);
		super.setAge(age);
		this.schoolName = schoolName;
	}
	// write getter for school name
	public String getSchoolName(){
		return schoolName;
	}
	
	// write setter for school name
	public void setSchoolName (String schoolName) {
		this.schoolName = schoolName;
	}
	public String introduce() {
		return  "I study in "+schoolName;
	}
}