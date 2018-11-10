
public class Student {
/**
 * Student POJO that represents student
 * Objects can be initialized using constructors or getters/setters
 **/
	// ssn has to be hidden
	public static String school="OUR SCHOOL";
	private String firstName;
	private String lastName;
	private String studentId;
	private String ssn;
	
	//******************Constructors Start ***************
	public Student() {
		// TODO Auto-generated constructor stub	
	}
	public Student(String firstName, String lastName,String studentId) {
		// TODO Auto-generated constructor stub	
		this.firstName=firstName;
		this.lastName=lastName;
		this.studentId=studentId;
	}
	
	public Student(String firstName, String lastName) {
		// TODO Auto-generated constructor stub	
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public Student(String studentId) {
		// TODO Auto-generated constructor stub	
		
		this.studentId=studentId;
	}
	//******************Constructors End ***************
	
	
	//******************Getters and Setters Start ***************
	
	public String getSsn()
	{
		return ssn;
	}
	
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
