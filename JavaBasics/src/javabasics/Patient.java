package javabasics;

public class Patient {

	private String firstName;
	private String lastName;
	private String patientId;
	private String hospitalBranch;
	private String address="default addres";
    static String hospitalName="SEMA Hospital";
    	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getHospitalBranch() {
		return hospitalBranch;
	}
	public void setHospitalBranch(String hospitalBranch) {
		this.hospitalBranch = hospitalBranch;
	}
	public static String getHospitalName() {
		return hospitalName;
	}
	public static void setHospitalName(String hospitalName) {
		Patient.hospitalName = hospitalName;
	}
	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", patientId=" + patientId
				+ ", hospitalBranch=" + hospitalBranch +  ", hospitalName=" + hospitalName+"]";
	}
	
	
	
	
	

}
