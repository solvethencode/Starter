package javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class PatientRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		Patient patient;
		List<Patient> patientsList=new ArrayList<Patient>();
		int id=0;
		do {
			patient=new Patient();
			System.out.println("First name :");
			patient.setFirstName(input.nextLine());
			System.out.println("Last name :");
			patient.setLastName(input.nextLine());
			System.out.println("Hospital branch :");
			patient.setHospitalBranch(input.nextLine());			
			patient.setPatientId(String.valueOf(id));
			patientsList.add(patient);
			System.out.println("Do you want to proceed? [YES/NO]");			
			
			if(!"YES".equalsIgnoreCase(input.nextLine()))
				break;			
		id++;
		}while(true);
		
		patient.hospitalName="MAYO Clinic";
		for (Patient p:patientsList)
		{
			System.out.println("Hospital :"+p.getHospitalName()+", Address : "+p.getAddress());
		}
		
		

	}

}
