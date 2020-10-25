package finalActivity;

public class Person {

	//Attributes
	private String name;
	private int age;
	
	//Behavior
	public Person() {
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws CustomException {
		if (name.matches(".*\\d.*")) throw new CustomException();
		else this.name = name;
	}

	public String introduce(){
		return "My name is " + name + "and i am " +age+ " years old";
	}
	
}
