
public class Student {
/**
 * Student POJO that represents student
 * Objects can be initialized using constructors or getters/setters
 * */
	private String firstName;
	private String lastName;
	private String studentId;
	
	//******************Constructors Start ***************
	public Student() {
		// TODO Auto-generated constructor stub	
	}
	public Student(String firstName, String lastName) {
		// TODO Auto-generated constructor stub	
		this.firstName=firstName;
		this.lastName=lastName;
	}
	//******************Constructors End ***************
	
	
	//******************Getters and Setters Start ***************
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	//******************Getters and Setters Start ***************
	

}
