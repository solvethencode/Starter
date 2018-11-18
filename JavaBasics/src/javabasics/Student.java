package javabasics;

public class Student {
	//fields, instance variables, global variables 
	private String firstName;
	private String lastName;
	private String studentId;
	private String country="USA";
	//class variable = static variable
	static String schoolName="My School";
	
	/********  Constructors *******/
	public Student() {}
	public Student(String firstName,String lastName,String studentId ) {		
		this.firstName=firstName;
		this.lastName=lastName;
		this.studentId=studentId;		
	}
	
	static String getSchoolAddress()
	{
		//local var
		int a=4;
		return "Address";
	}
	
	
	/********  Getters/Setters *******/
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
	
	
	
	

}
